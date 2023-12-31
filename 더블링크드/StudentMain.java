package 더블링크드;

import java.util.Scanner;
import java.util.Arrays;

//구현클래스
public class StudentMain {

	Lotte<StuIn> si;
	Scanner sc;

	public StudentMain() {
		si = new Lotte<>();
		sc = new Scanner(System.in);
	}

	public void studentInput() {

		System.out.println("데이터를 처음에 넣을거면 1번, 중간에 넣을거면 2번, 마지막에 넣을거면 3번 입력하세요");
		int a = sc.nextInt();

		if (a == 1) {
			System.out.println("이름 국어 영어 수학점수를 각각 입력해주세요");
			si.addFirst(new StuIn(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		} else if (a == 2) {

			for (int i = 0; i < si.size(); i++) {

				System.out.println(i + 1 + "번\t" + si.get(i).toString());

			}

			System.out.println("몇번 째에 넣을 것인가요?");
			int c = sc.nextInt();
			System.out.println("이름 국어 영어 수학점수를 각각 입력해주세요");
			si.add(c - 1, new StuIn(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		} else if (a == 3) {
			System.out.println("이름 국어 영어 수학점수를 각각 입력해주세요");
			si.addLast(new StuIn(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		} else {
			System.out.println("잘못 입력하였습니다.");
		}

	}

	public void studentModify() {

		if (!si.isEmpty()) {
			System.out.println("수정할 학생 이름을 입력하세요");
			String mm = sc.next();

			for (int i = 0; i < si.size(); i++) {
				if (si.get(i).getName().equals(mm)) {
					System.out.println(i + 1 + "번\t" + si.get(i).toString());
				}
			}

			System.out.println("번호 입력하세요");
			int ca = sc.nextInt();

			System.out.println("국어는 1 영어는 2 수학은 3 입력하세요");
			int s = sc.nextInt();

			if (s == 1) {
				System.out.println("수정 할 점수 입력하세요");
				si.get(ca - 1).setKor(sc.nextInt());
			} else if (s == 2) {
				System.out.println("수정 할 점수 입력하세요");
				si.get(ca - 1).setEng(sc.nextInt());
			} else if (s == 3) {
				System.out.println("수정 할 점수 입력하세요");
				si.get(ca - 1).setMath(sc.nextInt());
			} else {
				System.out.println("잘못 입력하였습니다");
			}
		} else {
			System.out.println("현재 학생이 등록되지 않았습니다");
		}
	}

	public void studentDelete() {

		if (!si.isEmpty()) {

			for (int i = 0; i < si.size(); i++) {
				System.out.println(i + 1 + "번\t" + si.get(i).toString());
			}

			System.out.println("특정위치 삭제는 1번 , 첫 데이터 삭제는 2번 , 전체삭제는 3번을 입력하세요");
			int mm = sc.nextInt();

			if (mm == 1) {

				System.out.println("번호 입력하세요");
				int ca = sc.nextInt();

				si.remove(ca - 1);
			} else if (mm == 2) {
				si.remove();
			} else if (mm == 3) {
				si.clear();
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

				for (int i = 0; i < si.size(); i++) {

					if (aa.equals(si.get(i).getName())) {
						System.out.println(si.get(i).toString());
					}
				}
			} else if (pa == 2) {

				System.out.println("1.국어  2.영어   3.수학   4.평균");
				int op = sc.nextInt();

				if (op == 1) {
					System.out.println("기준 점수를 몇점으로 하실건가요?");
					int ct = sc.nextInt();

					System.out.println("1.기준점수 이상 2. 기준점수 이하");
					int ck = sc.nextInt();

					if (ck == 1) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getKor() >= ct) {
								System.out.println("이름:" + si.get(i).getName() + "\t" + "국어점수:" + si.get(i).getKor());
							}
						}

					} else if (ck == 2) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getKor() <= ct) {
								System.out.println("이름:" + si.get(i).getName() + "\t" + "국어점수:" + si.get(i).getKor());
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

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getEng() >= ct) {
								System.out.println("이름:" + si.get(i).getName() + "\t" + "영어점수:" + si.get(i).getEng());
							}
						}

					} else if (ck == 2) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getEng() <= ct) {
								System.out.println("이름:" + si.get(i).getName() + "\t" + "영어점수:" + si.get(i).getEng());
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

					if (ck == 1) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getMath() >= ct) {
								System.out.println("이름:" + si.get(i).getName() + "\t" + "수학점수:" + si.get(i).getMath());
							}
						}

					} else if (ck == 2) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getMath() <= ct) {
								System.out.println("이름:" + si.get(i).getName() + "\t" + "수학점수:" + si.get(i).getMath());
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

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getAvg() >= ct) {
								System.out.println("이름:" + si.get(i).getName() + "\t" + "평균점수:" + si.get(i).getAvg());
							}
						}

					} else if (ck == 2) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getAvg() <= ct) {
								System.out.println("이름:" + si.get(i).getName() + "\t" + "평균점수:" + si.get(i).getAvg());
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

	public void stuPrint(int i) {
		System.out.println(i + 1 + "번 데이터: " + si.get(i).toString());
	}

	public void studentOutput() {

		if (!si.isEmpty()) {

			Lotte<StuIn> sicp = new Lotte<StuIn>(); // 복제품

			for (int i = 0; i < si.size(); i++) {
				sicp.add(i, si.get(i));
			}

			System.out.println("1. 인덱스 순  2. 성적 순  3. 값 기준 앞 뒤 출력");
			int y = sc.nextInt();

			if (y == 1) {
				System.out.println("인덱스별로 출력합니다");
				for (int a = 0; a < si.size(); a++) {
					stuPrint(a);
				}
			} else if (y == 2) {

				double[] n = new double[si.size()];

				Lotte<StuIn> pn = new Lotte<>(); // 출력품

				int i;
				int j;
				double temp;

				for (i = 0; i < si.size(); i++) {
					n[i] = si.get(i).getAvg();
				}

				for (i = 0; i < n.length - 1; i++) { // 선택정렬
					j = i;
					while (n[j] > n[j + 1]) {
						temp = n[j];
						n[j] = n[j + 1];
						n[j + 1] = temp;
						if (j == 0) {
							continue;
						}
						j--;

					}
				}

				for (int k = 0; k < n.length; k++) {
					for (int p = 0; p < sicp.size(); p++) {
						if (n[k] == sicp.get(p).getAvg()) {
							pn.add(k, sicp.get(p));
							sicp.remove(p);
							p--;
						}
					}
				}

				for (int o = pn.size() - 1; o >= 0; o--) {

					System.out.println(pn.get(o).toString());
				}

				pn.clear();

			} // else if 괄호
			else if(y ==3) {
				
				System.out.println("기준으로 정할 데이터를 몇번 째로 설정 하실건가요?");
				int c= sc.nextInt();
				
				System.out.println("앞 출력은 1 , 뒤 출력은 2");
				int h= sc.nextInt();
					si.print(c-1,h);	
			}
		

		} // if 괄호

		else {
			System.out.println("현재 비어있습니다");
		}

	}

}


