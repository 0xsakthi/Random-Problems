#!/usr/bin/python3

n = 7
p = 4
count = 1
count2 = 0
ans  = []
for i in range(2,n,2):
	if p==i or p==i+1:
		print(f"ans is {i} and {i+1}")
		# count+=1
		# print(count)
		# ans.append(count)
		break
	elif p==1:
		count=0
		break
	else:
		count+=1
for j in range(n-1,0,-2):
	# print(f"ans is {j} and {j+1}")
	if p==n or p==n-1:
		break
	elif p==j or p==j-1:
		count2+=1
		break
	else:
		count2+=1

ans.append(count)
ans.append(count2)
print((ans))