#!/bin/python3
if __name__ == '__main__':
    n = int(input())
    integer_list = map(int,input(), input().split())
    t = tuple(integer_list)
    print(t)
    print(hash(t))

   
