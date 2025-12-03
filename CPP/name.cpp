#include <iostream>

using namespace std;

int add(int a,int b){
    return a*b;
}

int main () {
    int a,b;
    cout << "Enter a number: ";
    cin>>a>>b;
    cout << "You entered: " << add(a,b) << endl;
    return 0;
}