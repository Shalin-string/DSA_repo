#include<stdio.h>

void main(){
    int a[3]  ={10,20,30};
    
    int *p = &a[0];
    
    printf("a[0]  =%d\n", &a[0]);
    printf("a[1]  = %d\n", &a[1]);
    printf("a[2]  = %d\n", &a[2]);
    printf("\n=====================\n");

    printf("a[0]  = %d\n", &a[0]+4);
    printf("a[2]  = %d\n", &a[0]+8);

}
