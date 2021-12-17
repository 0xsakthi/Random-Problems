#!/usr/bin/python3
a = [0,0,12,12,1,1,4,4,4,4,9]
b = {}

for i in range(len(a)):
	if a[i] in b:
		b[a[i]]+=1
	else:
		b[a[i]]=1
c = list(b.values())
d = list(b.keys())
ans = c.index(1)
print(d[ans])