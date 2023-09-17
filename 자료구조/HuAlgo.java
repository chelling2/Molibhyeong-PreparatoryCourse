import java.util.Stack;

public class HuAlgo {

	// 최종결과 계산 (후위계산 식 입력)
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
	// 붙어있는 부분을 제거하고 하나의 단어로 만들기 위함

	public static void main(String[] args) {

		Stack<String> ms = new Stack<>();

		String a = "113 + 11 - (32 - (9 - 2 + 6))";
	

		
		
		
		
		String[] arr = bitcoin(a); // 메서드를 통해 식을 한 단어씩 분리

		String result = ""; // 최종 결과를 담을 변수

		for (String s : arr) {
			switch (s) {
			case "+":
				if (ms.isEmpty()) { // 스택이 비어있으면 그냥 push
					ms.push(s);
				} else if (ms.peek().equals("(")) { // "("가 나오면 그냥 push
					ms.push(s);
				} else {
					result += ms.pop() + " "; // 아니면 pop -> push
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

			// ( 는 그냥 push
			case "(":
				ms.push(s);
				break;

			// ( 가 나올때 까지 pop, 안나오면 출력
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

			// 피연산자는 그냥 출력
			default:
				result += s + " ";
				System.out.println(result);
				break;
			}
		}

		// 만약 비어있지 않으면 팝팝팝!
		if (!ms.isEmpty()) {
			result += ms.pop();
		}

		System.out.println();
		System.out.println();
		System.out.println("후위 표기법 : " + result);

		// 결과계산
		HuAlgo cal = new HuAlgo();
		int cal_result = cal.calC(result);
		System.out.println("결과 : " + cal_result);
	}

}
