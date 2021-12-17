#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
	vector<int> v;
	v = {1,5,3,2,6};
	sort(v.begin(),v.end());
	// cout << "hello";
	for (int i = 4; i > -1; --i)
	{
		cout<<v[i]<<" ";
	}


	return 0;
}