class ATM implements Runnable{
	
	private long depositeMoney = 10000;
	
	
	public void run() {
		
		
		synchronized (this){
			
			for(int i=0; i<10; i++) {
				try {
					
					Thread.sleep(1000);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				if(getDepositeMoney() <=0)
					break;
				withDraw(1000);
				
				try {
					notify();
					wait();
				}catch(Exception e) {
					System.out.println("���������K������");
				}     // �̷��� ���ָ� ���� �����ư��鼭 ������ 
				
			}
		}
	}
	
	public void withDraw(long howMuch) {
		if (getDepositeMoney() >0){
			depositeMoney -= howMuch;
			System.out.println(Thread.currentThread().getName() + " , ");
			System.out.printf("�ܾ� : %d�� %n", getDepositeMoney());
		} else {
			System.out.println(Thread.currentThread().getName() + " , ");
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	
	public long getDepositeMoney() {
		return depositeMoney;
	}
}

public class SynchronizedEx{
	
	public static void main(String[] args) {
		
		ATM atm = new ATM();
		Thread mother = new Thread(atm,"mother");
		Thread son = new Thread(atm,"son");
		mother.start();
		son.start();

	}
	
}
	
	
	
	
	
