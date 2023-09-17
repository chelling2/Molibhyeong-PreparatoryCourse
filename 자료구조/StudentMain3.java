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

		System.out.println("Id�� �Է��ϼ���");
		String abc= sc.next();
		
		System.out.println("�̸� ���� ���� ���������� ���� �Է����ּ���");
		si.put(abc,new StuIn(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		
	}

	public void studentModify() {
		
		if (!si.isEmpty()) {
			
			System.out.println("Id �Է� �ϼ���");
			String abc= sc.next();
			
		System.out.println("����� 1 ����� 2 ������ 3 �Է��ϼ���");
		int s = sc.nextInt();

		if (s == 1) {
			System.out.println("���� �� ���� �Է��ϼ���");
			si.get(abc).setKor(sc.nextInt());
		} else if (s == 2) {
			System.out.println("���� �� ���� �Է��ϼ���");
			si.get(abc).setEng(sc.nextInt());
		} else if (s == 3) {
			System.out.println("���� �� ���� �Է��ϼ���");
			si.get(abc).setMath(sc.nextInt());
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�");
		}
		}
		else {
			System.out.println("���� �л��� ��ϵ��� �ʾҽ��ϴ�");
		}
	}

	public void studentDelete() {

		if (!si.isEmpty()) {
			
			System.out.println("Id �Է� �ϼ���");
			String abc= sc.next();


			si.remove(abc);
			
		} else {
			System.out.println("���� ��ϵ� �л��� �����ϴ�.");
		}
	}

	public void studentSearch() {

		if (!si.isEmpty()) {

			System.out.println("���̵��(����) 1  ������������(��ü���)�� 2�� �Է����ּ���");
			int pa = sc.nextInt();

			if (pa == 1) {

				System.out.println("Id �Է� �ϼ���");
				String abc= sc.next();
				
				if(si.containsKey(abc)) {
				System.out.println("Id:"+ abc + "\t"+ si.toString());
				}
				else {
					System.out.println("�������� �ʴ� Id�Դϴ�.");
				}
				
				
			} else if (pa == 2) {

				
				System.out.println("1.����  2.����   3.����   4.���");
				int op = sc.nextInt();

				if (op == 1) {
					System.out.println("���� ������ �������� �Ͻǰǰ���?");
					int ct = sc.nextInt();

					System.out.println("1.�������� �̻� 2. �������� ����");
					int ck = sc.nextInt();

					Set<String> keySet = si.keySet();
					
					if (ck == 1) {

						for(String st : keySet) {
							
							if (si.get(st).getKor() >= ct) {
								System.out.println("Id:"+ st + "\t"+ "�̸�:" + si.get(st).getName() + "\t" + "��������:" + si.get(st).getKor());
							}
						}
					
						
					} else if (ck == 2) {

						for(String st : keySet) {

							if (si.get(st).getKor() <= ct) {
								System.out.println("Id:"+ st + "\t"+ "�̸�:" + si.get(st).getName() + "\t" + "��������:" + si.get(st).getKor());
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
					
					Set<String> keySet = si.keySet();

					if (ck == 1) {

						for(String st : keySet) {

							if (si.get(st).getEng() >= ct) {
								System.out.println("Id:"+ st + "\t"+ "�̸�:" + si.get(st).getName() + "\t" + "��������:" + si.get(st).getEng());
							}
						}

					} else if (ck == 2) {

						for(String st : keySet) {

							if (si.get(st).getEng() <= ct) {
								System.out.println("Id:"+ st + "\t"+ "�̸�:" + si.get(st).getName() + "\t" + "��������:" + si.get(st).getEng());
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

					Set<String> keySet = si.keySet();
					
					if (ck == 1) {

						for(String st : keySet) {

							if (si.get(st).getMath() >= ct) {
								System.out.println("Id:"+ st + "\t"+ "�̸�:" + si.get(st).getName() + "\t" + "��������:" + si.get(st).getMath());
							}
						}

					} else if (ck == 2) {

						for(String st : keySet) {

							if (si.get(st).getMath() <= ct) {
								System.out.println("Id:"+ st + "\t"+ "�̸�:" + si.get(st).getName() + "\t" + "��������:" + si.get(st).getMath());
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

					Set<String> keySet = si.keySet();
					
					if (ck == 1) {

						for(String st : keySet) {

							if (si.get(st).getAvg() >= ct) {
								System.out.println("Id:"+ st + "\t"+ "�̸�:" + si.get(st).getName() + "\t" + "�������:" + si.get(st).getAvg());
							}
						}

					} else if (ck == 2) {

						for(String st : keySet) {

							if (si.get(st).getAvg() <= ct) {
								System.out.println("Id:"+ st + "\t"+ "�̸�:" + si.get(st).getName() + "\t" + "�������:" + si.get(st).getAvg());
							}
						}

					}

					else {
						System.out.println("�߸� �Է��Ͽ����ϴ�");

					}
				} // ����� ��
			}
		} 
		else {
			System.out.println("���� �л��� �����ϴ�.");
		}
	}

	public void studentOutput() {

		
		if (!si.isEmpty()) {

			
			System.out.println("1. Id��  2. ���� ��");
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
				System.out.println("�߸� �Է��Ͽ����ϴ�");

			}
		}
		else {
			System.out.println("���� ����� ����� �����ϴ�");
		} 
	}

}
