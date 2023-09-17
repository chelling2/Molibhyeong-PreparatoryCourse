
public class SunQueue {

	private char[] queue;
	private int front;
	private int rear;

	public SunQueue() {
		queue = new char[5];
		front = 0;
		rear = 0;
	}

	public void Enqueue(char c) {

		shift();
		
		queue[rear++] = c;
		
	}

	public void Dequeue(char c) {
		queue[front++] = 0;
	
	}
	
	
	public void shift() {
		
		if (front > 0 && rear > 4) {

			int k = 0;
			for (int i = front; i < rear; i++) {
				queue[k] = queue[i];
				k++;
			}
			front=0;
			rear = k;
		}
		
	}

	public static void main(String[] args) {

		SunQueue sq = new SunQueue();

		sq.Enqueue('A');
		sq.Enqueue('B');
		sq.Enqueue('C');
		sq.Enqueue('D');

		sq.Dequeue('A');
		sq.Dequeue('B');

		sq.Enqueue('E');
		
		
		sq.Enqueue('F');
		
		for (int p=sq.front; p < sq.rear; p++) {  // Ãâ·Â 

			System.out.println(sq.queue[p]);
		}
		

	}

}
