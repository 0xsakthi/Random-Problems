#!/usr/bin/python3

t = 1
n = 3
# n1 = list("abcde")
# n2 = "fghij"
# n3 = "olmkn"
# n4 = "trpqs"
# n5 = "xywuv"
alpha = []

for i in range(26):
	alpha.append(chr(i+97))
# print(alpha[10:15])
# n1 = ["a","b","c","d"]
count = 0

for i in range(n):
	temp = list(input())
	# print(temp)
	ans = alpha[i*n:(i+1)*n]
	# print(alpha[i*5:(i+1)*5])
	for i in temp:
		if i in ans:
			count+=1
		else:
			# print("no")
			count=-1
			break
	if count==-1:
		break
if count%5==0:
	print("yes")
else:
	print("no")