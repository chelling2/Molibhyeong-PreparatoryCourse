a = {i for i in range(1, 101) if i % 3 == 0}
b = {i for i in range(1, 101) if i % 5 == 0}
print(a & b)



a, b = map(int, input().split(" "))
a = {i for i in range(1, a + 1) if a % i == 0}
b = {i for i in range(1, b + 1) if b % i == 0}
divisor = a & b
print(divisor)
result = 0
if type(divisor) == set:
    result = sum(divisor)
print(result)
