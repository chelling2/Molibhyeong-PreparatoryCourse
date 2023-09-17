public class ShellSort {
	
  
    // gap만큼 떨어진 요소들을 삽입 정렬
    // 정렬의 범위는 first에서 last까지
    public static void Sort(int[] list, int first, int last, int gap) {
    	
        int i, j, key;

        i = first + gap;   // 현재 원소에서 간격 만큼 떨어진 인덱스 
        while (i <= last) {
            key = list[i]; // 현재 삽입될 숫자인 i번째 정수를 key 변수로 복사

            j = i - gap;    //현재 원소 인덱스
            
            while (j >= first && list[j] > key) {
                list[j + gap] = list[j]; // 레코드를 gap만큼 오른쪽으로 이동
                j = j - gap;
            }

            list[j + gap] = key;  //현재 가리키는 숫자에 키값 넣음 
            i = i + gap;
        }
    }

    // 셸 정렬
    public static void shellSort(int[] list, int n) {
    	
        int i, gap;

        for (gap = n / 2; gap > 0; gap = gap / 2) {
            if ((gap % 2) == 0) {
                gap++; // gap을 홀수로 만든다.
            }

            // 부분 리스트의 개수는 gap과 같다.
            for (i = 0; i < gap; i++) {
                // 부분 리스트에 대한 삽입 정렬 수행
                Sort(list, i, n - 1, gap);
            }
        }
    }

    public static void ss(int[] vb) {
    	
        int[] list = vb;


		System.out.println("셸 정렬");
//    	System.out.print("정렬 전 : " );
//    	for(int as : list) {
//    		System.out.print(as + " ");
//    	}
//    	System.out.println();
        
    	long startTime, endTime;
		startTime = System.nanoTime();
		
        shellSort(list, list.length);

        endTime = System.nanoTime();
        
        System.out.print("정렬 후 : " );
    	for(int as : list) {
    		System.out.print(as + " ");
    	}
    	
    	System.out.println();
    	System.out.print("걸린 시간 : " + ((endTime - startTime)/1000) + "초");
    	System.out.println();
    }
}
