#include<iostream>
using namespace std;
int main(){
    int n;
    long factorial=1.0;
    int i=1;

    cout<<"Enter the positive integer number : ";
    cin>>n;

    if(n<0){
        cout<<"Error..! ";
    }

    else{
        while(i<=n){
            
            factorial *= i;
            i++;
        }
        cout << "Factorial of " << n << " = " << factorial<<endl;
    }
}