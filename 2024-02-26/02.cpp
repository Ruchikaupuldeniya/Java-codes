#include<iostream>
using namespace std;
int main(){
    //float num1,num2;
    cout<<"         Swap two numbers: \n        ----------------\n";
    int num1,num2;
    cout<<"Input 1st number : ";
    cin>>num1;

    cout<<"Input 1st number : ";
    cin>>num2;

    /*cout<<"\nAfter Swapping the 1st number is : "<<num2;
    cout<<"\nAfter Swapping the 2nd number is : "<<num1;*/


    if(num1!=num2){
        int temp=num1;
        num1=num2;
        num2=temp;

    cout<<"\nAfter Swapping the 1st number is : "<<num1;
    cout<<"\nAfter Swapping the 1st number is : "<<num2;
    }
    else
    {
        cout<<"\nNo need to swapping becouse of the numbers are same.";
        cout<<"\nAfter Swapping the 1st number is : "<<num1;
        cout<<"\nAfter Swapping the 1st number is : "<<num2;
    }

    return 0;
}