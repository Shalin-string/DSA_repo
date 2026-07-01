#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *p;
    int *x;

    p = malloc(sizeof(int));
    x = calloc(10,sizeof(int));

    if (p == NULL || x == NULL) {
        fprintf(stderr, "Memory allocation failed\n");
        return 1;
    }

    printf("Enter number :\n");
    scanf("%d", p);
    printf("\nNumber = %d",*p);

    free(p);

    for (int i = 0; i < 10; i++)
    {
        printf("\nEnter number :\n");
        scanf("%d", &x[i]);
    }

    for (int i = 0; i < 10; i++)
    {
        printf("\nNumber = %d",x[i]);
    }
    
    

    free(x);
    return 0;
}