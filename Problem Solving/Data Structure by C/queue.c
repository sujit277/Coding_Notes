#include<stdio.h>
#include<conio.h>
#define SIZE 5
void enqueue(int);
void dequeue();
void display();
int items[SIZE],front=-1,rear=-1;
void main()
{
dequeue();
enqueue(1);
enqueue(2);
enqueue(3);
enqueue(4);
enqueue(5);
enqueue(6);
display();
dequeue();
display();
}
void enqueue(int value)
{
if(rear==SIZE-1)
{
printf("Queue is Full\n");
}
else
{
if(front==-1)
{
front=0;
}
rear++;
items[rear]=value;
printf("inserted item is %d\n",value);
}
}
void dequeue()
{
if(front==-1)
{
printf("Queue is Empty\n");
}
else
{
printf("Deleted Item is %d\n",items[front]);
front++;
if(front>rear)
{
front=rear=-1;
}
}
}
//function to print the queue 
void display()
{
if(rear==-1)
{
printf("Queue is empty\n");
}
else
{
int i;
for(i=front;i<=rear;i++)
{
printf("Queue Elements are %d\n",items[i]);
}
}
}
 