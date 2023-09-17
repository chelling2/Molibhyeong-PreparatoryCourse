x = 10
y = 3
def get_quotient_remainder(a, b):
    return a//b, a% b

quotient, remainder = get_quotient_remainder(x,y)
print('몫: {}, 나머지: {}'.format(quotient, remainder))




x, y = map(int, input().split())
def calc(a,b):
    return a+b, a-b, a*b, a/b

a,s,m,d = calc(x,y)
print('덧셈: {}, 뺄셈: {}, 곱셈: {}, 나눗셈: {}'.format(a,s,m,d))
