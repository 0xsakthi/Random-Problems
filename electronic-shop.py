#!/usr/bin/python3

b,n,m = map(int,input().split())
# b = 10
# n = 2
# m = 3

ans = []

keyboards= list(map(int,input().split()))
drives = list(map(int,input().split()))

for i in keyboards:
	for j in drives:
		if i+j<=b:
			ans.append(i+j)
			# print(ans)
		else:
			ans.append(-1)
print(max(ans))