def counter():
    i = 0
    def count():
        nonlocal i
        i += 1
        return i
    return count

c= counter()
for i in  range(10):
    print(c(), end=' ')





def countdown(n):
    def c():
        nonlocal n
        a = n
        n -=1
        return a
    return c

n = int(input())
c = countdown(n)
for i in range(n):
    print(c(), end=' ')
