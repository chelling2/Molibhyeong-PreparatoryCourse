
public class FivoFac {

	public int fibonacci(int input) {

		if (input <= 1) {
			return 1;
		} else {

			return fibonacci(input - 1) + fibonacci(input - 2);
		}
	}

	public int factorial(int input) {

		if (input <= 1) {
			return 1;
		} else {
			return input * factorial(input - 1);
		}
	}

	public static void main(String[] args) {

		FivoFac a = new FivoFac();
		
		
		System.out.println(a.factorial(5));
		System.out.println();
		
		for (int i = 1; i <= 5; i++) 
			System.out.println(a.fibonacci(i));

		

	}

}
