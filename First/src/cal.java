import java.util.Scanner;

public class cal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char c = ' ';

        do {

            System.out.println("첫 숫자 입력하세요");

            int num = sc.nextInt();

            System.out.println("기호 입력하세요");

            char op = sc.next().charAt(0);

            System.out.println("두 번째 숫자 입력하세요");

            int num2 = sc.nextInt();

            int result = 0;

            switch (op) {

                case '+':

                    result = num + num2;

                    break;

                case '-':

                    result = num - num2;

                    break;

                case '*':

                    result = num * num2;

                    break;

                case '/':

                    result = num / num2;

                    break;

                default:

                    System.out.println("연산자를 잘못 입력하였습니다. 다시 처음으로 돌아갑니다.");

                    continue;

            }

            System.out.println(num + " " + op + " " + num2 + " = " + result);

            System.out.println("계속 사용하실거면 y를 입력해주세요. ");

            c = sc.next().charAt(0);

        } while (c=='y');

   System.out.print("프로그램을 종료합니다.");

    }

}
