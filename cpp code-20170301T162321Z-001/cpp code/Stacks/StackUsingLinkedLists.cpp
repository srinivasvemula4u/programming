#include<iostream>
#include<string>
#include<climits>
#include<cstdlib>
using namespace std;
struct ListNode
{
  int data;
  struct ListNode *next;
};

void push(struct ListNode **top, int data)
{
    struct ListNode *temp;
    temp = new ListNode();
    temp->data = data;
    //temp->next = NULL;
    temp->next = *top;
    *top = temp;
}
bool IsEmpty(struct ListNode *top)
{
    return (top == NULL);
}
int Pop(struct ListNode **top)
{
    struct ListNode *temp;
    if(IsEmpty(*top))
        return INT_MIN;
    temp = *top;
    *top = (*top) -> next;
    int data = temp->data;
    delete temp;
    temp = NULL;
    return data;
}
int Top(struct ListNode* top)
{
    if(IsEmpty(top))
        return INT_MIN;
  else
    return top->data;

}
void DeleteStack(struct ListNode** top)
{
   struct  ListNode* p;
    p = (*top);
    while(p->next)
    {
        struct ListNode *temp = p->next;
        p->next = temp->next;
        delete temp;
    }
    free(p);
    *top = NULL;
}
int main()
{

}

