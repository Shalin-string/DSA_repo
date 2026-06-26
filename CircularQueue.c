#include<stdio.h>
#define Size 5

int queue[Size];
int front = -1;
int rear = -1;

void enqueue(int value)
{
       if ((front == 0 && rear == Size-1) || (rear == front-1))
       {
            printf("Queue is full\n");
       }
       else if (front == -1)
       {
            front = 0;
            rear = 0;
            queue[rear] = value;
       }
        else{
            rear++;
            queue[rear] = value;
        }       
       
}

void dequeue(){
    if (front == -1)
    {
        printf("Queue is empty\n");
    }
    else if (front == Size - 1)
    {
        printf("%d : removed : ",queue[front],"\n");
        front = 0;
        
    }
    else if (front == rear)
    {
        printf("%d : removed : ",queue[front],"\n");
        front = -1;
        rear = -1;
    }
    else
    {
        printf("%d : removed : ",queue[front],"\n");
    }
    front++;

}

void display()
{
    if (front == -1)
    {
        printf("Queue is empty\n");
    }
    else
    {
        for (int i = front; i <= rear; i++)
        {
            printf("%d ", queue[i]);
        }
        printf("\n");
    }
}       

void main()
{
    enqueue(1);
    enqueue(2);
    enqueue(3);
    enqueue(4);
    enqueue(5);
    display();
    dequeue();
    display();
    enqueue(6);
    display();
}
