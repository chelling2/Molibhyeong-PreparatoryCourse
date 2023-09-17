

n = int(input())
text = input()
words = text.split()

if len(words) < n:
    print('wrong')
else:
    n_gram = zip(*[words[i:] for i in range(n)])
    for i in n_gram:
        print(i)











with open("words.txt",'r') as 'file':
    words=file.readlines()
    for word in words:
        word = word.strip('\n')
        
        if word == word[::-1]:    
            print(word)
