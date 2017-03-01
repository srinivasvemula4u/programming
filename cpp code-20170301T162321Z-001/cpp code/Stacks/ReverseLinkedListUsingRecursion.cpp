
/* This Program is for single linked list and its operation like finding the lenght of the list. Insert Operation (Begin, Middle,End)
and Deleting Operations like Insert */
#include "LinkedList.h"
#include<cstdlib>
void PrepareList()
{
int data;
char ch;
Node* temp;
//printf("Enter the choice for first node\n");
//scanf("%d",&choice);
 do {
  printf("Enter the data for node \n");
  scanf("%d",&data);
  temp = CreateNode(data);
 if( !head && !current)
 {
     //printf("temp data if %d\n",temp->data);
 head=current=temp;
 //free(temp);
// head->data=current->data=temp->data;
 //head->next=current->next= NULL;
 }
 else{
    // printf("temp data else %d\n",temp->data);
     current->next = temp;
     current=temp;
     //free(temp);
     //current->data=temp->data;
     //temp;
 }
 printf(" Enter choice for another node by pressing \'y\' or \'n\'  \n");
 ch=getch();
 } while(ch != 'n');
}
/* This method for creating the node with data which has been called from main */
Node* CreateNode(int data)
{
    Node* temp;
    temp = (Node *)malloc(sizeof(Node));
    if(!temp)
        return NULL;
    temp->data= data;
    temp->next=NULL;
    return temp;
}
/* This method for printing the Creating List starts from Head */
void PrintList(Node* head)
{
    printf("Entered into PrintList\n");
    Node *temp;
    for(temp = head;temp;temp=temp->next)
    printf("%d--->",temp->data);
    printf("NULL\n");
}
/* Finding the number of nodes in List Time complexity is O(n)*/
int ListLength(Node *head)
{
    Node *temp = head;
    int count = 0;
    while(temp)
    {
        count++;
        temp=temp->next;
    }
    return count;
}
/* Insert New node based on Position  Time Complexity will become O(n)*/
void InsertInLinkedList(Node** head, int position)
{
    Node *new_node=NULL;
    // we need two node pointers which maintains current and previous nodes
    Node *current, *previous;
    // Traverse the list until position-1 for that we have to maintain count
    int data,count=1;
    printf("Enter the data of new node which is going to inserted into list \n");
    scanf("%d",&data);
    //current = head;
    new_node=CreateNode(data);
    if(position == 1)
    {
       new_node->next = *head;
       *head = new_node;
    }
    else
    {
        current = *head;
        while(current && (count <= position-1))
        {
            count++;
            previous=current;
            current=current->next;
        }
        // If current node is null means we reached end of list. so new node will be attached to previous next and new node next is set to null
        if(current == NULL) // Insertion at the end
        {
          previous->next = new_node;
          new_node->next=NULL;
        }
        else // Insert in the middle based on position
        {
            previous->next= new_node;
            new_node->next = current;
        }

    }
}
/* Node deletion based on the given position .Time Complexity O(n) and Space Complexity O(1) */
void DeleteInLinkedList(Node **head, int position)
{
    // Temporary Node for assiging the node to delete
    Node *temp;
    // Tracking Previous node and current node
    Node *previous,*current;
    int count=1;
    if(NULL == *head)
    {
    printf("List is empty\n");
    return;
    }
    if(1 == position) // Deletion in the beginning
    {
        temp = *head;
        *head= (*head) ->  next;
        free(temp);
    }
    else
    {
        current = *head;
        while(current && (count <= position-1))
        {
            count++;
            previous=current;
            current=current->next;
        }
        if( current == NULL)
        {
            printf("Position is not existed \n");
            return;
        }
        previous->next = current->next;
        free(current);
    }
}
/* Delete the entire list with the help of head node */
void DeleteLinkedList(Node **head)
{
    Node *temp;
    if(NULL == *head)
    {
        printf("List is empty\n");
        return;
    }
    while(*head)
    {
      temp= *head;
      *head = (*head) -> next;
      free(temp);
      PrintList(*head);
    }
    *head = NULL;
}
void ReverseLinkedList(Node **head)
{
    Node *temp= NULL,currnet =NULL;
    if(!(*head))
       return;
    temp = *head;
    *head = (*head) -> next;
    ReverseLinkedList(head);
    if(!head)
        *head = temp;
    else
    {
        (*head)->next = temp;
    }
   // return *head;
}
main()
{
    int position1,position2;
    PrepareList();
    PrintList(head);
    //printf("Enter the position of Node for Insertion \n");
    //scanf("%d",&position1);
    //InsertInLinkedList(&head,position1);
   // printf("List After Insertion \n");
   // PrintList(head);
    printf("Number of Nodes in the list = %d\n",ListLength(head));
   // printf("Enter the position of Node for Deletion \n");
  //  scanf("%d",&position2);
   // DeleteInLinkedList(&head,position2);
  //  printf("List After deletion \n");
  //  PrintList(head);
   // DeleteLinkedList(&head);
   ReverseLinkedList(&head);
   PrintList(head);

}

