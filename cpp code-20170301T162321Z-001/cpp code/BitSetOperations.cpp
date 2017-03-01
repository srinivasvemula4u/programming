#include<iostream>
#include<string>
#include<bitset>

using namespace std;

int main()
{
    bitset<8> inputbits;
    cout << "Enter a 8-bit sequence: ";
    cin >> inputbits;
    cout<< " Number of 1 bits u supplied =  ";
    cout<<inputbits.count()<<endl;
    cout<< "Number of 0 bits u supplied=   ";
    cout<<(inputbits.size() - inputbits.count())<<endl;
    bitset <8> inputFlipped (inputbits); // copy
    inputFlipped.flip();
    cout << "Flipped version is: " << inputFlipped << endl;
    cout << "Result of AND, OR and XOR between the two:" << endl;
    cout << inputbits << " & " << inputFlipped << " = ";
    cout << (inputbits & inputFlipped) << endl; // bitwise AND
    cout << inputbits << "| " << inputFlipped << " = ";
    cout << (inputbits | inputFlipped) << endl; // bitwise OR
    cout << inputbits << " ^ " << inputFlipped << " = ";
    cout << (inputbits ^ inputFlipped) << endl; // bitwise XOR
    return 0;
}
