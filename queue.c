// circular queue implementation
#include <stdio.h>
#include <stdlib.h>

#define size 5
int queue[size];
int front = -1, rear = -1;

void enqueue(int data)
{
    if (rear == size - 1 && front == 0 )
    {
        printf("\nQueue Overflow\n");
        return;
    }else if(rear == front - 1){
        printf("\nQueue Overflow\n");
        return;
    }
    
    else if (rear == size - 1 && front != 0)
    {
        rear = 0;
        queue[rear] = data;
    }
    else
    {
        rear++;
        queue[rear] = data;
        if (front == -1)
            front = 0;
    }
}

void dequeue()
{
    if(front == -1)
    {
        printf("\nqueue underflow\n");
        return;
    }
    else if (rear == front)
    {
        front = -1;
        rear = -1;
    }
    else if (front == size - 1)
    {
        front = 0;
    }
    else
    {
        front++;
    }
    
}
void display()
{
    if (front == -1)
    {
        printf("\nQueue is empty\n");
    }
    else if (rear >= front)
    {
        for (int i = front; i <= rear; i++)
        {
            printf("%d ", queue[i]);
        }
    }
    else
    {
        for (int i = front; i < size; i++)
        {
            printf("%d ", queue[i]);
        }
        for (int i = 0; i <= rear; i++)
        {
            printf("%d ", queue[i]);
        }
    }
}
void main()
{
    int choice, num;
    while (1)
    {
        printf("\n0. Exit\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Display Queue\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 0:
            exit(0);
        case 1:
            printf("Enter data: ");
            scanf("%d", &num);
            enqueue(num);
            break;
        case 2:
            dequeue();
            break;
        case 3:
            display();
            break;
        default:
            printf("Invalid choice\n");
            break;
        }
    }
}