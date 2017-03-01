#include<iostream>
using namespace std;
enum{
   COLOR_BLACK,
    COLOR_RED,
    COLOR_BLUE,
    COLOR_GREEN,
    COLOR_WHITE,
    COLOR_CYAN,
    COLOR_YELLOW,
    COLOR_MAGENTA

};
int main()
{
    cout << COLOR_WHITE;
    int** arr = new int*[10];
    for(int i=0; i<10; i++)
        arr[i] = new int[10];
    int* a = new int[10];
}
