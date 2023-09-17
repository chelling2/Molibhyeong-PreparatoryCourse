class Student:
    def __init__(self, name, gnum, kor, eng, math):
        self.name = name
        self.gnum = gnum
        self.kor = kor
        self.eng = eng
        self.math = math
       
    def __str__(self):
        return f"{self.name}\t{self.gnum}\t{self.kor}\t{self.eng}\t{self.math}\t{self.get_average()}"

    def get_average(self):
        return (int(self.kor) + int(self.eng) + int(self.math)) / 3
        

def main():
    while True:
        print("이름,학번,국어점수,영어점수,수학점수,평균을 나타냄.")
        print("학생등록: 1  정보수정: 2  학생삭제: 3  검색: 4  전체출력: 5  종료: 6")
        ip = int(input())

        if ip == 1:
            student_input()
        elif ip == 2:
            student_modify()
        elif ip == 3:
            student_delete()
        elif ip == 4:
            student_search()
        elif ip == 5:
            student_output()
        elif ip == 6:
            print("프로그램을 종료합니다")
            break
        else:
            print("잘못 입력하였습니다")
            continue

def student_input():
    print('이름:')
    name = input()
    print('학번:')
    gnum = input()
    print('국어 점수:')
    kor = input()
    print('영어 점수:')
    eng = input()
    print('수학 점수:')
    math = input()

    stu = Student(name, gnum, kor, eng, math)
   
    with open('Students.txt', 'a') as file:
        file.write(stu.name);file.write(' ')
        file.write(stu.gnum);file.write(' ')
        file.write(str(stu.kor));file.write(' ')
        file.write(str(stu.eng));file.write(' ')
        file.write(str(stu.math));file.write(' ')
        file.write(str(stu.get_average()))
        file.write('\n')
        file.close()
    print('등록완료')


        

def student_modify():
    with open('Students.txt', 'r') as file:
        lines = file.readlines()

        mm = input("수정할 학생 이름을 입력하세요")

        for line in lines:
            data = line.strip().split()
            if data[0] == mm:
                print(line)

        print()
        gnum = input('학번: ')

        print("국어는 1 영어는 2 수학은 3 입력하세요")
        s = int(input())

        if s == 1:
            with open('Students.txt', 'w') as file:
                for line in lines:
                    data = line.strip().split()
                    if data[1] == gnum:
                        kor = input('국어 점수: ')
                        data[2] = kor
                        stu = Student(data[0], data[1], data[2], data[3], data[4])
                        data[5] = str(stu.get_average())
                        print('수정완료')
                    file.write(' '.join(data))
                    file.write('\n')

            print()

        elif s == 2:
            with open('Students.txt', 'w') as file:
                for line in lines:
                    data = line.strip().split()
                    if data[1] == gnum:
                        eng = input('영어 점수: ')
                        data[3] = eng
                        stu = Student(data[0], data[1], data[2], data[3], data[4])
                        data[5] = str(stu.get_average())
                        print('수정완료')
                    file.write(' '.join(data))
                    file.write('\n')

            print()

        elif s == 3:
            with open('Students.txt', 'w') as file:
                for line in lines:
                    data = line.strip().split()
                    if data[1] == gnum:
                        math = input('수학 점수: ')
                        data[4] = math
                        stu = Student(data[0], data[1], data[2], data[3], data[4])
                        data[5] = str(stu.get_average())
                        print('수정완료')
                    file.write(' '.join(data))
                    file.write('\n')

            print()
            
        else:
            print("잘못 입력하였습니다")



def student_delete():
    
    with open('Students.txt', 'r') as file:
        data = file.read().strip()
        file.seek(0)

        if data == '':
            print('학생 정보가 없습니다.')
        else:
            with open('students.txt', 'r') as file:
                lines = file.readlines()
                
            print('1.한명 삭제 2.전체 삭제')
            sel = int(input())
            if sel == 1:
                gnum = input('삭제할 학생 학번을 입력하세요')

                with open('Students.txt', 'w') as file:
                    
                    for line in lines:
                        data = line.strip().split()
                        if data[1] == gnum:
                            file.write('')
                        else:
                            file.write(line)
                print('삭제 완료')
               
               
            elif sel == 2:
                with open('Students.txt', 'w') as file:
                    file.write('')
                    print('전체 삭제완료')

                

def student_search():
    with open('Students.txt', 'r') as file:
        data = file.read().strip()
        file.seek(0)

        if data == '':
            print('학생 정보가 없습니다.')
        else:
            with open('Students.txt', 'r') as file:
                lines = file.readlines()

            
            print("이름은 1번  과목점수기준은 2번을 입력해주세요")
            pa = int(input())

            if pa == 1:
                print("검색할 학생의 이름을 입력해주세요")
                aa = input()

                for line in lines:
                    data = line.strip().split()
                    if data[0] == aa:
                        print(line)
                print()

            elif pa == 2:
                abc = []

                print("1.국어  2.영어 3.수학 4.평균")
                op = int(input())

                print("기준 점수를 몇점으로 하실건가요?")
                ct = int(input())

                print("1.기준점수 이상 2. 기준점수 이하")
                ck = int(input())

                with open('Students.txt', 'r') as file:
                    for line in file:
                        name, gnum, kor, eng, math, avg = line.strip().split()
                        kor, eng, math, avg = int(kor), int(eng), int(math), float(avg)

                        if op == 1:
                            score = kor
                        elif op == 2:
                            score = eng
                        elif op == 3:
                            score = math
                        elif op == 4:
                            score = avg
                        else:
                            print('잘못 입력하였습니다')

                        if (ck == 1 and score >= ct) or (ck == 2 and score <= ct):
                            abc.append(line)
                            

                for line in abc:
                    print(line, end='')


def student_output():

    with open('Students.txt', 'r') as file:
        data = file.read().strip()
        file.seek(0)

    if data == '':
        print('학생 정보가 없습니다.')
        
    else:
        with open('Students.txt', 'r') as file:
            lines = file.readlines()

        for line in lines:
            print(line)
    print()


main()
