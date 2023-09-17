a = [[[0 for col in range(3)] for row in range(4)] for depth in range(2)]
print(a)



a, b = map(int, input().split())
arr = []

for i in range(b):
    arr.append(list(input()))
print()

for i in range(a):
    for j in range(b):
        if(arr[i][j]) == '*':
            print('*', end="")

        else:
            cnt = 0
            for x in range(i-1, i+2):
                for y in range(j-1, j+2):
                    if x < 0 or x >= b or y < 0 or y >= b:
                        continue
                    elif arr[x][y] == "*":
                        cnt += 1
            print(cnt, end="")
    print()
