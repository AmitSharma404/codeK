#include<stdio.h>
int addSum(int arr[],int k){
    int sum  = 0;
    for(int i = 0;i<k;i++){
        sum += arr[i];
        
   }
   return sum;
}

int main() {
    int k;
    printf("Enter the value of K: ");
    scanf("%d",&k);
    int arr[k];
    for(int i = 0;i<k;i++){
        printf("Enter the elements of arr %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    int totalSum = addSum(arr,k);
    printf("Total Sum: %d",totalSum);

    return 0;

}   