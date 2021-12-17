#!/usr/bin/python3
import textwrap

s = 'AABCAAADA'

k = 3

n = textwrap.fill(s,k)

x,y,z = map(str, n.split())

ans1 = []
ans2 = []
ans3 = []

for i in x:
	if i not in ans1:
		ans1.append(i)
for j in y:
	if j not in ans2:
		ans2.append(j)
for k in z:
	if k not in ans3:
		ans3.append(k)
		
print(''.join(ans1))
print(''.join(ans2))
print(''.join(ans3))

	


