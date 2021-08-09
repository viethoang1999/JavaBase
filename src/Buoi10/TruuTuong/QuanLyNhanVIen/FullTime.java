package Buoi10.TruuTuong.QuanLyNhanVIen;

import java.util.Scanner;

public class FullTime extends Employee {

    private static final double MEAL_ALLOWANCE = 2000000;
    private int totalWorkingDays;
    private long dailySalary;


    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public long getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(long dailySalary) {
        this.dailySalary = dailySalary;
    }

    @Override
    public long getMealAllowance() {
        return 0;
    }

    @Override
    public long getSalary() {
        return 0;
    }

    @Override
    public long getWorkingCount() {
        return 0;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số ngày làm việc: ");
        this.totalWorkingDays = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Lương theo ngày: ");
        this.dailySalary = sc.nextLong();
        sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Số ngày làm việc: " + this.totalWorkingDays);
        System.out.println("Lương theo ngày: " + this.dailySalary);
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "Name: " + getName() +
                ", Tuổi: " + getAge() +
                ", Id: " + getId() +
                ", totalWorkingDays=" + totalWorkingDays +
                ", dailySalary=" + dailySalary +
                '}';
    }
}
