/*
Sample Input

abcd
ef

Sample Output

4 2
abcdef
ebcd af
*/

#include <iostream>
#include <string>
using namespace std;

int main() {
	// Complete the program
    string a;
    string b;
    char c,d;
    cin >> a >> b;
    cout << a.length() << " " << b.length()<<endl;
    cout << a+b << endl;
    
    c = a[0];
    d = b[0];
    
    a[0] =d;
    b[0] =c;
    
    cout << a + " "+b;
        
      
    return 0;
}