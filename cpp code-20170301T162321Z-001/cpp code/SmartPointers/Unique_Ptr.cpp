#include<iostream>
#include<memory>

using namespace std;
class Fish
{
public:
    Fish()
    {
        cout << "Fish: Constructed!" << endl;
    }
    ~Fish()
    {
        cout << "Fish: Destructed!" << endl;
    }
    void Swim() const { if(this)cout << "Fish swims in water" << endl;}
};
void MakeFishSwim(const unique_ptr<Fish>& iFish)
{
    iFish->Swim();
    cout<<"Hello"<<endl;
}
void MakeFishSwimUsingauto(auto_ptr<Fish> iFish)
{

     iFish->Swim();
    //cout<<"Hello"<<endl;
}
int main()
{
    unique_ptr<Fish> smartFish(new Fish);
    auto_ptr<Fish> autoFish(new Fish());
    smartFish->Swim();
    autoFish->Swim();
    MakeFishSwim(smartFish);
    cout<<"......"<<endl;
    MakeFishSwimUsingauto(autoFish);
   // if(autoFish)
    autoFish->Swim();
    cout<<"Main Hello"<<endl;
}
