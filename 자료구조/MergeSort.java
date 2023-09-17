// 병합정렬 

public class MergeSort {  
   

	int[] sorted;     //정렬된 배열 결과 배열을 담을 수 있는 공간  
	                  //정렬 배열은 반드시 전역 변수로 선언 
					  //전역변수로 동일하게 모든함수가 공통적으로 사용
	                  // 불필요한 메모리 사용문제 최소화
	
	
	public MergeSort(int a) {
		sorted= new int[a]; 
	}
	 
	
	
	//2개의 정렬 된 부분배열을 이용해서 새롭게 정렬된 배열을 만듬
	public void merge(int a[], int m , int middle, int n) {
		int i=m;
		int j= middle+1;
		int k=m;      //새롭게 만든 배열에 첫 인덱스 부분
		
		 //작은 순서대로 배열에 삽입
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
		
		// 남은 데이터도 삽입   
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
		
		// 결과적으로 정렬된 배열
		for(int t=m; t<=n; t++) {
			a[t]=sorted[t];
		}
	}
	
	
	    
      //재귀호출 및 반으로 나눔 
	public void mergeSort(int a[] , int m, int n) {
		
		// 크기가 1보다 큰 경우 
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
    	
    	System.out.println("병합 정렬");
//    	System.out.print("정렬 전 : " );
//    	for(int as : array) {
//    		System.out.print(as + " ");
//    	}
//    	System.out.println();
    	
    	long startTime, endTime;
		startTime = System.nanoTime();
		
    	ms.mergeSort(array,0,array.length-1);
    	
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
