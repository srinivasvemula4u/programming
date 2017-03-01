/* This Program is for Basic List Creation and Printing the List
This is the headerfile common for all Linked List operations because
for performing the operation we need List and after performing the operation effective
List has to be printed. These two things are defined here */
#include<stdio.h>
#include<conio.h>
/* Linked List*/
struct ListNode {
    int data;
    struct ListNode* next;
};
typedef struct ListNode Node;
void PrepareList();// List Creation Method
Node* CreateNode(int); // Individual node creation
void PrintList(Node*); // Printing the list
int ListLength(Node *); // Finding List Length
void InsertInLinkedList(Node **,int); // Insert Node into Linked List based on Position. After the position New node is going to be insertedS
void DeleteInLinkedList(Node**,int); // Delete Node from List based on Position
void DeleteLinkedList(Node**); // Delete Complete List
Node* head =NULL;
Node* current = NULL;
