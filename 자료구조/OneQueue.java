
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

	public boolean isEmpty() {  //공백일 때 
		
		if(front==rear)
			return true;
		
		return false;
	}
	
	public boolean isFull() {  // 포화 상태일 때
		
		if(front==(rear+1)%n)
			return true;
		
		return false;
		
	}
	
	
	public void Enqueue(char c) {

		if(isFull()) {
			System.out.println("큐 가득 찼어요");
		}else {
			rear = (rear+1) % n;
			queue[rear] = c;
		}	
	}

	public void Dequeue(char c) {
		
		if(isEmpty()) {
			System.out.println("큐 비어 있는데요?");
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
		
		for (int p=0; p <5; p++) {  // 출력 

			System.out.println(oq.queue[p]);
		}
		

	}

}
