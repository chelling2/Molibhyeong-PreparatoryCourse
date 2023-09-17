public class pp {
    
    public static int solution(int n) {
        int sum = 0;
        
        while (n > 0) {
            sum += n % 10;  // n의 일의 자리 숫자를 더함
            n /= 10;       // n을 10으로 나눠 일의 자리를 제거
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 123;
        int result = solution(n);
        System.out.println(result);
    }
}
