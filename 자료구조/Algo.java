import java.util.Scanner;

public class Algo {

	public static int[] array;
	
	public Algo()
	{
		array= new int[10002];
		for(int i=0; i<array.length; i++) {
			array[i]= (int)(Math.random()*100)+1; //1���� 100���� 
		}
		
	}
	
	public static void main(String[] args) {
		
		Algo algo = new Algo();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1.���� 2.���� 3.���� 4.���� 5.�� 6.�� 7.�� 8.��� 9.��� 10.��Ŷ 11.����");
			switch (sc.nextInt()) {

			case 1:
				SelectionSort.sts(array);
				break;
			case 2:
				BubbleSort.bst(array);
				break;
			case 3:
				InsertionSort.is(array);
				break;
			case 4:
				MergeSort.ms(array);
			case 5:
				QuickSort.qs(array);
				break;
			case 6:
				HeapSort.hs(array);
				break;
			case 7:
				ShellSort.ss(array);
				break;
			case 8:
				CountingSort.cs(array);
				break;
			case 9:
				RadixSort.rs(array);
				break;
			case 10:
				BucketSort.bk();
				break;
			case 11:
				System.out.println("���α׷��� �����մϴ�");
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�");
				continue;

			}
		}

	}

}
