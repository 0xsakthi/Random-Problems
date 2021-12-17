import textwrap
def merge_the_tools(string, k):
   n = textwrap.fill(string,k)
   a,b,c = map(str,n.split())
   a = set(a)
   b = set(b)
   c = set(c)
   x = ''.join(a)
   y = ''.join(b)
   z = ''.join(c)
   print(x)
   print(y)
   print(z)
   

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
