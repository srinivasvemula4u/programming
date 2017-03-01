#include<iostream>
#include<set>
#include<string>
#include<vector>

using namespace std;
// ---------------- Observer interface ----------------- - See more at: http://www.sourcetricks.com/2008/05/c-observer-patterm.html#.VNeER52Uf2c
class MyObserver
{
public:
        virtual void notify(vector<int>)=0;
};

class Myobservable
{
private:
        int h,w,age;
        static Myobservable* observable;
        Myobservable():h(0),w(0),age(0) { };
        set<MyObserver*> observers;
public:
        static Myobservable* GetInstance();
        void AddObserver(MyObserver &o);
        void RemoveObserver(MyObserver &o);
        void NotifyObservers();
        void trigger();
        void setH(int h)
        {
            this->h = h;
             trigger();
        }
        int getH()
        {
            return h;
        }
        void setW(int w)
        {
            this->w = w;
            trigger();
        }
        int getW()
        {
            return w;
        }
        void setAge(int age)
        {
            this->age = age;
            trigger();
        }
        int getAge()
        {
            return age;
           // trigger();
        }
};

    Myobservable * Myobservable::observable = NULL;

    void Myobservable::trigger()
    {
        NotifyObservers();
    }

    Myobservable* Myobservable::GetInstance() {
    if ( observable == NULL )
        {
            observable = new Myobservable();
        }
    return observable;
    } //- See more at: http://www.sourcetricks.com/2008/05/c-observer-patterm.html#.VNeER52Uf2c
    void Myobservable::AddObserver(MyObserver &o)
    {
        observers.insert(&o);
    }
    void Myobservable::RemoveObserver(MyObserver& o)
    {
        observers.erase(&o);
    }
    void Myobservable::NotifyObservers()
    {
        set<MyObserver*>::iterator itr;
        for ( itr = observers.begin(); itr != observers.end(); itr++ )
        {
            vector<int> vectInt;
            vectInt.push_back(getH());
            vectInt.push_back(getW());
            vectInt.push_back(getAge());
           (*itr)->notify(vectInt);
        }

    } //- See more at: http://www.sourcetricks.com/2008/05/c-observer-patterm.html#.VNeER52Uf2c

    class MyClass : public MyObserver
    {
    private :
            Myobservable *observer;
    public:
            MyClass()
            {
                observer = Myobservable ::GetInstance();
                observer->AddObserver(*this);

                //observer.set(info);
            }
            void UpdateObservable(string sub, int val)
            {
                 if(sub == "height")
                {
                    observer->setH(val);
                }
                else if(sub == "weight")
                {
                    observer->setW(val);
                }
                else if(sub == "age")
                {
                    observer->setAge(val);
                }
                else
                {
                    cout<< "Pussy" ;
                }
            }
        void notify(vector<int> vectInt)
        {
            for(int i = 0; i < vectInt.size(); i++)
            {
                 cout << vectInt[i] << " ";
            }
           cout << endl;
        }
    };
    int main()
    {
        Myobservable *observer = Myobservable ::GetInstance();
        MyClass *h = new MyClass();
        MyClass *w = new MyClass();
        MyClass *a = new MyClass();
        h->UpdateObservable("height",5);
        w->UpdateObservable("weight",65);
        a->UpdateObservable("age",23);
       // observer->Trigger();
    }
