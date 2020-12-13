//
// Created by Mac on 2020/6/18.
//

#include <iostream>
#include <iomanip>
using namespace std;

double getCubeRoot(double input){
    double a = 0;
    double b = input;
    double ave = 0;
    while((b-a)>1e-9){
        ave = (a+b)/2;
        if(ave*ave*ave>input){
            b=ave;
        }else if(ave*ave*ave<input){
            a=ave;
        }else{
            return ave;
        }
    }
    return b;
}

int main() {
    double input;
    while(cin>>input){
        cout.unsetf(ios::fixed);
        cout << fixed<< setprecision(1)<< getCubeRoot(input) <<endl;
    }

    return 0;
}