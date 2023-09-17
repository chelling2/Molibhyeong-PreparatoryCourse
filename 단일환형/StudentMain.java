package 단일환형;

import java.util.Scanner;
import java.util.Arrays;

//����Ŭ����
public class StudentMain {

	Lotte<StuIn> si;
	Scanner sc;

	public StudentMain() {
		si = new Lotte<>();
		sc = new Scanner(System.in);
	}

	public void studentInput() {

		System.out.println("�����͸� ó���� �����Ÿ� 1��, �߰��� �����Ÿ� 2��, �������� �����Ÿ� 3�� �Է��ϼ���");
		int a = sc.nextInt();

		if (a == 1) {
			System.out.println("�̸� ���� ���� ���������� ���� �Է����ּ���");
			si.addFirst(new StuIn(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		} else if (a == 2) {

			for (int i = 0; i < si.size(); i++) {

				System.out.println(i + 1 + "��\t" + si.get(i).toString());

			}

			System.out.println("��� °�� ���� ���ΰ���?");
			int c = sc.nextInt();
			System.out.println("�̸� ���� ���� ���������� ���� �Է����ּ���");
			si.add(c - 1, new StuIn(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		} else if (a == 3) {
			System.out.println("�̸� ���� ���� ���������� ���� �Է����ּ���");
			si.addLast(new StuIn(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}

	}

	public void studentModify() {

		for (int i = 0; i < si.size(); i++) {
			
				System.out.println(si.get(i).toString());

		}
		
		if (!si.isEmpty()) {
			System.out.println("������ �л� �̸��� �Է��ϼ���");
			String mm = sc.next();

			for (int i = 0; i < si.size(); i++) {
				if (si.get(i).getName().equals(mm)) {
					System.out.println(i + 1 + "��\t" + si.get(i).toString());
				}
			}
			
			System.out.println("��ȣ �Է��ϼ���");
			int ca = sc.nextInt();

			System.out.println("����� 1 ����� 2 ������ 3 �Է��ϼ���");
			int s = sc.nextInt();

			if (s == 1) {
				System.out.println("���� �� ���� �Է��ϼ���");
				si.get(ca - 1).setKor(sc.nextInt());
			} else if (s == 2) {
				System.out.println("���� �� ���� �Է��ϼ���");
				si.get(ca - 1).setEng(sc.nextInt());
			} else if (s == 3) {
				System.out.println("���� �� ���� �Է��ϼ���");
				si.get(ca - 1).setMath(sc.nextInt());
			} else {
				System.out.println("�߸� �Է��Ͽ����ϴ�");
			}
		} else {
			System.out.println("���� �л��� ��ϵ��� �ʾҽ��ϴ�");
		}
	}

	public void studentDelete() {

		if (!si.isEmpty()) {

			for (int i = 0; i < si.size(); i++) {
				System.out.println(i + 1 + "��\t" + si.get(i).toString());
			}

			System.out.println("Ư����ġ ������ 1�� , ù ������ ������ 2�� , ��ü������ 3���� �Է��ϼ���");
			int mm = sc.nextInt();

			if (mm == 1) {

				System.out.println("��ȣ �Է��ϼ���");
				int ca = sc.nextInt();

				si.remove(ca - 1);
			} else if (mm == 2) {
				si.remove();
			} else if (mm == 3) {
				si.clear();
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

				for (int i = 0; i < si.size(); i++) {

					if (aa.equals(si.get(i).getName())) {
						System.out.println(si.get(i).toString());
					}
				}
			} else if (pa == 2) {

				System.out.println("1.����  2.����   3.����   4.���");
				int op = sc.nextInt();

				if (op == 1) {
					System.out.println("���� ������ �������� �Ͻǰǰ���?");
					int ct = sc.nextInt();

					System.out.println("1.�������� �̻� 2. �������� ����");
					int ck = sc.nextInt();

					if (ck == 1) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getKor() >= ct) {
								System.out.println("�̸�:" + si.get(i).getName() + "\t" + "��������:" + si.get(i).getKor());
							}
						}

					} else if (ck == 2) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getKor() <= ct) {
								System.out.println("�̸�:" + si.get(i).getName() + "\t" + "��������:" + si.get(i).getKor());
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

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getEng() >= ct) {
								System.out.println("�̸�:" + si.get(i).getName() + "\t" + "��������:" + si.get(i).getEng());
							}
						}

					} else if (ck == 2) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getEng() <= ct) {
								System.out.println("�̸�:" + si.get(i).getName() + "\t" + "��������:" + si.get(i).getEng());
							}
						}

					}

					else {
						System.out.println("�߸� �Է��Ͽ����ϴ�");

					}
				} // ���� �� ��

				// ������ ��
				if (op == 3) {
					System.out.println("���� ������ �������� �Ͻǰǰ���?");
					int ct = sc.nextInt();

					System.out.println("1.�������� �̻� 2. �������� ����");
					int ck = sc.nextInt();

					if (ck == 1) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getMath() >= ct) {
								System.out.println("�̸�:" + si.get(i).getName() + "\t" + "��������:" + si.get(i).getMath());
							}
						}

					} else if (ck == 2) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getMath() <= ct) {
								System.out.println("�̸�:" + si.get(i).getName() + "\t" + "��������:" + si.get(i).getMath());
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

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getAvg() >= ct) {
								System.out.println("�̸�:" + si.get(i).getName() + "\t" + "�������:" + si.get(i).getAvg());
							}
						}

					} else if (ck == 2) {

						for (int i = 0; i < si.size(); i++) {

							if (si.get(i).getAvg() <= ct) {
								System.out.println("�̸�:" + si.get(i).getName() + "\t" + "�������:" + si.get(i).getAvg());
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

	public void stuPrint(int i) {
		System.out.println(i + 1 + "�� ������: " + si.get(i).toString());
	}

	public void studentOutput() {

		if (!si.isEmpty()) {

			Lotte<StuIn> sicp = new Lotte<StuIn>(); // ����ǰ

			for (int i = 0; i < si.size(); i++) {
				sicp.add(i, si.get(i));
		}

			System.out.println("1. �ε��� ��  2. ���� ��  3. ������� �� �������");
			int y = sc.nextInt();

			if (y == 1) {
				System.out.println("�ε������� ����մϴ�");
				for (int a = 0; a < si.size(); a++) {
					stuPrint(a);
				}
			} else if (y == 2) {

				double[] n = new double[si.size()];

				Lotte<StuIn> pn = new Lotte<>(); // ���ǰ

				int i;
				int j;
				double temp;

				for (i = 0; i < si.size(); i++) {
					n[i] = si.get(i).getAvg();
				}

				for (i = 0; i < n.length - 1; i++) { // ��������
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

			} // else if ��ȣ
			else if(y==3) {
				
				System.out.println("����� �����ͺ��� ����ұ��?");      //����� �����Ϳ��� ������� ������ �Է¹޾� (�ε���x)
				int t= sc.nextInt();							// �������� t-1�� �����ν� �ε����� �����Ͽ�����, 
																// print������ next�κк��� ����ϰ� ������⿡ -1�� �� ����  -2�� �ǵ��� �� 
				si.print(t-2);   //  print������ 
				
				
			}
		} // if ��ȣ

		else {
			System.out.println("���� ����ֽ��ϴ�");
		}

	}

}
