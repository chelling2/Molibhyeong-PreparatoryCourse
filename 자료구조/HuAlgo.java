import java.util.Stack;

public class HuAlgo {

	// ������� ��� (������� �� �Է�)
	public int calC(String str) {
		
		Stack<String> ms = new Stack<>();
		String[] calResult = str.split(" ");
		int result = 0;

		for (String s : calResult) {
			switch (s) {
			case "+":
				result = Integer.valueOf(ms.pop()) + Integer.valueOf(ms.pop());
				ms.push(String.valueOf(result));
				break;

			case "-":
				result = -Integer.valueOf(ms.pop()) + Integer.valueOf(ms.pop());
				ms.push(String.valueOf(result));
				break;

			default:
				ms.push(s);
				break;
			}
		}
		return result;
	}

	public static String[] bitcoin(String str) {

		System.out.println(str);
		System.out.println();

		str = str.replace("(", "( ");
		str = str.replace(")", " )");
		String[] arr = str.split(" ");
		return arr;
	}
	// �پ��ִ� �κ��� �����ϰ� �ϳ��� �ܾ�� ����� ����

	public static void main(String[] args) {

		Stack<String> ms = new Stack<>();

		String a = "113 + 11 - (32 - (9 - 2 + 6))";
	

		
		
		
		
		String[] arr = bitcoin(a); // �޼��带 ���� ���� �� �ܾ �и�

		String result = ""; // ���� ����� ���� ����

		for (String s : arr) {
			switch (s) {
			case "+":
				if (ms.isEmpty()) { // ������ ��������� �׳� push
					ms.push(s);
				} else if (ms.peek().equals("(")) { // "("�� ������ �׳� push
					ms.push(s);
				} else {
					result += ms.pop() + " "; // �ƴϸ� pop -> push
					System.out.println(result);
					ms.push(s);
				}
				break;

			case "-":
				if (ms.isEmpty()) {
					ms.push(s);
				} else if (ms.peek().equals("(")) {
					ms.push(s);
				} else {
					result += ms.pop() + " ";
					System.out.println(result);
					ms.push(s);
				}
				break;

			// ( �� �׳� push
			case "(":
				ms.push(s);
				break;

			// ( �� ���ö� ���� pop, �ȳ����� ���
			case ")":
				while (true) {
					if (ms.peek().equals("(")) {
						ms.pop();
						break;
					} else {
						result += ms.pop() + " ";
						System.out.println(result);
					}
				}
				break;

			// �ǿ����ڴ� �׳� ���
			default:
				result += s + " ";
				System.out.println(result);
				break;
			}
		}

		// ���� ������� ������ ������!
		if (!ms.isEmpty()) {
			result += ms.pop();
		}

		System.out.println();
		System.out.println();
		System.out.println("���� ǥ��� : " + result);

		// ������
		HuAlgo cal = new HuAlgo();
		int cal_result = cal.calC(result);
		System.out.println("��� : " + cal_result);
	}

}
