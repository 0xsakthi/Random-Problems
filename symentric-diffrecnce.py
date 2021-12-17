
M = int(input())
a = set(map(int,input().split()))
N = int(input())
b = set(map(int,input().split()))
ans1 = a.difference(b)
ans2 = b.difference(a)
final = ans1.union(ans2)
for i in sorted(list(final)):
    print(i)