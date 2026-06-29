#include<stdio.h>

struct student
{
    char name[50];
    int maths;
    int science;
    int english;
};

void getdata(struct  student *s)
{
    printf("Enter student name : ");
    scanf("%s",s->name);

     printf("Enter Maths Marks: ");
    scanf("%d", &s->maths);

    printf("Enter Science Marks: ");
    scanf("%d", &s->science);

    printf("Enter English Marks: ");
    scanf("%d", &s->english);
}

void printData(struct student s)
{
    printf("\n----- Student Details -----\n");
    printf("Name     : %s\n", s.name);
    printf("Maths    : %d\n", s.maths);
    printf("Science  : %d\n", s.science);
    printf("English  : %d\n", s.english);
}


int main(){
    struct student s1;

    getdata(&s1);
    printData(s1);

    return 0;
}