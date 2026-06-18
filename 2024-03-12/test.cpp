#include<iostream>
#include <algorithm>
using namespace std;
int main(){
    string s ="ABCDE";
    string m=s;
    reverse(m.begin(),m.end());
    cout<<m;
}