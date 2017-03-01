#include<iostream>
 using namespace std;
 double Divide(int Dividend, int Divisor)
{
if(static_cast<int>(Divisor) == 0)
{
    cout<<"000"<<endl;
    throw "Dividing by 0 is a crime";

}

 return (Dividend / Divisor);
 }
int main()
 {
 cout << "Enter dividend: ";
double Dividend = 0;
 cin >> Dividend;
cout << "Enter divisor: ";
 double Divisor = 0;
 cin >> Divisor;
 try
{
 cout << "Result of division is: "<< Divide(Dividend, Divisor);
}
catch(const char* exp)
{
 cout << "Exception: " << exp << endl;
 cout << "Sorry, can’t continue!" << endl;
}
//return 0;
 }
