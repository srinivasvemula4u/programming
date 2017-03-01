#include<iostream>
#include<bitset>
#include<string>

using namespace std;
int main()
{
    bitset<4> fourbits;
    cout<< "Intial contents of fourbits = "<< fourbits << endl;
    bitset<5> fivebits("10001");
    cout<< "Contents of fivebits = "<<fivebits<<endl;
    bitset <8> eightbits (255); // 8 bits initialized to long int 255
    cout << "Initial contents of eightBits: " << eightbits << endl;
    bitset <8> eightBitsCopy(eightbits);
    cout << "Initial contents of copy eightBits: " << eightBitsCopy << endl;
}
