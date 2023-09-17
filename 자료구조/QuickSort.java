//퀵 정렬 

public class QuickSort {

	int data[];
	
	
	public QuickSort(int[] data)
	{
		this.data=data;
	}
	
		public void quickSort(int[] data , int start , int end) {
			
		if(start >= end) {  //원소가 1개인 경우 
			return;
		}
		// 키는 피벗을 의미 
		int key= start;  // 키는 첫번째 원소 
		int i=start +1 , j=end ,     temp;
		// 왼쪽 출발지점   // 오른쪽 출발지점     // temp는 값을 바꾸기 위한 임시 변수 
		
		while(i<=j) {  //엇갈릴 때까지 반복 
			while(i<=end && data[i]<= data[key]) {      // 피벗값보다 커야할 값이 피벗값보다 작으면 인덱스 증가로 계속 이동  
				i++;
			}
			
			while(j>start && data[j] >= data[key]) {     // 피벗값보다 작아야 할 값이 피벗값보다 크면 인덱스 감소로 계속 이동 
				j--;
			}
			
			if(i>j) { // 큰 값의 인덱스가 작은 값의 인덱스보다 커지면
					  // 즉, 교차하는 순간이 오면 기존의 인덱스가 j인 작은값과 피벗의 값을 교환.
				temp=data[j];
				data[j]=data[key];
				data[key]=temp;
			}
			else {                // 큰값과 작은 값 값 교환 
				temp=data[i];
				data[i]=data[j];
				data[j]=temp;
			}
		}
		quickSort(data,start,j-1); // 왼쪽 부분배열
		quickSort(data,j+1,end);    // 오른쪽 부분배열 
	}
	
	public static void qs(int[] array) {
		
		QuickSort qs= new QuickSort(array);

		
		System.out.println("퀵 정렬");
//		System.out.print("정렬 전 : " );
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
		System.out.print("걸린 시간 : " + ((endTime - startTime)/1000) + "초");
		System.out.println();
		
	}
	
	   
	public void show() {
		System.out.print("정렬 후 : " );
    	for(int as : data) {
    		System.out.print(as + " ");
    	}
    	
	}

	

}
