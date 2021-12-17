#include <bits/stdc++.h>
using namespace std;


int main(){

	int n=3;
	int arr[n][n] = {{45, 48, 54},{21, 89, 87},{70, 78, 15}};

	for(int i=0;i<n;i++){
		if (i%2==0)
		{
			for (int j = 0; j < n; ++j)
			{
				cout<<arr[i][j]<<" ";
			}
		}
		else{
			for (int j = n-1; j >= 0; --j)
			{
				cout<<arr[i][j]<<" ";
			}
		}
	cout<<endl;
	}

	return 0;
}