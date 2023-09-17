
// ���� Ŭ����

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class StudentMain2 {
	
	//Set�� ������ ���� ��ü�� �ε����� �����ؼ� ������ �� ���� ������ 
	// count�� ������ ��ü�� �����ϱ� ���ؼ� ���Ƿ� ���� �ε������ ���� ��.
	Set<StuIn> si;
	Scanner sc;
	// Iterator<StuIn> iterator;  �������� ����
	int count = 0;

	public StudentMain2() {
		si = new HashSet<>();
		sc = new Scanner(System.in);
	//	iterator = si.iterator();
	}

	
	public void studentInput() {

		System.out.println("�̸� ���� ���� ���������� ���� �Է����ּ���");
		si.add(new StuIn(count, sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		count++;
	}

	public void studentModify() {

		if (!si.isEmpty()) {
			System.out.println("������ �л� �̸��� �Է��ϼ���");
			String mm = sc.next();

			for (StuIn st : si) {

				if (st.getName().equals(mm)) {

					System.out.println(st.getCount()  + " " + st.toString());
				}
			}

			System.out.println("������ ��ȣ�� �Է����ּ���");
			int po = sc.nextInt();

			for (StuIn sta : si) {

				if (sta.getCount() == po - 1) {

					System.out.println("����� 1 ����� 2 ������ 3 �Է��ϼ���");
					int s = sc.nextInt();

					if (s == 1) {
						System.out.println("���� �� ���� �Է��ϼ���");
						sta.setKor(sc.nextInt());
						
					} else if (s == 2) {
						System.out.println("���� �� ���� �Է��ϼ���");
						sta.setEng(sc.nextInt());
					} else if (s == 3) {
						System.out.println("���� �� ���� �Է��ϼ���");
						sta.setMath(sc.nextInt());
					} else {
						System.out.println("�߸� �Է��Ͽ����ϴ�");
					}

				}
			}
		}

		else {
			System.out.println("���� �л��� ��ϵ��� �ʾҽ��ϴ�");
		}

	}

	public void studentDelete() {

		if (!si.isEmpty()) {

			System.out.println("������ �л� �̸��� �Է��ϼ���");
			String mm = sc.next();

			for (StuIn st : si) {

				if (st.getName().equals(mm)) {

					System.out.println(st.getCount()  + " " + st.toString());
				}
			}

			System.out.println("������ ��ȣ�� �Է����ּ���");
			int po = sc.nextInt();

			for (StuIn sta : si) {

				if (sta.getCount() == po - 1) {
					si.remove(sta);
					break;

				}
			}

		} else {
			System.out.println("���� ��ϵ� �л��� �����ϴ�.");
		}
	}

	public void studentSearch() {

		if (!si.isEmpty()) {

			System.out.println("�̸��� 1��  �������������� 2���� �Է����ּ���");
			int pa = sc.nextInt();

			if (pa == 1) {

				System.out.println("�˻��� �л��� �̸��� �Է����ּ���");
				String aa = sc.next();

				for (StuIn st : si) {

					if (st.getName().equals(aa)) {
						System.out.println(st.getCount()  + " " + st.toString());
					}

				}

			}

			else if (pa == 2) {

				System.out.println("1.����  2.����   3.����   4.���");
				int op = sc.nextInt();

				if (op == 1) {
					System.out.println("���� ������ �������� �Ͻǰǰ���?");
					int ct = sc.nextInt();

					System.out.println("1.�������� �̻� 2. �������� ����");
					int ck = sc.nextInt();

					if (ck == 1) {

						for (StuIn st : si) {

							if (st.getKor() >= ct) {
								System.out.println("�̸�:" + st.getName() + "\t" + "��������:" + st.getKor());
							}
						}

					} else if (ck == 2) {

						for (StuIn st : si) {

							if (st.getKor() <= ct) {
								System.out.println("�̸�:" + st.getName() + "\t" + "��������:" + st.getKor());
							}
						}
					}

					else {
						System.out.println("�߸� �Է��Ͽ����ϴ�");

					}
				} // ���� �� ��

				// ���� �϶�
				if (op == 2) {
					System.out.println("���� ������ �������� �Ͻǰǰ���?");
					int ct = sc.nextInt();

					System.out.println("1.�������� �̻� 2. �������� ����");
					int ck = sc.nextInt();

					if (ck == 1) {

						for (StuIn st : si) {

							if (st.getEng() >= ct) {
								System.out.println("�̸�:" + st.getName() + "\t" + "��������:" + st.getEng());
							}
						}

					} else if (ck == 2) {

						for (StuIn st : si) {

							if (st.getEng() <= ct) {
								System.out.println("�̸�:" + st.getName() + "\t" + "��������:" + st.getEng());
							}
						}
					}

					else {
						System.out.println("�߸� �Է��Ͽ����ϴ�");

					}
				} // ������ ��

				// ������ ��
				if (op == 3) {
					System.out.println("���� ������ �������� �Ͻǰǰ���?");
					int ct = sc.nextInt();

					System.out.println("1.�������� �̻� 2. �������� ����");
					int ck = sc.nextInt();

					if (ck == 1) {

						for (StuIn st : si) {
							if (st.getMath() >= ct) {
								System.out.println("�̸�:" + st.getName() + "\t" + "��������:" + st.getMath());
							}
						}

					} else if (ck == 2) {

						for (StuIn st : si) {
							if (st.getMath() <= ct) {
								System.out.println("�̸�:" + st.getName() + "\t" + "��������:" + st.getMath());
							}
						}
					}

					else {
						System.out.println("�߸� �Է��Ͽ����ϴ�");

					}
				} // ���� �� ��

				// ����� ��
				if (op == 4) {
					System.out.println("���� ������ �������� �Ͻǰǰ���?");
					int ct = sc.nextInt();

					System.out.println("1.�������� �̻� 2. �������� ����");
					int ck = sc.nextInt();

					if (ck == 1) {

						for (StuIn st : si) {
							if (st.getAvg() >= ct) {
								System.out.println("�̸�:" + st.getName() + "\t" + "�������:" + st.getAvg());
							}
						}

					} else if (ck == 2) {

						for (StuIn st : si) {
							if (st.getAvg() <= ct) {
								System.out.println("�̸�:" + st.getName() + "\t" + "�������:" + st.getAvg());
							}
						}
					}

					else {
						System.out.println("�߸� �Է��Ͽ����ϴ�");

					}
				} // ����� ��
			}
		} else {
			System.out.println("���� �л��� �����ϴ�.");
		}
	}

	public void studentOutput() {

		if (!si.isEmpty()) {

			Set<StuIn> sicp = new HashSet<>(si);

			System.out.println("1. �̸� ��  2. ���� ��");
			int y = sc.nextInt();

			if (y == 1) {  // �̸� ������ ��ü ����

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

			else if (y == 2) { //������(��հ�)���� ��ü ���� 

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
				System.out.println("�߸� �Է��Ͽ����ϴ�");

			}

			
		} 
		else {
			System.out.println("���� ����� ����� �����ϴ�");
		}
	}

}
