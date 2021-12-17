/*
Input:
H = 10

Output:
36

Explanation:
H is 10. From ground to H it travels d=10.
From H to ground it travels d=10+10. Now H
becomes floor(10/2). So ball rebounds to d=10+10+5.
It goes down to the ground. d=10+10+5+5. Now H
becomes floor(5/2). So ball rebounds to d=10+10+5+5+2.
The ball goes down. d=10+10+5+5+2+2. H becomes
floor(2/2). So ball rebounds to d=10+10+5+5+2+2+1.
It goes down to the ground. d=10+10+5+5+2+2+1+1.
H becomes floor(1/2). H is zero so no rebound.
Total d=36.
*/
#include <iostream>
using namespace std;

int main(){
	int H = 10; //ans is 36,(20+10+4+2)
	int ans = 2*H;

	while(H>0){
		ans+=2*(H/2);
		H = H/2;
	}
	cout<<ans;

	return 0;
}
