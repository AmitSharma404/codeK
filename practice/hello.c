#include<stdio.h>

int main() {
    int age;
    printf("Enter your age: ");
    scanf("%d",&age);

    if(age < 18) {
        printf("your age must have 18+ to vote");
    } else {
        printf("you can vote");
    }

    return 0;
}