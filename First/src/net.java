import java.net.InetAddress;
import java.net.UnknownHostException;


public class net {

	public static void main(String[] args) {

		try {
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println("내 개인 ip주소 : " + ia.getHostAddress());

			InetAddress[] ic = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress po : ic)
				System.out.println("www.naver.com ip주소 : " + po.getHostAddress());
			
			System.out.println();
		}
		catch(UnknownHostException e){
			e.printStackTrace();
		}
	}
}
