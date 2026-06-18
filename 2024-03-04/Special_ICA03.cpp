#include<iostream>
using namespace std;

int main(){
    string colourOne, colourTwo;
    cout<<"The colors Red, Blue, Yellow are the Primary colors." <<"\n"<<"(if you want to mix colours you can enter below)"<<"\n"<<"You can use ;"<<"\n";
    cout<<"Please use only simple letter";

    cout<<"\n"<<"Enter the first color: ";
    cin>>colourOne;

    cout<<"\n"<<"Enter the secound color: ";
    cin>>colourTwo;

    if((colourOne =="red" && colourTwo == "blue" ) || (colourOne == "blue" && colourTwo == "red")){
        cout<<"Mixing the red and blue  gives you purple.\n";
    }  else if ((colourOne == "red" && colourTwo == "yellow") || (colourOne == "yellow" && colourTwo == "red")) {
        cout << "Mixing red and yellow gives you orange." << endl;
    } else if ((colourOne == "blue" && colourTwo == "yellow") || (colourOne == "yellow" && colourTwo == "blue")) {
        cout << "Mixing blue and yellow gives you green." << endl;
    } else {
        cout << "Error: Invalid input. Please enter valid primary colors (red, blue, or yellow) \n * Please remember only use simple letter !!!." << endl;
    }
    return 0;
}