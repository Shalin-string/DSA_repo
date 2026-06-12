#include<stdio.h>
#include<stdlib.h>
#define size 5
int stack[size];
int top = -1;

void push(int data)
{
    if(top == size-1)
    {
        printf("Stack Overflow\n");
        return;
    }
    else
    {
        top++;
        stack[top] = data;
    }
}

void pop()
{
    if(top == -1)
    {
        printf("\nStack Underflow\n");
        return;
    }
    else
    {
        top--;
    }
}

void peek()
{
    if(top == -1)
    {
        printf("\nStack is empty\n");
        return;
    }
    else
    {
        printf("\nTop element is %d\n", stack[top]);
    }
}

void display()
{
    if (top == -1)
    {
        printf("\nStack is empty\n");
        return;
    }
    else
    {
        for(int i=top; i>=0; i--)
        {
            printf("%d ", stack[i]);
        }
    }
    
}

void main()
{
    int choice, num;
    while(1)
    {
        printf("\n0. Exit\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch(choice)
        {
            case 0:
                exit(0);
            case 1:
                printf("Enter data: ");
                scanf("%d", &num);
                push(num);
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            default:
                printf("Invalid choice\n");
        }
    }
}