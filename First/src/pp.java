public class pp {
    
    public static int solution(int n) {
        int sum = 0;
        
        while (n > 0) {
            sum += n % 10;  // n�� ���� �ڸ� ���ڸ� ����
            n /= 10;       // n�� 10���� ���� ���� �ڸ��� ����
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 123;
        int result = solution(n);
        System.out.println(result);
    }
}
