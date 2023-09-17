with open('word.txt','r') as file:
    count = 0
    words = file.readlines()

    for word in words:
        if len(word.strip('\n')) <= 10 :
            count+= 1
    
print(count)



with open('words.txt', 'r') as file:
    str = file.readline()
    words=str.split() 
    
    for word in words:
        if 'c' in word: 
            print(word.strip(',.')) 
