
public class SelectionSort {

	public static void sts(int [] m){
		int i, j, min, temp;
		int[] array=m;
		
		
		System.out.println("���� ����");
		
//		System.out.print("���� �� : " );
//    	for(int as : array) {
//    		System.out.print(as + " ");
//    	}
    	
//    	System.out.println();
		
    	long startTime, endTime;
		startTime = System.nanoTime();
		
		for (i = 0; i < array.length-1; i++) {
			min = i;
			for (j = i+1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}     // ���� ���� �ε����� ���� ��,
			}
			
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}   //�������� ������ ���� ��ġ�� �ٲ�.

		endTime = System.nanoTime();
		
		System.out.print("���� �� : " );
		for(int as : array) {
    		System.out.print(as + " ");
    	}
		
		System.out.println();
		System.out.print("�ɸ� �ð� : " + ((endTime - startTime)/1000) + "��");
		System.out.println();
		
	}

}
