#include <iostream>
using namespace std;

int main(){

	int arr[8] = {1,3,4,5,7,9};
	int count = 1; 

	for (int i = 0; i < 6; ++i)
	{
		if (arr[i]==count)
		{
			cout<<i+1;
			count=arr[i];
		}
		else{
			cout<<i;
		}
	}
	return 0;
}
