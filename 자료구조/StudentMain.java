import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.Scanner;

//����Ŭ����
public class StudentMain {

	List<StuIn> si;
	Scanner sc;

	public StudentMain() {
		si = new Vector<>();
		sc = new Scanner(System.in);
	}

	public void studentInput() {

		System.out.println("�̸� ���� ���� ���������� ���� �Է����ּ���");
		si.add(new StuIn(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
	}

	public void studentModify() {

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
			System.out.println("������ �л� �̸��� �Է��ϼ���");
			String mm = sc.next();

			for (int i = 0; i < si.size(); i++) {
				if (si.get(i).getName().equals(mm)) {
					System.out.println(i + 1 + "��\t" + si.get(i).toString());
				}
			}

			System.out.println("��ȣ �Է��ϼ���");
			int ca = sc.nextInt();

			si.remove(ca - 1);
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

	public void studentOutput() {

		if (!si.isEmpty()) {

			List<StuIn> sicp = new Vector<>(si);

			System.out.println("1. �̸� ��  2. ���� ��");
			int y = sc.nextInt();

			if (y == 1) {

				String[] n = new String[si.size()];
				List<StuIn> pn = new Vector<>();

				for (int i = 0; i < si.size(); i++) {
					n[i] = si.get(i).getName();
				}
				Arrays.sort(n);

				for (int k = 0; k < n.length; k++) {
					for (int j = 0; j < sicp.size(); j++) {
						if (n[k].equals(sicp.get(j).getName())) {
							pn.add(sicp.get(j));
							sicp.remove(j);
							j--;
						}
					}
				}

				for (int o = 0; o < si.size(); o++) {

					System.out.println(pn.get(o).toString());
				}

			}

			else if (y == 2) {

				double[] n = new double[si.size()];
				List<StuIn> pn = new Vector<>();

				for (int i = 0; i < si.size(); i++) {
					n[i] = si.get(i).getAvg();
				}
				Arrays.sort(n);

				for (int k = 0; k < n.length; k++) {
					for (int j = 0; j < sicp.size(); j++) {
						if (n[k] == sicp.get(j).getAvg()) {
							pn.add(sicp.get(j));
							sicp.remove(j);
							j--;
						}
					}
				}

				for (int o = pn.size() - 1; o >= 0; o--) {

					System.out.println(pn.get(o).toString());
				}

			}

			else {
				System.out.println("�߸� �Է��Ͽ����ϴ�");

			}
		} else {
			System.out.println("���� ����� ����� �����ϴ�");
		}
	}

}