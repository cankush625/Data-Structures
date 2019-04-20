#include<stdio.h>

int addition(int[]);

void main(){
    int arr[5] = {1,2,3,4,5};
    int sum = addition(arr);
    printf("%d", sum);
}

int addition(int arr[]){
    int sum = 0, i;

    for(i=0; i<5; i++){
        sum = sum + arr[i];
    }

    return sum;
}

/*
Output :
15
*/
