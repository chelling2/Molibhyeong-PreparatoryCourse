import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.Scanner;
import java.util.Set;

public class StudentMain3 {

	Map<String,StuIn> si;
	Scanner sc;
	
	public StudentMain3() {
		si = new HashMap<>();
		sc = new Scanner(System.in);
	}

	public void studentInput() {

		System.out.println("Id를 입력하세요");
		String abc= sc.next();
		
		System.out.println("이름 국어 영어 수학점수를 각각 입력해주세요");
		si.put(abc,new StuIn(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		
	}

	public void studentModify() {
		
		if (!si.isEmpty()) {
			
			System.out.println("Id 입력 하세요");
			String abc= sc.next();
			
		System.out.println("국어는 1 영어는 2 수학은 3 입력하세요");
		int s = sc.nextInt();

		if (s == 1) {
			System.out.println("수정 할 점수 입력하세요");
			si.get(abc).setKor(sc.nextInt());
		} else if (s == 2) {
			System.out.println("수정 할 점수 입력하세요");
			si.get(abc).setEng(sc.nextInt());
		} else if (s == 3) {
			System.out.println("수정 할 점수 입력하세요");
			si.get(abc).setMath(sc.nextInt());
		} else {
			System.out.println("잘못 입력하였습니다");
		}
		}
		else {
			System.out.println("현재 학생이 등록되지 않았습니다");
		}
	}

	public void studentDelete() {

		if (!si.isEmpty()) {
			
			System.out.println("Id 입력 하세요");
			String abc= sc.next();


			si.remove(abc);
			
		} else {
			System.out.println("현재 등록된 학생이 없습니다.");
		}
	}

	public void studentSearch() {

		if (!si.isEmpty()) {

			System.out.println("아이디는(개인) 1  과목점수기준(전체출력)은 2를 입력해주세요");
			int pa = sc.nextInt();

			if (pa == 1) {

				System.out.println("Id 입력 하세요");
				String abc= sc.next();
				
				if(si.containsKey(abc)) {
				System.out.println("Id:"+ abc + "\t"+ si.toString());
				}
				else {
					System.out.println("존재하지 않는 Id입니다.");
				}
				
				
			} else if (pa == 2) {

				
				System.out.println("1.국어  2.영어   3.수학   4.평균");
				int op = sc.nextInt();

				if (op == 1) {
					System.out.println("기준 점수를 몇점으로 하실건가요?");
					int ct = sc.nextInt();

					System.out.println("1.기준점수 이상 2. 기준점수 이하");
					int ck = sc.nextInt();

					Set<String> keySet = si.keySet();
					
					if (ck == 1) {

						for(String st : keySet) {
							
							if (si.get(st).getKor() >= ct) {
								System.out.println("Id:"+ st + "\t"+ "이름:" + si.get(st).getName() + "\t" + "국어점수:" + si.get(st).getKor());
							}
						}
					
						
					} else if (ck == 2) {

						for(String st : keySet) {

							if (si.get(st).getKor() <= ct) {
								System.out.println("Id:"+ st + "\t"+ "이름:" + si.get(st).getName() + "\t" + "국어점수:" + si.get(st).getKor());
							}
						}

					}

					else {
						System.out.println("잘못 입력하였습니다");

					}
				} // 국어 일 때

				
				// 영어 일때
				if (op == 2) {
					
					System.out.println("기준 점수를 몇점으로 하실건가요?");
					int ct = sc.nextInt();

					System.out.println("1.기준점수 이상 2. 기준점수 이하");
					int ck = sc.nextInt();
					
					Set<String> keySet = si.keySet();

					if (ck == 1) {

						for(String st : keySet) {

							if (si.get(st).getEng() >= ct) {
								System.out.println("Id:"+ st + "\t"+ "이름:" + si.get(st).getName() + "\t" + "영어점수:" + si.get(st).getEng());
							}
						}

					} else if (ck == 2) {

						for(String st : keySet) {

							if (si.get(st).getEng() <= ct) {
								System.out.println("Id:"+ st + "\t"+ "이름:" + si.get(st).getName() + "\t" + "영어점수:" + si.get(st).getEng());
							}
						}

					}

					else {
						System.out.println("잘못 입력하였습니다");

					}
				} // 영어 일 때

				
				// 수학일 때
				if (op == 3) {
					System.out.println("기준 점수를 몇점으로 하실건가요?");
					int ct = sc.nextInt();

					System.out.println("1.기준점수 이상 2. 기준점수 이하");
					int ck = sc.nextInt();

					Set<String> keySet = si.keySet();
					
					if (ck == 1) {

						for(String st : keySet) {

							if (si.get(st).getMath() >= ct) {
								System.out.println("Id:"+ st + "\t"+ "이름:" + si.get(st).getName() + "\t" + "수학점수:" + si.get(st).getMath());
							}
						}

					} else if (ck == 2) {

						for(String st : keySet) {

							if (si.get(st).getMath() <= ct) {
								System.out.println("Id:"+ st + "\t"+ "이름:" + si.get(st).getName() + "\t" + "수학점수:" + si.get(st).getMath());
							}
						}

					}

					else {
						System.out.println("잘못 입력하였습니다");

					}
				} // 수학 일 때

				// 평균일 때
				if (op == 4) {
					System.out.println("기준 점수를 몇점으로 하실건가요?");
					int ct = sc.nextInt();

					System.out.println("1.기준점수 이상 2. 기준점수 이하");
					int ck = sc.nextInt();

					Set<String> keySet = si.keySet();
					
					if (ck == 1) {

						for(String st : keySet) {

							if (si.get(st).getAvg() >= ct) {
								System.out.println("Id:"+ st + "\t"+ "이름:" + si.get(st).getName() + "\t" + "평균점수:" + si.get(st).getAvg());
							}
						}

					} else if (ck == 2) {

						for(String st : keySet) {

							if (si.get(st).getAvg() <= ct) {
								System.out.println("Id:"+ st + "\t"+ "이름:" + si.get(st).getName() + "\t" + "평균점수:" + si.get(st).getAvg());
							}
						}

					}

					else {
						System.out.println("잘못 입력하였습니다");

					}
				} // 평균일 때
			}
		} 
		else {
			System.out.println("현재 학생이 없습니다.");
		}
	}

	public void studentOutput() {

		
		if (!si.isEmpty()) {

			
			System.out.println("1. Id순  2. 성적 순");
			int y = sc.nextInt();

			if (y == 1) {

				String[] n = new String[si.size()];
				Set<String> keySet = si.keySet();
				int i=0;
				
					for(String st : keySet) {
						
						n[i] = st;
						i++;
					}
				
				Arrays.sort(n);
				
				
				for(int k=0; k<n.length; k++) {
					
					for(String st : keySet) {
					
					if(st.equals(n[k])) {
						System.out.println("Id:"+ st + "\t"+ si.get(st).toString());
						break;
					}
					}
					
				}
				}
		

			else if (y == 2) {

				Double[] n = new Double[si.size()];
				Set<String> keySet = si.keySet();
				
				int i=0;
				
					for(String st : keySet) {
						
						n[i] = si.get(st).getAvg();
						i++;
					}
				
				Arrays.sort(n);
				
				
				for(int k=n.length-1; k>=0; k--) {
					
					for(String st : keySet) {
					
					if(n[k]==si.get(st).getAvg()) {
						System.out.println("Id:"+ st + "\t"+ si.get(st).toString());
						break;
					}
					}
				}

			}

			else {
				System.out.println("잘못 입력하였습니다");

			}
		}
		else {
			System.out.println("현재 출력할 사람이 없습니다");
		} 
	}

}
