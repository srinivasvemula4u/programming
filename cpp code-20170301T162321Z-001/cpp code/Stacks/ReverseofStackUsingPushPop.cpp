#include<iostream>
#include<string>
#include<cstdlib>

using namespace std;

struct CStack
{
    int top;
    int capacity;
    int *arr;
};

struct CStack* createStack(int n)
{
    //struct CStack mStack = new CStack();
     struct CStack *mStack = (struct CStack *)malloc(sizeof(CStack));
     if(!mStack)
        return NULL;
     mStack->capacity = n;
     mStack-> top = -1;
     mStack->arr = new int[mStack->capacity];
     return mStack;
}
bool IsEmptyStack(struct CStack *aStack)
{
    return (aStack->top == -1);
}
bool IsFullStack(struct CStack *aStack)
{
    return (aStack->top == aStack->capacity-1);
}
void Push(struct CStack *aStack,int val)
{
    if(IsFullStack(aStack))
    {
        cout << "Stack is full" <<endl;
        return;
    }
    aStack->arr[++(aStack->top)] = val;
}
int Pop(struct CStack *aStack)
{
    if(IsEmptyStack(aStack))
    {
        cout << "Stack is empty" <<endl;
        return -1;
    }
    return aStack->arr[(aStack->top)--];
}
void PrintStack(struct CStack *aStack)
{
    for(int i=0;i <= aStack->top; i++)
        cout << aStack->arr[i] <<endl;
}
void DeleteStack(struct CStack *aStack)
{
    if(aStack)
    {
        if(aStack->arr)
            delete aStack;
      free(aStack);
      aStack = NULL;
    }
    if(!aStack)
        cout << "Stack deleted Successfully" <<endl;
}
void InsertAtBottom(int data,struct CStack *aStack)
{
    int temp;
    if(IsEmptyStack(aStack))
    {
        Push(aStack,data);
        return;
    }
    temp = Pop(aStack);
    InsertAtBottom(data,aStack);
    Push(aStack,temp);
}
void ReverseStack(struct CStack *aStack)
{
    int data;
    if(IsEmptyStack(aStack))
        return;
    data = Pop(aStack);
    ReverseStack(aStack);
    InsertAtBottom(data,aStack);
}
int main()
{
    struct CStack *aStack = createStack(10);
    Push(aStack,10);
    Push(aStack,20);
    Push(aStack,30);
    PrintStack(aStack);
    ReverseStack(aStack);
    cout << "Stack Elements are after Reversing "<<endl;
    PrintStack(aStack);

    //cout << "Poped element from stack "<<Pop(aStack) <<endl;
   // cout << "Poped element from stack "<<Pop(aStack) <<endl;

}
