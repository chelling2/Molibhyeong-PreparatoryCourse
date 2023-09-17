import java.net.InetAddress;
import java.net.UnknownHostException;


public class net {

	public static void main(String[] args) {

		try {
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println("�� ���� ip�ּ� : " + ia.getHostAddress());

			InetAddress[] ic = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress po : ic)
				System.out.println("www.naver.com ip�ּ� : " + po.getHostAddress());
			
			System.out.println();
		}
		catch(UnknownHostException e){
			e.printStackTrace();
		}
	}
}
