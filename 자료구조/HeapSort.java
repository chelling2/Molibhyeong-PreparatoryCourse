
public class HeapSort {

	static int heap[];
	
	
	public static void hs(int[] pp) {
		
		heap=pp;
		
		System.out.println("힙 정렬");
//    	System.out.print("정렬 전 : " );
//    	for(int as : heap) {
//    		System.out.print(as + " ");
//    	}
//    	System.out.println();
    	long startTime, endTime;
		startTime = System.nanoTime();
		
    	// 힙을 구성 
		for(int i=1; i<heap.length; i++) {
			int c = i;
			do {						// 최대 힙 구성을 위함 
				int root = (c-1) / 2;   // 루트의 값보다 왼쪽자식이나 오른쪽 자식값이 더 크면 교환 
				if(heap[root] <heap[c]) {
					int temp = heap[root];
					heap[root]= heap[c];
					heap[c] = temp;
				}
				c= root;
			}while(c!=0);
		}
		
		// 크기를 줄여가며 반복적으로 힙을 구성 
		for(int i= heap.length -1; i>=0; i--) {
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;      // 정렬된 최대힙에서 루트와 끝 인덱스를 바꿈 
			
			int root=0;
			int c=1;
			do {
				c = 2*root +1;
				
				// 자식 중에 더 큰 값을 찾기 
				if(c < i-1 && heap[c] <heap[c+1]) {
					c++;
				}
				
				// 루트보다 자식이 크다면 교환 
				if(c<i && heap[root] <heap[c]) {
					temp = heap[root];
					heap[root]=heap[c];
					heap[c]=temp;
				}                                  // 여기서 또 최대힙 구현 
				root = c;
			}while(c<i);
		}
		
		endTime = System.nanoTime();
		
		
		System.out.print("정렬 후 : " );
    	for(int as : heap) {
    		System.out.print(as + " ");
    	}
    	
    	System.out.println();
    	System.out.print("걸린 시간 : " + ((endTime - startTime)/1000) + "초");
    	System.out.println();

	}

}
