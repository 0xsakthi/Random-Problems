#!/usr/bin/python3

#a,b = map(int,input().split(" "))
a = 9
b = 26

for i in range(1,b,2):
	print(str('.|.' * i).center(a, '-'))