#!/usr/bin/python3

ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

count = 0

s = set(ar)
counter
for i in s:
	print(f"{i} and {ar.count(i)}")
	ans = int(ar.count(i)/2)
	print(ans)
	if ans>0:
		count+=ans
print(count)