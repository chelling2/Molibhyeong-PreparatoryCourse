import java.util.*;

abstract class MyMemory {

	int[] value = new int[5];
	int count = 0;

	public void push(int a) {

		value[count++] = a;

	}

	public abstract void pop();

}

class MyStack extends MyMemory {

	@Override
	public void pop() {

		System.out.println("추출한 값은" + value[count - 1] + "입니다");
		value[count - 1] = 0;
		count--;

	}

}

class MyQueue extends MyMemory {

	@Override
	public void pop() {

		for (int i = 0; i < count; i++) {
			if (i < 4) {
				value[i] = value[i + 1];
			} else {
				value[4] = 0;
			}
		}
		count--;

	}

}

public class Msq {

	public static void main(String[] args) {

		MyStack mm = new MyStack();
		MyQueue mm2 = new MyQueue();

		MyMemory ms;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("스택은1 큐는2 나가려면 3 입력해주세요");
			int a = sc.nextInt();

			if (a == 1) {
				ms = mm;
			} else if (a == 2) {
				ms = mm2;
			} else if (a == 3) {
				break;
			}

			System.out.println("1. push   2. pop    3. exit 입력해주세요");
			int s = sc.nextInt();
			if (s == 1) {
				System.out.println("입력값을 입력해주세요");
				int num = sc.nextInt();

				if (mm.count < 5) {
					mm.push(num);
				}

				else {
					System.out.println("데이터가 가득 찼습니다.");
					continue;
				}

			}

			else if (s == 2) {
				if (mm.count > 0)
					mm.pop();

			} else if (s == 3) {
				continue;
			}

		} // while문 괄호
	} // 메인메소드 괄호
} // Msq 괄호
