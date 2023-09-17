import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 깊이 우선 탐색(DFS) 예제

public class Dfs {

    static LinkedList<Integer>[] list; // 그래프를 표현하기 위한 인접 리스트
    static boolean[] visit; // 방문한 노드를 표시하는 배열
    static int call = 0; // DFS 수행 시 방문한 노드 수를 세는 변수

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int nodes = Integer.parseInt(br.readLine()); // 그래프의 노드 수 입력
        int edges = Integer.parseInt(br.readLine()); // 그래프의 간선 수 입력
        
        visit = new boolean[nodes + 1]; // 방문한 노드를 표시하기 위해 'visit' 배열 초기화
        list = new LinkedList[nodes + 1]; // 그래프 연결 관계를 저장하는 인접 리스트 초기화

        for (int i = 0; i < nodes + 1; i++) {
            list[i] = new LinkedList<>(); // 인접 리스트의 각 노드마다 빈 연결 리스트 생성
        }

        // 그래프의 간선 정보를 입력 받고 인접 리스트에 연결 정보를 추가함
        for (int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            list[v1].add(v2); // v1과 v2 사이에 간선 추가
            list[v2].add(v1); // 그래프가 무방향 그래프이므로 v2와 v1 사이에도 간선 추가
        }

        dfs(1); // DFS를 노드 1에서 시작 (노드 번호가 1부터 시작한다고 가정)
        System.out.println(call - 1); // DFS 수행 후 방문한 노드 수를 출력하되, 시작 노드 1을 제외한 수를 출력
    }

    public static void dfs(int start){
        // 현재 노드를 방문 처리
        visit[start] = true;
        call++; // 방문한 노드 수를 증가시킴

        // 현재 노드의 모든 인접 노드를 반복하며 DFS 수행
        Iterator<Integer> iter = list[start].listIterator();
        while (iter.hasNext()){
            int w = iter.next();
            // 인접 노드 w가 방문되지 않은 경우 w를 시작 노드로 하여 재귀적으로 DFS 수행
            if (!visit[w])
                dfs(w);
        }
    }
}




//
//public class DFS {
//	
//	static boolean[] visit = new boolean[8];
//	static int [][] graph = { {} ,{2,4,5} ,{1,7} ,{6,4,2} ,{} ,{3,1} ,{3,4} ,{4,6}};  
//	
//	public static void main(String[]args) {
//		
//		dfs(1);
//	}
//	
//	public static void dfs(int a) {
//		visit[a] = true;
//		
//		System.out.print(a+ "->");
//	
//	for(int n: graph[a]) {
//		if(!visit[n]) {
//			dfs(n);
//		}
//	}
//	}
//
//}






