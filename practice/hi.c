

#include<stdio.h>

long long add(long long a){
    if(a <= 1) {
        return a;
    } 

    return add(a-1) + add(a-2);
}

int main(){
    long long a;
    printf("Enter a: ");
    scanf("%lld",&a);
    
    for(long long i = 0; i<a;i++){
        printf("%lld,",add(i));
    }
    printf("\n"); 

    return 0;
}