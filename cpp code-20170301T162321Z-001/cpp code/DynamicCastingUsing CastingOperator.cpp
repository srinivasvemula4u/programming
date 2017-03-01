#include<iostream>

using namespace std;

class fish
{
public:
    fish()
    {
      cout<< "fish constructor"<<endl;
    }
    virtual ~fish()
    {
        cout << "fish distructor"<<endl;
    }
    virtual void swim()
    {
        cout<< "fish swims in sea"<<endl;
    }
};
class Tuna : public fish
{
public:
        Tuna()
        {
            cout<< "Tuna constructor"<<endl;
        }
        virtual ~Tuna()
        {
            cout<< "Tuna Destructor"<<endl;
        }
        virtual void swim()
        {
            cout<< "Tuna swims fast in sea"<<endl;
        }
         void dinner()
        {
            cout<< "Tuna is for dinner"<<endl;
        }
};
class capron :public fish
{
public:
        capron()
        {
            cout<< "capron constructor" <<endl;
        }
        virtual ~capron()
        {
            cout << "capron destructor" <<endl;
        }
        void lunch()
        {
            cout<< "capron is for lunc" <<endl;
        }
        virtual void swim()
        {
            cout<< "Capron swims slowly in lake"<<endl;
        }
};
void  DynamicBindig(fish* pfish)
{
      Tuna *pTuna = dynamic_cast<Tuna *>(pfish);
      if(pTuna)
      {
          pTuna->dinner();
          //return;
      }
      capron *pcapron = dynamic_cast<capron *>(pfish);
      if(pcapron)
      {
          pcapron->lunch();
          //return;
      }
      pfish->swim();
}
int main()
{
    {

 Tuna ctuna;
 capron ccapron;
 DynamicBindig(&ctuna);
 DynamicBindig(&ccapron);
    }
 cout << "******" << endl;
 fish *cfish = new fish();
 capron *ccapron1 = (capron *)cfish;
 ccapron1->lunch();
 ccapron1->swim();
 delete cfish;
 cout << "******" << endl;
 capron *ccapron2 = new capron();
 fish *cfish1 = ccapron2;
 //cfish1->lunch();
 cfish1->swim();
 delete ccapron2;
}
