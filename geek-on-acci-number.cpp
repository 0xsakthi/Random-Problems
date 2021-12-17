#include <iostream>
using namespace std;

int geekonacci(int a,int b,int c,int N){
	int count = 3;
	int sum = 0;
	while(count<N){
		sum = a+b+c;
		a = b;
		b = c;
		c = sum;
		count++;
	}
	
	return c;
}
int main(){
	int a;
	cin >>a;
	for(int i=0;i<a;i++){
		int a,b,c,N;
		cin >>a>>b>>c>>N;
		cout<<geekonacci(a,b,c,N)<<endl;
	}


	return 0;
}
