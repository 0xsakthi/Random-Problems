def count_substring(string, sub_string):
    print(string)
    for i in string:
        for j in sub_string:
            if i==j:
                string.replace(i,'',1)
                sub_string.replace(j,'',1)
                counts = len(string) + len(sub_string)
                print(counts)
if __name__ == '__main__':
    string = ('sakthi').strip()
    sub_string = ('akthi').strip()
    
    count = count_substring(string, sub_string)
    #print(count)