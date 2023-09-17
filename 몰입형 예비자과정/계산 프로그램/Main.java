package Manage;

import java.util.*;

public class Main {
   private User[] u;
   private Calc[] cl;
   PayLevel pl;
   Scanner sc;

   private int userCount;

   public int getUserCount() {
      return userCount;
   }

   public void setUserCount(int userCount) {
      this.userCount = userCount;
   }

   public int ouputMain() { // 메인화면 출력

      System.out.println("------------------------------ 급여 관리 프로그램 ------------------------------ \n");
      System.out.print("                             사용자 ID를 입력하시오. :  ");
      int id = sc.nextInt();
      System.out.println();
      System.out.println("-------------------------------------------------------------------------------");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      return id;
   }

   public int userMain() { // 사용자 선택창

      System.out.println("--------------------------------- 사용자 모드 --------------------------------- \n");
      System.out.println("                  |  1. 급여 보기          2. 돌아가기  | \n");
      System.out.println("------------------------------------------------------------------------------- \n");
      System.out.print("                                선 택 하 기 :  ");
      int sel = sc.nextInt();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      return sel;
   }

   public void userSalary(int count) { // 사용자 급여 화면 출력
      System.out.println(
            "-------------------------------" + u[count].getName() + "님의 급여 -------------------------------- \n");
      cl[count].setPayLevel(pl.choicePay(u[count].getRank())); // 기본 급여 설정
      cl[count].setTimePay(pl.choiceTimePay(u[count].getRank())); // 시급 설정
      double money = cl[count].totalPatCalc(cl[count].getPayLevel(), cl[count].getTimePay(),
            cl[count].getScanOvertime(), cl[count].getScanOvertimeToNight()); // 세전 금액
      double lessMoney = cl[count].taxTotalPaycalc(money); // 세후 금액
      System.out.println("기본급여 : : " + cl[count].getPayLevel());
      System.out.println("기본시급 : : " + cl[count].getTimePay());
      System.out.println("추가 근무 급여 : " + (cl[count].getScanOvertime() * cl[count].getTimePay() * 1.5) + "("
            + cl[count].getScanOvertime() + "시간)");
      System.out.println("야간 근무 급여 : " + (cl[count].getScanOvertimeToNight() * cl[count].getTimePay() * 2.0) + "("
            + cl[count].getScanOvertimeToNight() + "시간)");
      System.out.println("세전 금액 : " + money);
      System.out.println("세금 : " + (money - lessMoney));
      System.out.println("세후 금액 : " + lessMoney);

      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
   }

   public int AdminMain() { // 관리자 선택창

      System.out.println("--------------------------------- 관리자 모드 --------------------------------- \n");
      System.out.println("              |  1. 회원 관리       2. 급여 관리     3. 돌아가기  | \n");
      System.out.println("------------------------------------------------------------------------------- \n");
      System.out.print("                                선 택 하 기 :  ");
      int sel = sc.nextInt();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      return sel;
   }

   public int AdminUser() {

      System.out.println("-------------------------------- 회원 관리 모드 ------------------------------- \n");
      System.out.println("              |  1. 회원 등록       2. 회원 수정       3. 회원 정보  |   \n");
      System.out.println("------------------------------------------------------------------------------- \n");
      System.out.print("                                선 택 하 기 :  ");
      int sel = sc.nextInt();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      return sel;
   }

   public void AdminAddUser(int count) {

      boolean full_time = true;

      System.out.println("--------------------------------회원 등록 모드 -------------------------------- \n");
      System.out.print("이 름 :  ");
      String name = sc.next();
      System.out.println(name);
      u[count].setName(name);
      System.out.println();
      System.out.print("성 별 :  ");
      String gender = sc.next();
      u[count].setGender(gender);
      System.out.println();
      System.out.print("나 이 :  ");
      int age = sc.nextInt();
      u[count].setAge(age);
      System.out.println();
      System.out.print("전 화 번 호 ( - 없이 입력 ) :  ");
      String phoneNum = sc.next();
      u[count].setP_n(phoneNum);
      System.out.println();
      System.out.print("집 주 소 :  ");
      String address = sc.next();
      u[count].setAddress(address);
      System.out.println();
      System.out.print("계 좌 번 호 :  ");
      long bankAddress = sc.nextLong();
      u[count].setBankAddress(bankAddress);
      System.out.println();
      System.out.println("  | 1. 비정규직    2. 사원    3. 대리    4. 과장    5. 차장    6. 부장 |");
      System.out.print("                              선 택 하 기 :  ");
      int sel = sc.nextInt();
      if (sel == 1) {
         u[count].setRank("비정규직");
      } else if (sel == 2) {
         u[count].setRank("사원");
      } else if (sel == 3) {
         u[count].setRank("대리");
      } else if (sel == 4) {
         u[count].setRank("과장");
      } else if (sel == 5) {
         u[count].setRank("차장");
      } else if (sel == 6) {
         u[count].setRank("부장");
      }
      System.out.println();
      System.out.print("사원 번호 :  ");
      int id = sc.nextInt();
      u[count].setId(id);
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      if (u[count].getRank().equals("비정규직")) {
         full_time = false;
      } else {
         full_time = true;
      }
   }

   public int AdminFindFixUser() {

      System.out.println("--------------------------------- 관리자 모드 수정 ------------------------------- \n");
      System.out.print("                                 사원 ID를 입력하시오 :  ");
      int id = sc.nextInt();
      System.out.println();
      System.out.println("-------------------------------------------------------------------------------");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      return id;
   }

   public int AdminFixUser() {

      System.out.println("--------------------------------- 관리자 모드 --------------------------------- \n");
      System.out.println("         1. 정규/ 비정규       2. 직급     3. 핸드폰 번호   ");
      System.out.println("         4. 나이               5. 주소     6. 계좌번호      ");
      System.out.println("------------------------------------------------------------------------------- \n");
      System.out.print("                              선 택 하 기 :  ");
      int sel = sc.nextInt();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      return sel;
   }

   public void AdminFixUserFull(int i) {

      System.out.println("--------------------------------- 관리자 모드 --------------------------------- \n");
      System.out.println("                         |  1. 정규       2. 비정규  |   \n");
      System.out.println("------------------------------------------------------------------------------- \n");
      System.out.print("                             선 택 하 기 :  ");
      int sel = sc.nextInt();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      if (sel == 1) {
         u[i].setFull_time(true);
      } else if (sel == 2) {
         u[i].setFull_time(false);
      }
   }

   public void AdminFixUserRank(int i) {

      System.out.println("--------------------------------- 관리자 모드 --------------------------------- \n");
      System.out.println("  | 1. 비정규직    2. 사원    3. 대리    4. 과장    5. 차장    6. 부장 |");
      System.out.println("------------------------------------------------------------------------------- \n");
      System.out.print("                              선 택 하 기 :  ");
      int sel = sc.nextInt();

      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      if (sel == 1) {
         u[i].setRank("비정규직");
      } else if (sel == 2) {
         u[i].setRank("사원");
      } else if (sel == 3) {
         u[i].setRank("대리");
      } else if (sel == 4) {
         u[i].setRank("과장");
      } else if (sel == 5) {
         u[i].setRank("차장");
      } else if (sel == 6) {
         u[i].setRank("부장");

      }
   }

   public void AdminUserFixPhone(int i) {

      System.out.println("--------------------------------- 관리자 모드 수정 ------------------------------- \n");
      System.out.print("                     업데이트 할 전화번호를 입력하시오. :  ");
      String p_n = sc.next();
      u[i].setP_n(p_n);
      System.out.println();
      System.out.println("-------------------------------------------------------------------------------");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
   }

   public void AdminUserFixAge(int i) {

      System.out.println("--------------------------------- 관리자 모드 수정 ------------------------------- \n");
      System.out.print("                           업데이트 할 나이를 입력하시오. :  ");
      int age = sc.nextInt();
      u[i].setAge(age);
      System.out.println();
      System.out.println("-------------------------------------------------------------------------------");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
   }

   public void AdminUserFixAddress(int i) {

      System.out.println("--------------------------------- 관리자 모드 수정 ------------------------------- \n");
      System.out.print("                   업데이트 할 주소를 입력하시오. :  ");
      String address = sc.next();
      u[i].setAddress(address);
      System.out.println();
      System.out.println("-------------------------------------------------------------------------------");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
   }

   public void AdminUserFixBankAddress(int i) {

      System.out.println("--------------------------------- 관리자 모드 수정 ------------------------------- \n");
      System.out.print("         업데이트 할 계좌번호를 입력하시오. :  ");
      long bankAddress = sc.nextLong();
      u[i].setBankAddress(bankAddress);
      System.out.println();
      System.out.println("-------------------------------------------------------------------------------");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
   }

   public int AdminUserFindSalary() {

      System.out.println("--------------------------------- 관리자 모드 수정 ------------------------------- \n");
      System.out.print("                             업데이트 할 사원 번호를 입력하시오. :  ");
      int id = sc.nextInt();
      System.out.println();
      System.out.println("-------------------------------------------------------------------------------");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      return id;
   }

   public int AdminUserSalary(int i) {

      System.out.println("-------------------------------- 급여 관리 모드 ------------------------------- \n");
      System.out.println("          |  1. 추가 근무 시간 등록        2. 야근 시간 등록  |   \n");
      System.out.println("------------------------------------------------------------------------------- \n");
      System.out.print("                             선 택 하 기 :  ");
      int sel = sc.nextInt();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      return sel;
   }

   public void AdminUserPlusTime(int count) {


      System.out.println("-------------------------------- 추가 근무 시간 등록 ------------------------------- \n");
      System.out.print("                       추 가  근 무  시 간 :  ");
      int overTime = sc.nextInt(); //입력한 추가 근무 시간
      int savedOverTime =cl[count].getScanOvertime(); // 저장되어 있던 추가 근무 시간
      cl[count].setScanOvertime(savedOverTime + overTime); // 위에 두개 더해줌

      System.out.println();
      System.out.println("----------------------------------------------------------------------------------- \n");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
   }

   public void AdminUserNightTime(int count) {

      System.out.println("-------------------------------- 추가 근무 시간 등록 ------------------------------- \n");
      System.out.print("                                    야 근  시 간 :  ");
      int overTimeN = sc.nextInt(); //입력한 야근 시간
      int savedOverTimeN =cl[count].getScanOvertimeToNight(); // 저장되어 있던 야근 시간
      cl[count].setScanOvertimeToNight(savedOverTimeN + overTimeN); // 위에 두개 더해줌
      System.out.println();
      System.out.println("----------------------------------------------------------------------------------- \n");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
   }

   public void userInfo(int findId){
      System.out.println("-------------------------------- "+(findId+1)+"번 사원의 정보------------------------------- \n");
      System.out.println("이 름 :  " + u[findId].getName());
      System.out.println("성별 : " + u[findId].getGender() );
      System.out.println("나이 : " + u[findId].getAge());
      System.out.println("전화번호 : " + u[findId].getP_n());
      System.out.println("집 주소 : " + u[findId].getAddress());
      System.out.println("계좌 번호 " + u[findId].getBankAddress()) ;
      System.out.println("직급 : " + u[findId].getRank());
      System.out.println("사원 번호 : " + u[findId].getId());
      System.out.println("추가 근무 시간 : " + cl[findId].getScanOvertime());
      System.out.println("야간 근무 시간 : " + cl[findId].getScanOvertimeToNight());

   }

   // constructor
   public Main() {
      u = new User[25];
      cl = new Calc[25];
      for (int i = 0; i < 25; i++) {
         u[i] = new User();
         cl[i] = new Calc();
      }
      sc = new Scanner(System.in);
      pl = new PayLevel();
   }

   public static void main(String[] args) {
      Main m = new Main();

      int count = 0;

      while (true) {
         int id = m.ouputMain() - 1; // 메인화면

         while (true) {

            if (id != 1233) {
               int selU = m.userMain(); // 사용자 선택창

               if (selU == 1) {
                  m.userSalary(id); // 사용자 급여 창
                  break;
               } else if (selU == 2) {
                  break;
               }
            } else {
               int selA = m.AdminMain(); // 관리자 메인 창

               if (selA == 1) {
                  int selAU = m.AdminUser(); // 회원 관리 창

                  if (selAU == 1) { // 회원 추가
                     m.AdminAddUser(count);
                     m.setUserCount(count);
                     count++;
                  } else if (selAU == 2) { // 회원 수정
                     int findId = m.AdminFindFixUser() - 1; // 사원 아이디 확인
                     int selFix = m.AdminFixUser(); // 회원 정보 수정 선택창

                     if (selFix == 1) {
                        m.AdminFixUserFull(findId); // 정규직, 비정규직 수정
                        continue;
                     } else if (selFix == 2) {
                        m.AdminFixUserRank(findId); // 직급 수정
                        continue;
                     } else if (selFix == 3) {
                        m.AdminUserFixPhone(findId); // 회원 전화번호 수정
                        continue;
                     } else if (selFix == 4) {
                        m.AdminUserFixAge(findId); // 회원 나이 수정
                        continue;
                     } else if (selFix == 5) {
                        m.AdminUserFixAddress(findId); // 회원 주소 수정
                        continue;
                     } else if (selFix == 6) {
                        m.AdminUserFixBankAddress(findId); // 회원 계좌 수정
                        continue;
                     }
                  }else if(selAU == 3){
                     int findId = m.AdminFindFixUser() - 1;
                     m.userInfo(findId);

                  }
               } else if (selA == 2) {
                  int userId = m.AdminUserFindSalary()-1; // 업데이트 할 회원 번호
                  int selAUF = m.AdminUserSalary(userId); // 회원 급여 관리

                  if (selAUF == 1) {
                     m.AdminUserPlusTime(userId); // 회원 추가 수당
                     continue;
                  } else if (selAUF == 2) {
                     m.AdminUserNightTime(userId); // 회원 야간 수당
                     continue;
                  }
               } else if (selA == 3) {
                  break;
               }
            }
         }
      }
   }
}
