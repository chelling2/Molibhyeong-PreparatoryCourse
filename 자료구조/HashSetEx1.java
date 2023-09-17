import java.util.*;
import static java.lang.System.out;

public class HashSetEx1 {

	public static void main(String[] args) {
		String[] str= {"Java","Beans","Java","XML"};
		
		HashSet<String> hs1 =new HashSet<String>();
		HashSet<String> hs2 =new HashSet<String>();
		
		for(String n : str) {
			if(!hs1.add(n))
				hs2.add(n);
		}
		
		out.println("hs1 : " + hs1);
		hs1.removeAll(hs2);
		out.println("hs1 : " + hs1);
		out.println("hs2 : " + hs2);

	}
	
//	HashSet의 장단점
//	장점 : 중복을 저장하지 않기 때문에 단일 값을 가질 수 있음
//	단점 : 순서가 없기 때문에 일괄처리 불가  , 중복 데이터 비교를 위해 속도가 느림 -> HashCode()를 통해 

}
