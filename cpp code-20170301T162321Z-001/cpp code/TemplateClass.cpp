#include<iostream>
using namespace std;

template <typename T>
class CustomizableHuman
{
    public:
void SetAge (const T& newValue) { Age = newValue; }
const T& GetAge() const {return Age;}
private:
T Age; // T is type you choose to customize this template for!
};
int main()
{
CustomizableHuman<int> NormalLifeSpan; // instantiate for type int
NormalLifeSpan.SetAge(80);
cout<< NormalLifeSpan.GetAge()<<endl;
CustomizableHuman<long long> LongLifeSpan; // instantiate for type long long
LongLifeSpan.SetAge(3147483647);
cout<< LongLifeSpan.GetAge()<<endl;
CustomizableHuman<short> ShortLifeSpan; // instantiate for type short
ShortLifeSpan.SetAge(40);
cout<< ShortLifeSpan.GetAge()<<endl;
}

