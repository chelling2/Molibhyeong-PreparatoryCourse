import java.util.Scanner;

public class cal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char c = ' ';

        do {

            System.out.println("ù ���� �Է��ϼ���");

            int num = sc.nextInt();

            System.out.println("��ȣ �Է��ϼ���");

            char op = sc.next().charAt(0);

            System.out.println("�� ��° ���� �Է��ϼ���");

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

                    System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�. �ٽ� ó������ ���ư��ϴ�.");

                    continue;

            }

            System.out.println(num + " " + op + " " + num2 + " = " + result);

            System.out.println("��� ����ϽǰŸ� y�� �Է����ּ���. ");

            c = sc.next().charAt(0);

        } while (c=='y');

   System.out.print("���α׷��� �����մϴ�.");

    }

}
