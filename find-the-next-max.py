#!/usr/bin/python3

arr = [11,13,21,3,89]

# maxi = max(arr)


for i in range(len(arr)):
	next = -1
	for j in range(i+1, len(arr), 1):
		if arr[i] < arr[j]:
			next = arr[j]
			break
	print(str(arr[i])+" -- "+str(next))
# print(ans)