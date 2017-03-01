#include<iostream>
#include<string>
using namespace std;

/* Method 1 using naive approach */
string RemovString2frmStringUsingNaive(string main,string mask)
{
    int index = 0,main_index=0;
    bool Flag;
    while(main[main_index]!= '\0')
    {
        Flag = false;
        int mask_index = 0;
        while( (mask[mask_index] != '\0') && !Flag)
        {
            if( mask[mask_index] == main[main_index]) {
                Flag = true;
                break;
            }
          mask_index++;
        }
        if( Flag == false)
        {
            main[index] =  main[main_index];
            index++;
        }
        main_index++;
    }
    main.erase(main.begin()+index,main.end());
    return main;
}
int main()
{
    string main("geeksforgeeks");
    string mask("mask");
    cout<<RemovString2frmStringUsingNaive(main,mask)<<endl;
}
