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

		System.out.println("������ ����" + value[count - 1] + "�Դϴ�");
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

			System.out.println("������1 ť��2 �������� 3 �Է����ּ���");
			int a = sc.nextInt();

			if (a == 1) {
				ms = mm;
			} else if (a == 2) {
				ms = mm2;
			} else if (a == 3) {
				break;
			}

			System.out.println("1. push   2. pop    3. exit �Է����ּ���");
			int s = sc.nextInt();
			if (s == 1) {
				System.out.println("�Է°��� �Է����ּ���");
				int num = sc.nextInt();

				if (mm.count < 5) {
					mm.push(num);
				}

				else {
					System.out.println("�����Ͱ� ���� á���ϴ�.");
					continue;
				}

			}

			else if (s == 2) {
				if (mm.count > 0)
					mm.pop();

			} else if (s == 3) {
				continue;
			}

		} // while�� ��ȣ
	} // ���θ޼ҵ� ��ȣ
} // Msq ��ȣ
