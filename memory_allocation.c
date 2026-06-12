#include<stdio.h>
#include<stdlib.h>
struct student
{
    char name[20];
    int roll,marks;
};

void main()
{
    struct student s;
    struct student *x;
    x = malloc(sizeof(struct student));

    printf("Enter name, roll number and marks of student:\n");
    scanf("%s %d %d", s.name, &s.roll, &s.marks);

    printf("Enter name, roll number and marks of student:\n");
    scanf("%s %d %d", x->name, &x->roll, &x->marks);
    
    printf("Details of student using structure variable:\n");
    printf("Name: %s\n", s.name);
    printf("Roll Number: %d\n", s.roll);
    printf("Marks: %d\n", s.marks);

    printf("Details of student using pointer variable:\n");
    printf("Name: %s\n", x->name);
    printf("Roll Number: %d\n", x->roll);
    printf("Marks: %d\n", x->marks);

    
}