import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Bfs {

	private int nodeSu;
	private LinkedList<Integer> list[]; 

	Bfs(int v) {
		nodeSu = v;
		list = new LinkedList[v];
		// v���� LinkedList ���� �� ����
		for (int i = 0; i < v; ++i) {
			list[i] = new LinkedList<>();
		}
	}

	void edgeAdd(int v, int w) { // v��° LinkedList�� w�� ����
		list[v].add(w);
	}

	// BFS �Լ�
	void BFS(int s) {
		boolean visited[] = new boolean[nodeSu]; // �� ����� �湮 ���θ� �����ϱ� ����
		Queue<Integer> queue = new LinkedList<Integer>();

		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			// �湮�� ��带 ť���� �����ϰ� ���� ���
			s = queue.poll();
			System.out.println(s + " ");

			// �湮�� ���� ������ ��� ��带 �����´�.
			Iterator<Integer> i = list[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				// �湮���� ���� ���� �湮�� ������ ǥ���ϰ� ť�� ����
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);   
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
      
        Bfs gp = new Bfs(6);

        gp.edgeAdd(0, 1);
        gp.edgeAdd(0, 2);
        gp.edgeAdd(1, 3);
        gp.edgeAdd(1, 4);
        gp.edgeAdd(2, 4);
        gp.edgeAdd(3, 4);
        gp.edgeAdd(3, 5);
        gp.edgeAdd(4, 5);

        int startNode = 0; 

        System.out.println("BFS Traversal ���� ���: " + startNode);
        gp.BFS(startNode);
    }
}
