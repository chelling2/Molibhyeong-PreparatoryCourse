written_test = 75
coding_test= True

if written_test>=80 and coding_test==True:
    print("합격")
else:
    print("불합격")





a,b,c,d=map(int,input().split())

if a<0 or a>100 or b<0 or b>100 or c<0 or c>100 or d<0 or d>100:
    print("잘못된 점수")
else:
    e=a+b+c+d

    if(e>=80):
        print("합격")
    else:
        print("불합격")

    
    



