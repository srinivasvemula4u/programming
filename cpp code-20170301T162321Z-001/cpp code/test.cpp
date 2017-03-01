#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;
void fun(int *);
main()
{
 /*  int x= 25;
yours:
    if(x== 25)
    {
        cout<<"hey x =25";
    }
    else
    {
        cout<< "FUS";
    }
   //goto yours;*/
  // char c = "hello";
   //printf("character =%c",c);
   int a[] = { 1,2,3,4,5};
   char *s = "Helloworld" "\0";
   int *p;
   p= a;
   printf("adress of a=%u\n adress hold by pointer =%u, %u, %u,%u, %u,%d,%d\n", &a,p, a,&a+1,a+1,p++,p[1],*(a+1));
   printf("%s,%c, %d, %d,%c,%c\n",s, *s, sizeof(s),strlen(s),*s++);
   printf("%c",*s);
   fun(&a[4]);
}
void fun(int a[])
{
    printf("%d,%d,%d,%d\n",a[0],a[1],*(a+2),*(a-4));
}
