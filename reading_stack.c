#include <stdio.h>
#include <string.h>

#define SIZE 10

char stack[SIZE];
int top = -1;

void push(char ch)
{
    if (top == SIZE - 1)
    {
        printf("Stack is overflow\n");
    }
    
    stack[++top] = ch;
}

char pop()
{
    if (top == -1)
    {
        printf("Stack is underflow\n");
    }
    
    return stack[top--];
}

void display()
{
    while(top != -1)
    {
        printf("%c", pop());
    }
}

int main()
{
    char str[SIZE];

    printf("Enter String : ");
    gets(str);

    for(int i = 0; str[i] != '\0'; i++)
    {
        push(str[i]);
    }

    printf("Reversed String : ");
    display();

    return 0;
}