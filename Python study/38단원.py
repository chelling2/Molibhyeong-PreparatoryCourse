try:
    file = open('maria.txt', 'r')

except FileNotFoundError:
    print('파일이 없습니다.')

else:
    s = file.read()
    file.close()



    
class NotPalindromeError(Exception):
    pass

def palindrome(word):
    
    if word != word[::-1]:
        raise NotPalindromeError('회문이 아닙니다.')
    print(word)

try:
    word = input()
    palindrome(word)
    
except NotPalindromeError as e:
    print(e)
