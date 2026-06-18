#include<iostream>
#include<string>
using namespace std;
int main(){
    string title,initial;
    string Name,Uni_name,post;
    int date,month,year;
    float salary;
    cout<<"\n\nICA 01\n"<<"-------\n"<<endl;
    
    cout<<"Enter title :- ";
    getline(cin, title);

    cout<<"Enter initial :- ";
    getline(cin, initial);

    cout<<"Enter the name :- ";
    getline(cin, Name);

    cout<<"appointed post -:";
    getline(cin, post);

    cout<<"University name-: ";
    getline(cin, Uni_name);

    cout<<"Enter the date -:";
    cin>>date;

    cout<<"Enter the month -:";
    cin>>month;

    cout<<"Enter the year -:";
    cin>>year;

    cout<<"Enter the amount of salary -: ";
    cin>>salary;

    //Paragraph
    cout<<"\nDear "<<title<<". "<<initial<<" "<<Name<<"\n"<<endl;
    cout<<"              I write to inform you that you have been appointed to the post of "<<post<<"  in ICT in the Department of ict, Faculty of technologycal studies at the"<<Uni_name<<", Sri Lanka from "<<date<<"/"<<month<<"/"<<year<<". You will paid an all-inclusive monthly salary of Rs."<<salary<<"/= per month for this appointment. in addition to the salary, all allowances approved by the UGC will also be paid.\n\nThank you.\n";

    return 0;
}