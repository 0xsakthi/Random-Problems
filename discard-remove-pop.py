#!/usr/bin/python3

suma = int(input())

n = set(map(int,input().split()))

num = int(input())

for i in range(num):
	ip = input().split()
	if ip[0]=="remove":
		n.remove(int(ip[1]))
	elif ip[0]=="discard":
		n.discard(int(ip[1]))
	else:
		n.pop()
print(sum(n))