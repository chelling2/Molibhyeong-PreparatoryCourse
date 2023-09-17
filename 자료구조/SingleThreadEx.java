
public class SingleThreadEx implements Runnable{
// extends Thread
	
	private int[] temp;

	
	public SingleThreadEx() {
		
		
		temp=new int[10];
		
		for(int start=0; start<temp.length; start++) {
			temp[start]= start;
		}
		
		
	}
	
	public void run() {
		
		
		for(int start : temp) {
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.printf("������ �̸� : %s ", Thread.currentThread().getName());
			System.out.printf("temp value : %d %n", start);
				
		}
	}
	
	
	public static void main(String[] args) {
		
		SingleThreadEx st = new SingleThreadEx();
		Thread th = new Thread(st,"ù����");
		
		th.start();

	}

	

}
