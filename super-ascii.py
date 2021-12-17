#!/usr/bin/python3
#SUPER ASCII
a = {}
string = "abb"
# print(chr(97))
count = 0
for i in range(26):
	a[chr(97+i)] = i+1

for i in string:
	if a.get(i) == string.count(i):
		continue
	else:
		count+=1
if count==0:
	print("YES")
else:
	print("NO")
	