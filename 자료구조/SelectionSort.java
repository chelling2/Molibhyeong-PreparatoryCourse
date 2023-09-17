
public class SelectionSort {

	public static void sts(int [] m){
		int i, j, min, temp;
		int[] array=m;
		
		
		System.out.println("선택 정렬");
		
//		System.out.print("정렬 전 : " );
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
				}     // 작은 값의 인덱스를 구한 후,
			}
			
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}   //작은값과 돌리는 값의 위치를 바꿈.

		endTime = System.nanoTime();
		
		System.out.print("정렬 후 : " );
		for(int as : array) {
    		System.out.print(as + " ");
    	}
		
		System.out.println();
		System.out.print("걸린 시간 : " + ((endTime - startTime)/1000) + "초");
		System.out.println();
		
	}

}
