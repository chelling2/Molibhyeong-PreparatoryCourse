
// 구현 클래스

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class StudentMain2 {
	
	//Set은 순서가 없어 객체를 인덱스로 접근해서 꺼내올 수 없기 때문에 
	// count는 각각의 객체를 구분하기 위해서 임의로 넣은 인덱스라고 보면 됨.
	Set<StuIn> si;
	Scanner sc;
	// Iterator<StuIn> iterator;  구현하진 않음
	int count = 0;

	public StudentMain2() {
		si = new HashSet<>();
		sc = new Scanner(System.in);
	//	iterator = si.iterator();
	}

	
	public void studentInput() {

		System.out.println("이름 국어 영어 수학점수를 각각 입력해주세요");
		si.add(new StuIn(count, sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		count++;
	}

	public void studentModify() {

		if (!si.isEmpty()) {
			System.out.println("수정할 학생 이름을 입력하세요");
			String mm = sc.next();

			for (StuIn st : si) {

				if (st.getName().equals(mm)) {

					System.out.println(st.getCount()  + " " + st.toString());
				}
			}

			System.out.println("수정할 번호를 입력해주세요");
			int po = sc.nextInt();

			for (StuIn sta : si) {

				if (sta.getCount() == po - 1) {

					System.out.println("국어는 1 영어는 2 수학은 3 입력하세요");
					int s = sc.nextInt();

					if (s == 1) {
						System.out.println("수정 할 점수 입력하세요");
						sta.setKor(sc.nextInt());
						
					} else if (s == 2) {
						System.out.println("수정 할 점수 입력하세요");
						sta.setEng(sc.nextInt());
					} else if (s == 3) {
						System.out.println("수정 할 점수 입력하세요");
						sta.setMath(sc.nextInt());
					} else {
						System.out.println("잘못 입력하였습니다");
					}

				}
			}
		}

		else {
			System.out.println("현재 학생이 등록되지 않았습니다");
		}

	}

	public void studentDelete() {

		if (!si.isEmpty()) {

			System.out.println("삭제할 학생 이름을 입력하세요");
			String mm = sc.next();

			for (StuIn st : si) {

				if (st.getName().equals(mm)) {

					System.out.println(st.getCount()  + " " + st.toString());
				}
			}

			System.out.println("삭제할 번호를 입력해주세요");
			int po = sc.nextInt();

			for (StuIn sta : si) {

				if (sta.getCount() == po - 1) {
					si.remove(sta);
					break;

				}
			}

		} else {
			System.out.println("현재 등록된 학생이 없습니다.");
		}
	}

	public void studentSearch() {

		if (!si.isEmpty()) {

			System.out.println("이름은 1번  과목점수기준은 2번을 입력해주세요");
			int pa = sc.nextInt();

			if (pa == 1) {

				System.out.println("검색할 학생의 이름을 입력해주세요");
				String aa = sc.next();

				for (StuIn st : si) {

					if (st.getName().equals(aa)) {
						System.out.println(st.getCount()  + " " + st.toString());
					}

				}

			}

			else if (pa == 2) {

				System.out.println("1.국어  2.영어   3.수학   4.평균");
				int op = sc.nextInt();

				if (op == 1) {
					System.out.println("기준 점수를 몇점으로 하실건가요?");
					int ct = sc.nextInt();

					System.out.println("1.기준점수 이상 2. 기준점수 이하");
					int ck = sc.nextInt();

					if (ck == 1) {

						for (StuIn st : si) {

							if (st.getKor() >= ct) {
								System.out.println("이름:" + st.getName() + "\t" + "국어점수:" + st.getKor());
							}
						}

					} else if (ck == 2) {

						for (StuIn st : si) {

							if (st.getKor() <= ct) {
								System.out.println("이름:" + st.getName() + "\t" + "국어점수:" + st.getKor());
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

					if (ck == 1) {

						for (StuIn st : si) {

							if (st.getEng() >= ct) {
								System.out.println("이름:" + st.getName() + "\t" + "영어점수:" + st.getEng());
							}
						}

					} else if (ck == 2) {

						for (StuIn st : si) {

							if (st.getEng() <= ct) {
								System.out.println("이름:" + st.getName() + "\t" + "영어점수:" + st.getEng());
							}
						}
					}

					else {
						System.out.println("잘못 입력하였습니다");

					}
				} // 영어일 때

				// 수학일 때
				if (op == 3) {
					System.out.println("기준 점수를 몇점으로 하실건가요?");
					int ct = sc.nextInt();

					System.out.println("1.기준점수 이상 2. 기준점수 이하");
					int ck = sc.nextInt();

					if (ck == 1) {

						for (StuIn st : si) {
							if (st.getMath() >= ct) {
								System.out.println("이름:" + st.getName() + "\t" + "수학점수:" + st.getMath());
							}
						}

					} else if (ck == 2) {

						for (StuIn st : si) {
							if (st.getMath() <= ct) {
								System.out.println("이름:" + st.getName() + "\t" + "수학점수:" + st.getMath());
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

					if (ck == 1) {

						for (StuIn st : si) {
							if (st.getAvg() >= ct) {
								System.out.println("이름:" + st.getName() + "\t" + "평균점수:" + st.getAvg());
							}
						}

					} else if (ck == 2) {

						for (StuIn st : si) {
							if (st.getAvg() <= ct) {
								System.out.println("이름:" + st.getName() + "\t" + "평균점수:" + st.getAvg());
							}
						}
					}

					else {
						System.out.println("잘못 입력하였습니다");

					}
				} // 평균일 때
			}
		} else {
			System.out.println("현재 학생이 없습니다.");
		}
	}

	public void studentOutput() {

		if (!si.isEmpty()) {

			Set<StuIn> sicp = new HashSet<>(si);

			System.out.println("1. 이름 순  2. 성적 순");
			int y = sc.nextInt();

			if (y == 1) {  // 이름 순으로 전체 정렬

				String[] n = new String[si.size()];

				int i = 0;

				for (StuIn st : si) {
					n[i] = st.getName();
					i++;
				}

				Arrays.sort(n);

				for (int k = 0; k < n.length; k++) {

					for(StuIn st : sicp) {

						if (st.getName().equals(n[k])) {
							System.out.println(st.getCount()  + " " + st.toString());

							sicp.remove(st);
							break;
						}

					}

				}

			}

			else if (y == 2) { //성적순(평균값)으로 전체 정렬 

				Double[] n = new Double[si.size()];

				int i = 0;

				for (StuIn st : si) {
					n[i] = st.getAvg();
					i++;
				}

				Arrays.sort(n);

				for (int k = n.length-1; k >= 0; k--) {

					for(StuIn st : sicp) {

						if (st.getAvg()==n[k]) {
							System.out.println(st.getCount()  + " " + st.toString());

							sicp.remove(st);
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
