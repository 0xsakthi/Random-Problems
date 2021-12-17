#!/usr/bin/python3

k1,k1_jump,k2,k2_jump = map(int, input().split())
ans = False
sum1 = k1
sum2 = k2

while(True):
    if sum1==sum2:
        ans=True
        break
    if (k2>k1 and k2_jump>k1_jump) or (k1_jump>k2_jump and k1>k2) or (k1==k2 and k2_jump!=k1_jump):
        break
    else:
        sum1+=k1_jump
        sum2+=k2_jump
if(ans):
    print("YES")
else:
    print("NO")