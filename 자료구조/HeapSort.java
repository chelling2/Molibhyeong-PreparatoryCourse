
public class HeapSort {

	static int heap[];
	
	
	public static void hs(int[] pp) {
		
		heap=pp;
		
		System.out.println("�� ����");
//    	System.out.print("���� �� : " );
//    	for(int as : heap) {
//    		System.out.print(as + " ");
//    	}
//    	System.out.println();
    	long startTime, endTime;
		startTime = System.nanoTime();
		
    	// ���� ���� 
		for(int i=1; i<heap.length; i++) {
			int c = i;
			do {						// �ִ� �� ������ ���� 
				int root = (c-1) / 2;   // ��Ʈ�� ������ �����ڽ��̳� ������ �ڽİ��� �� ũ�� ��ȯ 
				if(heap[root] <heap[c]) {
					int temp = heap[root];
					heap[root]= heap[c];
					heap[c] = temp;
				}
				c= root;
			}while(c!=0);
		}
		
		// ũ�⸦ �ٿ����� �ݺ������� ���� ���� 
		for(int i= heap.length -1; i>=0; i--) {
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;      // ���ĵ� �ִ������� ��Ʈ�� �� �ε����� �ٲ� 
			
			int root=0;
			int c=1;
			do {
				c = 2*root +1;
				
				// �ڽ� �߿� �� ū ���� ã�� 
				if(c < i-1 && heap[c] <heap[c+1]) {
					c++;
				}
				
				// ��Ʈ���� �ڽ��� ũ�ٸ� ��ȯ 
				if(c<i && heap[root] <heap[c]) {
					temp = heap[root];
					heap[root]=heap[c];
					heap[c]=temp;
				}                                  // ���⼭ �� �ִ��� ���� 
				root = c;
			}while(c<i);
		}
		
		endTime = System.nanoTime();
		
		
		System.out.print("���� �� : " );
    	for(int as : heap) {
    		System.out.print(as + " ");
    	}
    	
    	System.out.println();
    	System.out.print("�ɸ� �ð� : " + ((endTime - startTime)/1000) + "��");
    	System.out.println();

	}

}
