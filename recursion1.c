#include<stdio.h>

void rec_fn(){
    static int count=1;
    printf("%d\n",count);
    count++;
    if(count<6){
        rec_fn();
    }
}

int main(){
    rec_fn();
}