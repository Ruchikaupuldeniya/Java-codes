#include<iostream>
using namespace std;
int main()
{
    int flag=1 ;
    string S = "level";
    int len=S.length();

    cout << "S.length() is :"<<len<<endl;
// Iterate over the range [0, length/2]

    for (int i = 0; i < len / 2; i++) {
// If S[i] is not equal to the S[length-i-1]

        if (S[i] != S[len - i - 1]) {
// Change the flag value as 0 

        flag=0;
        }
    }
    if(flag==1)
        cout << "Word is a Palindrome"<<endl;
    else
        cout << "Word is not a Palindrome";
    
    return 0;
}