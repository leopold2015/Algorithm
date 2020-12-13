#include <iostream>
using namespace std;

int sumsequence(int N){
    int sum=0;
    sum=(4+3*(N-1))*N/2;
    return sum;
}


int main() {
    int N;
    while(cin>>N){
        cout<<sumsequence(N);
    }

    return 0;
}
