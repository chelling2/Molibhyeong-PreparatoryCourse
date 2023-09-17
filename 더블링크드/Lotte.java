package 더블링크드;

import java.util.NoSuchElementException;

public class Lotte<E>

{
	private Node<E> head; // 노드의 첫 부분
	private Node<E> tail; // 노드의 마지막 부분
	private int size; // 총 개수

	public Lotte() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void clear() {  //전체 노트 삭제부분
		
		for (Node<E> x = head; x != null;) {
			Node<E> nextNode = x.next;
			x.data = null;
			x.next = null;
			x = nextNode;
		}
		head = tail = null;
		size = 0;
	}

	private Node<E> search(int index) {

		//찾으려는 인덱스가 전체 노드 개수를 나누었을 때 가까운 쪽부터 검색 할 수 있게 한다. 
		//확실히 단방향보다 양방향이 효율적이라는 것을 알 수 있음 
		
		if(index+1>size/2) {    // 노드의 끝부터 탐색 
			Node<E> x = tail;    // tail이 가리키는 노트부터 시작 
			
			for(int i=size-1; i>index; i--) {
				x=x.prev;   // x노드의 이전 노드를 x에 저장한다.
			}
			return x;
		}
		
		
		else {  // 노드의 처음부터 탐색 
		Node<E> x = head; // head가 가리키는 노드부터 시작

		for (int i = 0; i < index; i++) {
			x = x.next; // x노드의 다음 노드를 x에 저장한다
		}
		return x;
		
		}
		
	
	}

	public void addFirst(E value) { // 노드를 추가할 때 첫 부분에 생성함

		Node<E> newNode = new Node<E>(value); // 새 노드 생성
		
		newNode.prev= null;      // @@@@@@@@@@@@@@@@@@@@@@@@ 추가
		
		newNode.next = head; // 새 노드의 다음 노드로 head 노드를 연결
		head = newNode; // head가 가리키는 노드를 새 노드로 변경
		size++;

		if (head.next == null && head.prev == null) {    // @@@@@@@@@@@@ 추가 
			tail = head;
		}

	}

	public void addLast(E value) {
		Node<E> newNode = new Node<E>(value); // 새 노드 생성

		if (size == 0) { // 첫 노드일 경우 addFisrt로 추가
			addFirst(value);
			return;
		}

		newNode.prev = tail;    //@@@@@@@@@@@ 추가 
		tail.next = newNode;
		tail = newNode;
		size++;
	}

	public void add(int index, E value) {  // 중간 위치 데이터 삽입을 위한 용도 

		// 잘못된 인덱스를 참조할 경우 예외 발생
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		// 추가하려는 index가 가장 앞에 추가하려는 경우 addFirst 호출
		if (index == 0) {
			addFirst(value);
			return;
		}
		// 추가하려는 index가 마지막 위치일 경우 addLast 호출
		if (index == size) {
			addLast(value);
			return;
		}

		//---------------------------------------------------
		
		// 추가하려는 위치의 이전 노드
		Node<E> prev_Node = search(index - 1);

		// 추가하려는 위치의 노드
		Node<E> next_Node = prev_Node.next;

		// 추가하려는 노드
		Node<E> newNode = new Node<E>(value);

		
		 // 이전 노드가 가리키는 노드를 끊은 뒤 새 노드로 변경해준다. 또한 새 노드가 가리키는 노드는 next_Node로 설정해준다.
		 
		prev_Node.next = null;
		prev_Node.next = newNode;
		newNode.next = next_Node;
		
		newNode.prev = prev_Node;    // @@@@@@@@@@@@@@@@@@ 추가 
		size++;

	}

	public E remove() { // 헤드 부분부터 삭제

		Node<E> headNode = head;

		if (headNode == null)
			throw new NoSuchElementException();  

		// 삭제된 노드를 반환하기 위한 임시 변수
		E element = headNode.data;

		// head의 다음 노드
		Node<E> nextNode = head.next;
		
		nextNode.prev = null;  //@@@@@@@@@@@ 추가 

		// head 노드의 데이터들을 모두 삭제
		head.data = null;
		head.next = null;

		// head 가 다음 노드를 가리키도록 업데이트
		head = nextNode;
		size--;

		
		 //삭제된 요소가 리스트의 유일한 요소였을 경우 그 요소는 head 이자 tail이었으므로 삭제되면서 tail도 가리킬 요소가 없기 때문에
		 // size가 0일경우 tail도 null로 변환
		 
		if (size == 0) {
			tail = null;
		}
		return element;
	}

	public E remove(int index) { // 특정위치 삭제

		// 삭제하려는 노드가 첫 번째 원소일 경우
		if (index == 0) {
			return remove();
		}

		// 잘못된 범위에 대한 예외
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}

		
		
		Node<E> prevNode = search(index - 1); // 삭제할 노드의 이전 노드
		Node<E> removedNode = prevNode.next; // 삭제할 노드
		Node<E> nextNode = removedNode.next; // 삭제할 노드의 다음 노드

		E element = removedNode.data; // 삭제되는 노드의 데이터를 반환하기 위한 임시변수

		// 이전 노드가 가리키는 노드를 삭제하려는 노드의 다음노드로 변경
		prevNode.next = nextNode;
		
		nextNode.prev = prevNode;     // @@@@@@@@@@@@@ 추가

		// 만약 삭제했던 노드가 마지막 노드라면 tail을 prevNode로 갱신
		if (prevNode.next == null) {
			tail = prevNode;
		}
		// 데이터 삭제
		removedNode.next = null;
		removedNode.data = null;
		size--;

		return element;
	}

	public E get(int index) { // 그 인덱스의 데이터 반환
		return search(index).data;
	}
	
	
	public void print(int index, int sun) {
		
		if(sun==1) {   //앞
			
			Node<E> as= search(index);
			
			while(as!=head) {
				StuIn bitcoin = (StuIn) as.data;
				
				System.out.println(bitcoin.toString());
				
				as=as.prev;
			}
			
			StuIn ripple = (StuIn) head.data;
			
			System.out.println(ripple.toString());
			
		}
		else {  //뒤 출력 
			
			Node<E> as= search(index);
			
			while(as!=tail) {
				StuIn bitcoin = (StuIn) as.data;
				System.out.println(bitcoin.toString());
				as=as.next;
			}

			StuIn ripple = (StuIn) tail.data;
			System.out.println(ripple.toString());

		}
		
		
	}

	

	

}

