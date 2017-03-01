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
int main()
{
    struct CStack *aStack = createStack(10);
    Push(aStack,10);
    Push(aStack,20);
    Push(aStack,30);
    PrintStack(aStack);
    cout << "Poped element from stack "<<Pop(aStack) <<endl;
    PrintStack(aStack);
    cout << "Poped element from stack "<<Pop(aStack) <<endl;
     PrintStack(aStack);
     DeleteStack(aStack);

    //cout << "Poped element from stack "<<Pop(aStack) <<endl;
   // cout << "Poped element from stack "<<Pop(aStack) <<endl;

}
