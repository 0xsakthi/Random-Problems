#!/usr/bin/python3

a = [1,2,3,4,5]
b = []
c = 0
for i in range(len(a)):
	b.append(sum(a)-a[i])
b.sort()
print(f"{b[0]} {b[-1]}")
