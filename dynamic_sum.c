#include<stdio.h>
#include<stdlib.h>

int main(){

    int *p;
    int *q;
    int *x;

    p = malloc(sizeof(int));
    q = malloc(sizeof(int));
    x = malloc(sizeof(int));

    if (p == NULL || q == NULL) {
        printf( "Memory allocation failed\n");
        return 1;
    }

    printf("Enter number :\n");
    scanf("%d", p);
    

    printf("Enter number :\n");
    scanf("%d", q);
    

    *x = *p + *q;
    printf("\nSum = %d",*x);


    free(p);
    free(q);
    free(x);
}