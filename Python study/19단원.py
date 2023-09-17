for i in range(5):
    for j in range(5):
        if j<i:
            print(' ',end='')
        else:
            print('*',end='')
    print()








x=int(input())

for i in range(x):
    k=0
    
    for j in range(x):
        if j<x-(i+1):
            print(' ',end='')
        else:
            print('*',end='')

    while k<i:
        print('*',end='')
        k+=1;

    print()
  
