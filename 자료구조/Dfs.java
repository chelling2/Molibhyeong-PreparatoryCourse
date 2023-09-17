import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

// ���� �켱 Ž��(DFS) ����

public class Dfs {

    static LinkedList<Integer>[] list; // �׷����� ǥ���ϱ� ���� ���� ����Ʈ
    static boolean[] visit; // �湮�� ��带 ǥ���ϴ� �迭
    static int call = 0; // DFS ���� �� �湮�� ��� ���� ���� ����

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int nodes = Integer.parseInt(br.readLine()); // �׷����� ��� �� �Է�
        int edges = Integer.parseInt(br.readLine()); // �׷����� ���� �� �Է�
        
        visit = new boolean[nodes + 1]; // �湮�� ��带 ǥ���ϱ� ���� 'visit' �迭 �ʱ�ȭ
        list = new LinkedList[nodes + 1]; // �׷��� ���� ���踦 �����ϴ� ���� ����Ʈ �ʱ�ȭ

        for (int i = 0; i < nodes + 1; i++) {
            list[i] = new LinkedList<>(); // ���� ����Ʈ�� �� ��帶�� �� ���� ����Ʈ ����
        }

        // �׷����� ���� ������ �Է� �ް� ���� ����Ʈ�� ���� ������ �߰���
        for (int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            list[v1].add(v2); // v1�� v2 ���̿� ���� �߰�
            list[v2].add(v1); // �׷����� ������ �׷����̹Ƿ� v2�� v1 ���̿��� ���� �߰�
        }

        dfs(1); // DFS�� ��� 1���� ���� (��� ��ȣ�� 1���� �����Ѵٰ� ����)
        System.out.println(call - 1); // DFS ���� �� �湮�� ��� ���� ����ϵ�, ���� ��� 1�� ������ ���� ���
    }

    public static void dfs(int start){
        // ���� ��带 �湮 ó��
        visit[start] = true;
        call++; // �湮�� ��� ���� ������Ŵ

        // ���� ����� ��� ���� ��带 �ݺ��ϸ� DFS ����
        Iterator<Integer> iter = list[start].listIterator();
        while (iter.hasNext()){
            int w = iter.next();
            // ���� ��� w�� �湮���� ���� ��� w�� ���� ���� �Ͽ� ��������� DFS ����
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






