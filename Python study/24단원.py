path = 'C:\\Users\\dojang\\Appdata\\Local\\Programs\\Python\\Python36-32\\python.exe'
c=path.split("\\")
name=c[-1]
print(name)




ip= input().split()
count=0

for i in ip:
    i=i.strip(',.')
    if i == 'the':
        count+=1
print(count)



a=list(map(int, input().split(';')))
a.sort(reverse=True)
for price in a:
    print('{:>9,}'.format(price))

