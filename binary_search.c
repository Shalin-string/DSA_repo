#include<stdio.h>
void binary_search_fn(int arr[]){
    int key;
    int min =0 ,max = 9,mid;
    printf("\nEnter the key you want to found : \n");
    scanf("%d",&key);

step3:
    mid = (min+max)/2;
    printf("\nMin = %d, max = %d, mid = %d",min,max,mid);
    if (arr[mid] == key)
    {
        printf("\nKey is found at : %d\n",mid);
        return;
    }
    else if (arr[mid] < key)
    {
        min = mid +1;
    }
    else if (arr[mid] > key)
    {
        max = mid -1;
    }
    if (max >= min){
        goto step3;}
    else{
        printf("\nKey not found\n");}

}

void main(){
    int arr[] = {1,2,3,4,5,6,7,8,9,10};

    binary_search_fn(arr);

}