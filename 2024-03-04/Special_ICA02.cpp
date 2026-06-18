#include<iostream>
using namespace std;
int main(){
    float secound;
    int day,hours,min,sec,temp,temp2;

    cout<<"\n\nEnter the Secound : ";
    cin>>secound;

    if(secound<=60){
        min= secound / 60;
        cout<<"\nThe number of minuts is "<<min<<" minusts and "<<secound<<" Secounds.\n\n"; 
    }


    else if(secound<=3600){
        hours= secound / 3600;
        temp = (int)secound % 3600;
        min = temp / 60;
        sec = temp % 60; 
        cout<<"\nThe number of hour is "<<hours<<" hours and "<<min<<" minuts and "<<sec<<" Secound.\n\n";
    }

    else if(secound<=86400){
        day= secound / 86400;
        temp = int(secound)%86400;
        hours = temp / 3600;
        temp2 = temp % 3600;
        min = temp2 / 60;
        sec = temp2 % 60; 
        cout<< "\nThe number of day is "<<day<<" days and "<<hours<<" hours "<<min<<" min and "<<sec<<" Secounds.\n\n";
    }

     else if(secound>=86400){
        day= secound / 86400;
        temp = int(secound)%86400;
        hours = temp / 3600;
        temp2 = temp % 3600;
        min = temp2 / 60;
        sec = temp2 % 60; 
        cout<< "\nThe number of day is "<<day<<" days and "<<hours<<" hours "<<min<<" min and "<<sec<<" Secounds.\n\n";
    }
}