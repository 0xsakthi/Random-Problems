#!/usr/bin/python3

n = 8
giv = "DDUUDDUDUUUD"
val = 0
count = 0
d_value = giv.count("D")
u_value = giv.count("U")

for i in range(len(giv)):
	if giv[i]=='U':
		count+=1
	else:
		val+=1
		count-=1
print(count)
