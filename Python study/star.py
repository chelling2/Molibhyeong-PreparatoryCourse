print(" 숫자  입력: ")

a=int(input())

e = int(1)

while(e<=a):
    if(e<=(a+1)//2):
        for i in range((a+1)//2-e):
            print(" ",end="")
        for i in range(e*2-1):
            print("*" ,end="")
        print("")
    else:
        for i in range(e-(a+1)//2):
            print(" ",end="")
        for i in range(a*2-e*2+1):
            print("*" ,end= "")
        print("")
        
    e=e+1
