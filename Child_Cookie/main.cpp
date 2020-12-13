#include <iostream>
#include <algorithm>
#include<vector>

using namespace std;


int findContentChildren(vector<int>& children, vector<int>& cookies) {
    sort(children.begin(), children.end());
    sort(cookies.begin(), cookies.end());
    int child = 0, cookie = 0;
    while (child < children.size() && cookie < cookies.size()) {
        if (children[child] <= cookies[cookie]) ++child;
        ++cookie;
    }
    return child;
}

int main() {

    vector<int> a = {1,2};
    vector<int> b = {1,2,3};
    int num = findContentChildren(a,b);
    cout<< num<<endl;
    return 0;
}
