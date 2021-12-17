#!/usr/bin/python3

num1 = int(input())

set1 = set(map(int, input().split()))

#print(set1)
num2 = int(input())

#ins = input().split()
#print(ins[0])
for i in range(num2):
	ins = input().split()
	if ins[0] == 'intersection_update':
		#print(set1)
		set2 = set(map(int,input().split()))
		set1.intersection_update(set2)
		#print(set1)
	elif ins[0] == 'update':
		set2 = set(map(int,input().split()))
		set1.update(set2)
	elif ins[0] == 'symmetric_difference_update':
		set2 = set(map(int,input().split()))
		set1.symmetric_difference_update(set2)
	elif ins[0] == 'difference_update':
		set2 = set(map(int,input().split()))
		set1.difference_update(set2)

print(sum(set1))