#include<iostream>
using namespace std;

int main(){
    int n;
    int sum_e=0, sum_o=0;
    cout<<"Enter the number : ";
    cin>>n;

    for(int i=0; i<n; i++){
        if(i%2==0){
            sum_e += i ;
        }else{
            sum_o += i ;
        }
    }

   cout<<" sum of even 1 to "<<n<<" is:- "<<sum_e<<endl;
   cout<<" sum of odd 1 to "<<n<<" is:- "<<sum_o<<endl;

    return 0;
}