#!/usr/bin/python3

array1 = list(map(int,input().split()))
array2 = list(map(int,input().split()))
array3 = list(map(int,input().split()))
# array1 = [1,2,3]
# array2 = [4,5,6]
# array3 = [9,8,9]
left = 0
right = 0
for i in range(len(array1)):
    left = array1[i]+array2[i+1]+array3[i+2]
    right = array1[len(array1)-1]+array2[len(array1)-2]+array3[len(array1)-3]
    break
print(abs(left-right))