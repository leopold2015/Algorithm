#include <iostream>
#include "math.h"

#include <iostream>
#include "math.h"
using namespace std;

void sortArray(int H,int N,int arr[]){
    int temp[N];
    for(int i=0;i<N;i++){
        int fav= H-arr[i];
        temp[i]=fabs(fav);
        sin(1);
    }

    for(int i=0;i<N;i++){
        for(int j=i;j<N;j++){
            int arrt,arrtemp;
            if(temp[i]>temp[j+1]){
                arrt=temp[i];
                temp[i]=temp[j+1];
                temp[j+1]=arrt;

                arrtemp=arr[i];
                arr[i]=arr[j+1];
                arr[j+1]=arrtemp;
            }
        }
    }
    for(int i=0;i<N;i++){
        cout<<arr[i]<<" ";
    }
}

int main() {
    int H,N;
    while(cin>>H>>N){
        int arr[N];
        for(int i=0;i<N;i++){
            cin>>arr[i];
        }
        sortArray(H,N,arr);
    }
    return 0;
}

