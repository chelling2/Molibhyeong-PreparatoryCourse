import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Bfs {

	private int nodeSu;
	private LinkedList<Integer> list[]; 

	Bfs(int v) {
		nodeSu = v;
		list = new LinkedList[v];
		// v개의 LinkedList 선언 및 생성
		for (int i = 0; i < v; ++i) {
			list[i] = new LinkedList<>();
		}
	}

	void edgeAdd(int v, int w) { // v번째 LinkedList에 w를 삽입
		list[v].add(w);
	}

	// BFS 함수
	void BFS(int s) {
		boolean visited[] = new boolean[nodeSu]; // 각 노드의 방문 여부를 저장하기 위해
		Queue<Integer> queue = new LinkedList<Integer>();

		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			// 방문한 노드를 큐에서 추출하고 값을 출력
			s = queue.poll();
			System.out.println(s + " ");

			// 방문한 노드와 인접한 모든 노드를 가져온다.
			Iterator<Integer> i = list[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				// 방문하지 않은 노드면 방문한 것으로 표시하고 큐에 삽입
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

        System.out.println("BFS Traversal 시작 노드: " + startNode);
        gp.BFS(startNode);
    }
}
