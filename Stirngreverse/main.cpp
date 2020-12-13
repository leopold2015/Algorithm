#include <iostream>
#include "string"
using namespace std;


int main() {
    string str;
    getline(cin,str);
    for(int i=0;i<str.size();i++){
        cout<<str[str.size()-i-1];
    }
    return 0;
}
