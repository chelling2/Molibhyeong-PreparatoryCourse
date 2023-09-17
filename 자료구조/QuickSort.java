//�� ���� 

public class QuickSort {

	int data[];
	
	
	public QuickSort(int[] data)
	{
		this.data=data;
	}
	
		public void quickSort(int[] data , int start , int end) {
			
		if(start >= end) {  //���Ұ� 1���� ��� 
			return;
		}
		// Ű�� �ǹ��� �ǹ� 
		int key= start;  // Ű�� ù��° ���� 
		int i=start +1 , j=end ,     temp;
		// ���� �������   // ������ �������     // temp�� ���� �ٲٱ� ���� �ӽ� ���� 
		
		while(i<=j) {  //������ ������ �ݺ� 
			while(i<=end && data[i]<= data[key]) {      // �ǹ������� Ŀ���� ���� �ǹ������� ������ �ε��� ������ ��� �̵�  
				i++;
			}
			
			while(j>start && data[j] >= data[key]) {     // �ǹ������� �۾ƾ� �� ���� �ǹ������� ũ�� �ε��� ���ҷ� ��� �̵� 
				j--;
			}
			
			if(i>j) { // ū ���� �ε����� ���� ���� �ε������� Ŀ����
					  // ��, �����ϴ� ������ ���� ������ �ε����� j�� �������� �ǹ��� ���� ��ȯ.
				temp=data[j];
				data[j]=data[key];
				data[key]=temp;
			}
			else {                // ū���� ���� �� �� ��ȯ 
				temp=data[i];
				data[i]=data[j];
				data[j]=temp;
			}
		}
		quickSort(data,start,j-1); // ���� �κй迭
		quickSort(data,j+1,end);    // ������ �κй迭 
	}
	
	public static void qs(int[] array) {
		
		QuickSort qs= new QuickSort(array);

		
		System.out.println("�� ����");
//		System.out.print("���� �� : " );
//    	for(int as : qs.data) {
//    		System.out.print(as + " ");
//    	}
//    	System.out.println();
    	long startTime, endTime;
		startTime = System.nanoTime();
		
		qs.quickSort(qs.data,0,qs.data.length-1);
		
		endTime = System.nanoTime();
		
		qs.show();
		System.out.println();
		System.out.print("�ɸ� �ð� : " + ((endTime - startTime)/1000) + "��");
		System.out.println();
		
	}
	
	   
	public void show() {
		System.out.print("���� �� : " );
    	for(int as : data) {
    		System.out.print(as + " ");
    	}
    	
	}

	

}
