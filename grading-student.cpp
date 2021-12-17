#include <iostream>
using namespace std;

int ans = 0;

void ret(int value){
    if (value%5==0){
        ans = value;
    }
    else{
        value+=1;
        ret(value);
    }
}
int main(){
    int n;
    int arr[n];
    for (int i=0; i>n; i++) {
    cin>>arr[i];
    }
    // for(int i=0;i>n;i++){
    //     int ans = arr[i];
    // }
    ret();
    cout<<ans;
    return 0;
}