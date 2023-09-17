// �������� 

public class MergeSort {  
   

	int[] sorted;     //���ĵ� �迭 ��� �迭�� ���� �� �ִ� ����  
	                  //���� �迭�� �ݵ�� ���� ������ ���� 
					  //���������� �����ϰ� ����Լ��� ���������� ���
	                  // ���ʿ��� �޸� ��빮�� �ּ�ȭ
	
	
	public MergeSort(int a) {
		sorted= new int[a]; 
	}
	 
	
	
	//2���� ���� �� �κй迭�� �̿��ؼ� ���Ӱ� ���ĵ� �迭�� ����
	public void merge(int a[], int m , int middle, int n) {
		int i=m;
		int j= middle+1;
		int k=m;      //���Ӱ� ���� �迭�� ù �ε��� �κ�
		
		 //���� ������� �迭�� ����
		while(i<=middle && j<=n) {
			if(a[i]<=a[j]) {       
				sorted[k]=a[i];
				i++;
			}
			else {
				sorted[k]=a[j];
				j++;
			}
			k++;
		}
		
		// ���� �����͵� ����   
		if(i > middle) {
			for(int t=j; t<=n; t++) {
				sorted[k]=a[t];
				k++;
			}
		}
		else {
			for(int t=i; i<=middle; i++) {
				sorted[k]=a[t];
				k++;
			}
		}
		
		// ��������� ���ĵ� �迭
		for(int t=m; t<=n; t++) {
			a[t]=sorted[t];
		}
	}
	
	
	    
      //���ȣ�� �� ������ ���� 
	public void mergeSort(int a[] , int m, int n) {
		
		// ũ�Ⱑ 1���� ū ��� 
		if(m<n) {
			int middle = (m+n)/2;
			mergeSort(a,m,middle);
			mergeSort(a,middle+1,n);
			merge(a,m,middle,n);
			
		}
	}
	
	
    public static void ms(int[] k) {
    	
    	int[] array = k;
    	
    	MergeSort ms= new MergeSort(array.length);
    	
    	System.out.println("���� ����");
//    	System.out.print("���� �� : " );
//    	for(int as : array) {
//    		System.out.print(as + " ");
//    	}
//    	System.out.println();
    	
    	long startTime, endTime;
		startTime = System.nanoTime();
		
    	ms.mergeSort(array,0,array.length-1);
    	
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
