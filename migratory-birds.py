#!/usr/bin/python3

n = 11
arr = [1,2,3,4,5,4,3,2,1,3,4]
a = {}
for i in range(n):
	if arr[i] in a:
		a[arr[i]]+=1
	else:
		a[arr[i]]=1
print(a)
ans = max(a.values())
res = []
set1 = a.keys()
set2 = a.values()
for i in set1:
	if a[i]==ans:
		print(i)
		res.append(i)
print(min(res))