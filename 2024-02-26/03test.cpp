#include<iostream>
using namespace std;
int main(){
    int choose;
    double radius;
    const float pie=3.14;
    double circleA, circleP,Length,Hight,S_area,S_Perimeter, Q_length, Q_Area, Q_peremeter;
    float TriangulerA,Ta,Tb;
    cout<<"\n\nPlease Choose 1 or 2 or 3 or 4 to Calculate. \n--------------- ";
    cout<<"\n1. Circle";
    cout<<"\n2. Triangle";
    cout<<"\n3. Square";
    cout<<"\n4. Rectangle\n";
    cout << "0.Exit\n";

    cout << "You can Choose here (Input must be a number) : ";
    cin>>choose;

    if(choose==1)
        cout << "\nThank you for choosing 1. \n---------------------------\n";
        cout << "To find a Area and Perimeter please enter the radius : ";
        cin>>radius;

        circleA = pie * radius * radius;
        circleP = 2 * pie * radius;

        cout << "The circle Area is : " << circleA;
        cout << "\nThe circle Paremeter is : " << circleP;

    
    if (choose == 2) 
        cout << "\nThank you for choosing 2. \n---------------------------\n";
        cout << "Please enter the Length of a leg of a triangle : ";
        cin >> Ta;

        cout << "Please enter the perpendicular distance : ";
        cin >> Tb;

        TriangulerA = (Ta * Tb) / 2;

        cout << "The Area Of trianguler is : " << TriangulerA;

    
    if (choose == 3) 
        cout << "\nThank you for choosing 3. \n---------------------------\n";
        cout << "To find area and perimeter please enter the length : ";
        cin >> Q_length;

        Q_Area = Q_length * Q_length;
        Q_peremeter=(Q_length+ Q_length+ Q_length+ Q_length);
        cout << "The Area is :" << Q_Area;
        cout << "The Paremeter is : " << Q_peremeter;

    
    if (choose == 4) 
        cout << "\nThank you for choosing 4. \n---------------------------\n";
        cout << "Enter the length : ";
        cin >> Length;

        cout << "Enter the Hight : ";
        cin >> Hight;

        S_area = Length * Hight;
        S_Perimeter = (Length * 2) + (Hight * 2);

        cout << "The Area of The Square is : " << S_area;
        cout << "\nThe Peremeter of the Rectanguler is : " << S_Perimeter;
        
    
    if (choose == 0) 
        cout << "Thank you for choosing...!";
    
    else
        cout << "You Enterd Wrong number....! Thnak you.";
    

    return 0;
}