#include<stdio.h>

struct student
{
    char name[50];
    int maths;
    int science;
    int english;
}s[2];

void getdata(struct  student s[])
{
    for (int i = 0; i < 3; i++)
    {
        printf("Enter student name : ");
        scanf("%s",s[i].name);
        printf("Enter Maths Marks: ");
        scanf("%d", &s[i].maths);
        printf("Enter Science Marks: ");
        scanf("%d", &s[i].science);
        printf("Enter English Marks: ");
        scanf("%d", &s[i].english);
    }
}

void printData(struct student s[])
{
    printf("\n Student Details \n");
    for (int i = 0; i < 3; i++)
    {
        printf("Name     : %s\n", s[i].name);
        printf("Maths    : %d\n", s[i].maths);
        printf("Science  : %d\n", s[i].science);
        printf("English  : %d\n", s[i].english);
    }
}


int main(){
    struct student s1[3];

    getdata(s1);
    printData(s1);

    return 0;
}