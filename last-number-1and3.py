#!/usr/bin/python3

a = 1000
ans = []
for i in range(1,a+1):
	if(i%10==3 or i%10==1):
		ans.append(i)
for i in range(len(ans)-1,-1,-1):
	print(str(ans[i]),end=" ")
	