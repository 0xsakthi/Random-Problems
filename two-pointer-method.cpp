/* implementing two pointer method */
#include <bits/stdc++.h>
using namespace std;


int main(){

	int n = 4;
	int arr[n] = {2,7,11,15}; //{-65,-21,8,60,93}
	sort(arr,arr+n);
	int low = 0;
	int find = 9;
	int high = n-1;
	while(low<high){
		if(arr[low]+arr[high]==find){
			cout<<low<<" "<<high<<endl;
			low++;
			high--;
		}
		else if(arr[low]+arr[high]>find){
			high--;
		}
		else{
			low++;
		}
	}

}

std::vector<int> v;