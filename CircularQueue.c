#include<stdio.h>
#define Size 5

int queue[Size];
int front = -1;
int rear = -1;

void enqueue(int value)
{
       if (rear = front - 1)
       {
            printf("Queueus full");
       }
       else if (rear = Size-1 && front != 0)
       {

    
       }
        else{
            rear++;
            queue[rear] = value;
        }       
       
}

void dequeue(){
    printf("%d/n: removed : ",queue[front],"/n");
    front++;

}

