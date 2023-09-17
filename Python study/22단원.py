#a=['alpha','bravo','charlie','delta','echo','foxtrot','golf','hotel','india']
#b=[i for i in a if len(i)==5]
#print(b)


a,b=map(int,input().split())
c=[]
for i in range(a,b-a+2):
    if i == a+1 or i == b-1:
        continue
    c.append(2**i)

print(c)





