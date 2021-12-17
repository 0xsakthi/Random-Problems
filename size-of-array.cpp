#include <iostream>
using namespace std;

int main(){

	int arr[3] = {1,3,4};
	int size = sizeof(arr)/sizeof(arr[0]);
	cout<<size;

	return 0;
}
