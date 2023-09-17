package 단일환형;

import java.util.NoSuchElementException;

public class Lotte<E>

{
	private Node<E> head; // ����� ù �κ�
	private Node<E> tail; // ����� ������ �κ�
	private int size; // �� ����

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

	public void clear() {  //��ü ��Ʈ �����κ�
		
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

		Node<E> x = head; // head�� �⸮Ű�� ������ ����

		for (int i = 0; i < index; i++) {
			x = x.next; // x����� ���� ��带 x�� �����Ѵ�
		}
		return x;
	}

	public void addFirst(E value) {
	    Node<E> newNode = new Node<E>(value); // �� ��� ����

	    if (head == null) { // ����Ʈ�� ����ִ� ���
	        head = newNode;
	        head.next = head; // �ڱ� �ڽŰ� �����Ͽ� �������� ����
	        tail = head; // ù ����̹Ƿ� tail�� head�� ����Ŵ
	    } else {
	        newNode.next = head; // �� ����� ���� ���� head ��带 ����
	        head = newNode; // head�� ����Ű�� ��带 �� ���� ����
	        tail.next = head; // tail�� ����Ű�� ��带 head�� �����Ͽ� �������� ����
	    }

	    size++;
	}


	public void addLast(E value) {
	    Node<E> newNode = new Node<E>(value); // �� ��� ����

	    if (size == 0) { // ù ����� ��� addFirst�� �߰�
	        addFirst(value);
	        return;
	    }

	    tail.next = newNode; // ���� tail�� ���� ��带 �� ���� ����
	    tail = newNode; // tail�� �� ���� �����Ͽ� ���ο� tail�� ����
	    tail.next = head; // ���ο� tail�� ���� ��带 head�� �����Ͽ� �������� ����

	    size++;
	}


	public void add(int index, E value) {  // �߰� ��ġ ������ ������ ���� �뵵 

		// �߸��� �ε����� ������ ��� ���� �߻�
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		// �߰��Ϸ��� index�� ���� �տ� �߰��Ϸ��� ��� addFirst ȣ��
		if (index == 0) {
			addFirst(value);
			return;
		}
		// �߰��Ϸ��� index�� ������ ��ġ�� ��� addLast ȣ��
		if (index == size) {
			addLast(value);
			return;
		}

		// �߰��Ϸ��� ��ġ�� ���� ���
		Node<E> prev_Node = search(index - 1);

		// �߰��Ϸ��� ��ġ�� ���
		Node<E> next_Node = prev_Node.next;

		// �߰��Ϸ��� ���
		Node<E> newNode = new Node<E>(value);

		
		 // ���� ��尡 ����Ű�� ��带 ���� �� �� ���� �������ش�. ���� �� ��尡 ����Ű�� ���� next_Node�� �������ش�.
		 
		prev_Node.next = null;
		prev_Node.next = newNode;
		newNode.next = next_Node;
		size++;

	}

	public E remove() { // ��� �κк��� ����

		Node<E> headNode = head;

		if (headNode == null)
			throw new NoSuchElementException();  

		// ������ ��带 ��ȯ�ϱ� ���� �ӽ� ����
		E element = headNode.data;

		// head�� ���� ���
		Node<E> nextNode = head.next;

		// head ����� �����͵��� ��� ����
		head.data = null;
		head.next = null;

		// head �� ���� ��带 ����Ű���� ������Ʈ
		head = nextNode;
		tail.next=nextNode;                  // �߰� 
		size--;

		
		 //������ ��Ұ� ����Ʈ�� ������ ��ҿ��� ��� �� ��Ҵ� head ���� tail�̾����Ƿ� �����Ǹ鼭 tail�� ����ų ��Ұ� ���� ������
		 // size�� 0�ϰ�� tail�� null�� ��ȯ
		 
		if (size == 0) {
			tail = null;
		}
		return element;
	}

	public E remove(int index) { // Ư����ġ ����

		// �����Ϸ��� ��尡 ù ��° ������ ���
		if (index == 0) {
			return remove();
		}

		// �߸��� ������ ���� ����
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}

		Node<E> prevNode = search(index - 1); // ������ ����� ���� ���
		Node<E> removedNode = prevNode.next; // ������ ���
		Node<E> nextNode = removedNode.next; // ������ ����� ���� ���

		E element = removedNode.data; // �����Ǵ� ����� �����͸� ��ȯ�ϱ� ���� �ӽú���

		// ���� ��尡 ����Ű�� ��带 �����Ϸ��� ����� �������� ����
		prevNode.next = nextNode;

		// ���� �����ߴ� ��尡 ������ ����� tail�� prevNode�� ����
		if (prevNode.next == null) {
			tail = prevNode;
			prevNode.next=head;                //@@@@@@@@@@@@@@@@@@@@@@@@@ �߰� �κ� 
		}
		// ������ ����
		removedNode.next = null;
		removedNode.data = null;
		size--;

		return element;
	}

	public E get(int index) { // �� �ε����� ������ ��ȯ
		return search(index).data;
	}
	
	
	  public void print(int index) {
		  
		  if(index<0) {    // 1 �Է½� -1
			  Node<E> currentNode = search(index+1);    // 0 ã�� 
			  int count=0;
			  
			  while(count!=size) {
				  
				  StuIn s = (StuIn) currentNode.data;
				   System.out.println(s.toString());
				   System.out.println();
				   currentNode=currentNode.next;
				   count++;
				   
				   if(count==size) {
					   break;
				   }
			  }
			  
		  }
		  else {
		   
		   Node<E> currentNode = search(index);
		   Node<E> nextNode = currentNode.next;
		   
		   while(currentNode!=nextNode) {			   
			   StuIn s = (StuIn) nextNode.data;
			   System.out.println(s.toString());
			   System.out.println();
			   nextNode=nextNode.next;
			   
			 if(currentNode==nextNode) { 
				 StuIn ss = (StuIn) currentNode.data;
				 System.out.println(ss.toString());
				 break;
			 }
			
		   }
		  }
  }

}
