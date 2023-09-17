
public class BinarySearch {

	int binarysearch(int a[] , int value, int low , int high) {
		
		if(high<low) {
			return -1;
		}
		
		int mid = (low + high) / 2;
		
		if(a[mid]>value)
			return binarysearch(a,value,low,mid-1);
		
		else if (a[mid]< value)
			return binarysearch(a,value,mid+1,high);
		
		else
			return mid;
			
	}
	
	
	public static void main(String[] args) {
		
		BinarySearch bs = new BinarySearch();
		
		int[] data= {1,2,3,4,5,6,7,8,9};    // 수행하기 전 배열은 미리 정렬 되어 있어야 함 
		
		// 선언한 배열이 정렬이 되어 있지 않다면 정렬을 수행하고 실시해야한다는 부분이라고 할 수 있다고 말할 수가 있는 것이다.
		
		System.out.println("인덱스는 " + bs.binarysearch(data,9,0,data.length-1));
		
		
		

	}

}
