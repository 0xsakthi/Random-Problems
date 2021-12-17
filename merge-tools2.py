def merge_the_tools(string, k):
    for i in range(0,len(string),k):
        ans = ''
        print(i)
        for j in string[i:i+k]:
            if j not in ans:
                ans+=j
        print(ans)




if __name__ == '__main__':
    string =  'AABCAAADA'
    k = 3
    merge_the_tools(string, k)






















'''
 uniq = ''
        for c in string[i : i+k]:
            if (c not in uniq):
                uniq+=c
        print(uniq)
'''
