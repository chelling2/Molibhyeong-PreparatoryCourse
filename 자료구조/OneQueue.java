
public class OneQueue {

	private char[] queue;
	private int front;
	private int rear;
	private int n;

	public OneQueue() {
		queue = new char[5];
		front = 0;
		rear = 0;
		n = queue.length;
	}

	public boolean isEmpty() {  //������ �� 
		
		if(front==rear)
			return true;
		
		return false;
	}
	
	public boolean isFull() {  // ��ȭ ������ ��
		
		if(front==(rear+1)%n)
			return true;
		
		return false;
		
	}
	
	
	public void Enqueue(char c) {

		if(isFull()) {
			System.out.println("ť ���� á���");
		}else {
			rear = (rear+1) % n;
			queue[rear] = c;
		}	
	}

	public void Dequeue(char c) {
		
		if(isEmpty()) {
			System.out.println("ť ��� �ִµ���?");
		}else {
			front = (front+1) % n;
			queue[front] = 0;
		}
	}
	
	
	public static void main(String[] args) {

		OneQueue oq = new OneQueue();

		oq.Enqueue('A');
		
		oq.Enqueue('B');
		oq.Enqueue('C');
		oq.Enqueue('D');

		oq.Dequeue('A');
		oq.Dequeue('B');

		oq.Enqueue('E');
		
	
		oq.Enqueue('F');
		
		for (int p=0; p <5; p++) {  // ��� 

			System.out.println(oq.queue[p]);
		}
		

	}

}
