
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
		
		int[] data= {1,2,3,4,5,6,7,8,9};    // �����ϱ� �� �迭�� �̸� ���� �Ǿ� �־�� �� 
		
		// ������ �迭�� ������ �Ǿ� ���� �ʴٸ� ������ �����ϰ� �ǽ��ؾ��Ѵٴ� �κ��̶�� �� �� �ִٰ� ���� ���� �ִ� ���̴�.
		
		System.out.println("�ε����� " + bs.binarysearch(data,9,0,data.length-1));
		
		
		

	}

}
