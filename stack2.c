#include<stdio.h>

#define size 5

int stack[size];
int top = -1;

void push(int data){
    if (top == size-1)
    {
        printf("Stack is overflow\n");
    }
    else{
        top++;
        stack[top] = data;
        printf("Added!!%d\n", data);
    }
}

void pop(){
    if (top <= 0)
    {
        printf("Stack is underflow");
    }
    else
    {
        printf("Removed :%d\n", stack[top]);
        top--;
    }
}

void display(){
    if (top == -1)
    {
        printf("Stack is empty/n");
    }
    else{
        printf("Display=======\n");
        for (int i = top; i >= 0; i--)
        {
            printf("%d\n",stack[i]);
        }
        
    }

}

void peek(){
    if (top == -1)
    {
        printf("Stack is empty/n");
    }
    else{
        printf("top = %d",stack[top]);
    }
}

void peep(int loc){
    int index = top - loc + 1;
    if(index < 0 || index > top ){
    printf("\nInvalid Location");
    }else{
    printf("\n%d",stack[index]);
    }
}

int main()
{
    push(10);
    push(20);
    push(30);
    push(40);
    push(50);
    // push(60);
    peek();

    display();
    peep(1);
    peep(2);
    peep(2);
    // pop();
    // pop();

    // display();

    return 0;
}