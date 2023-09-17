package Manage;

public class Calc {

	private double totalPay; // 세전 금액
	private double taxTotalPay; // 세후 금액
	private double[] tax; // 세금
	private int scanOvertime; // 초과 시간
	private int scanOvertimeToNight; // 야간 초과 시간
	private double payLevel; // 기본 급여
	private double timePay;

	public double getTimePay() {
		return timePay;
	}

	public void setTimePay(double timePay) {
		this.timePay = timePay;
	}

	public double getPayLevel() {
		return payLevel;
	}

	public void setPayLevel(double payLevel) {
		this.payLevel = payLevel;
	}

	public int getScanOvertime() {
		return scanOvertime;
	}

	public void setScanOvertime(int scanOvertime) {
		this.scanOvertime = scanOvertime;
	}

	public int getScanOvertimeToNight() {
		return scanOvertimeToNight;
	}

	public void setScanOvertimeToNight(int scanOvertimeToNight) {
		this.scanOvertimeToNight = scanOvertimeToNight;
	}

	public Calc() {
		totalPay = 0;
		taxTotalPay =0;
		tax = new double[]{ 0.85, 0.839, 0.831, 0.824, 0.817, 0.812, 0.808, 0.8 };

	}

	public double totalPatCalc(double payLevel, double timePay, int scanOvertime, int scanOvertimeToNight) {// 정규직 세전
																											// 총금액

		totalPay = payLevel + (timePay * scanOvertime * 1.5) + (timePay * scanOvertimeToNight * 2);

		return totalPay;
	}

	public double taxTotalPaycalc(double totalPay) { // 정규직 월급별 세후 금액 계산

		if (totalPay >= 2500000 && totalPay <= 2990000) {
		    taxTotalPay = totalPay * tax[0];
		    return taxTotalPay;
		} else if (totalPay >= 3000000 && totalPay <= 3490000) {
		    taxTotalPay = totalPay * tax[1];
		    return taxTotalPay;
		} else if (totalPay >= 3500000 && totalPay <= 3990000) {
		    taxTotalPay = totalPay * tax[2];
		    return taxTotalPay;
		} else if (totalPay >= 4000000 && totalPay <= 4490000) {
		    taxTotalPay = totalPay * tax[3];
		    return taxTotalPay;
		} else if (totalPay >= 4500000 && totalPay <= 4990000) {
		    taxTotalPay = totalPay * tax[4];
		    return taxTotalPay;
		} else if (totalPay >= 5000000 && totalPay <= 5490000) {
		    taxTotalPay = totalPay * tax[5];
		    return taxTotalPay;
		} else if (totalPay >= 5500000 && totalPay <= 5990000) {
		    taxTotalPay = totalPay * tax[6];
		    return taxTotalPay;
		} else {
		    if (totalPay >= 6000000) {
		        taxTotalPay = totalPay * tax[7];
		        return taxTotalPay;
		    } else if (totalPay < 2500000) {
		        taxTotalPay = totalPay * tax[0];
		        return taxTotalPay;
		    } else {
		        return 0.0;
		    }
		}

	}
}