i=0
while True:

    if i % 10 !=3:
        i+=1
        continue

    if i>73:
        break
    
    print(i,end=' ')
    i+=1





start, stop = map(int,input().split())
i=start

while True:

    if stop<i:
        break

    else:
        if i %10==3:
            i+=1
            continue
        
        else:
            print(i, end=' ')
            i+=1
