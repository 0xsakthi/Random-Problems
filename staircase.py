#/usr/bin/python3

n = 6;
star = '#'
space = " "


for  j in range(n,0,-1):
    # print(n-j)
    a = (space*(j-1))+(n-j+1)*star
    print(a)