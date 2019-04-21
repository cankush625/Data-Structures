#include<stdio.h>

void main(){
    int a = 10;
    int *b;
    b = &a;

    printf("Value of a = %d\n", a);
    printf("Value of &a = %d\n", &a);
    printf("Value of b = %d\n", b);
    printf("Value of &b = %d\n", &b);
    printf("Value of *b = %d\n", *b);
}
