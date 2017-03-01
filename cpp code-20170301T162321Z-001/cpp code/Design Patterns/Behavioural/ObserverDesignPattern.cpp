#include<iostream>
#include<set>

using namespace std;
// ---------------- Observer interface ----------------- - See more at: http://www.sourcetricks.com/2008/05/c-observer-patterm.html#.VNeER52Uf2c
class MyObserver
{
public:
        virtual void notify()=0;
};

class Myobservable
{
private:
        static Myobservable* observable;
        Myobservable() { };
        set<MyObserver*> observers;
public:
        static Myobservable* GetInstance();
        void AddObserver(MyObserver &o);
        void RemoveObserver(MyObserver &o);
        void NotifyObservers();
        void Trigger();
};

    Myobservable * Myobservable::observable = NULL;

    void Myobservable::Trigger()
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
        (*itr)->notify();
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
            }
        void notify()
        {
            cout << "Event Change Received" << endl;
        }
    };
    int main()
    {
        Myobservable *observer = Myobservable ::GetInstance();
        MyClass *myclass = new MyClass();
        observer->Trigger();
    }
