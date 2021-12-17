#!/usr/bin/python3

'''
for i in range(a):
    temp = multi(b[i])
4
73
67
38
33
'''
a = int(input())
b = []
for i in range(a):
    temp = int(input())
    b.append(temp)
ans = 0
def multi(mark):
    global ans
    temp = 0
    if (mark%5==0):
        ans = mark
    else:
        mark+=1
        multi(mark)
for i in range(a):
    multi(b[i])
    pea = ans-b[i]
    # print(pea)
    if b[i]>40 and pea<3:
        print(ans)
    else:
        print(b[i])