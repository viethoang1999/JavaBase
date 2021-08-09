package Buoi10.TruuTuong.QuanLyNhanVIen;

import java.util.Scanner;

public class PartTime extends Employee {
    private static final double MEAL_ALLOWANCE = 0;
    private int totalWorkingShift;
    private long baseSalary;


    public int getTotalWorkingShift() {
        return totalWorkingShift;
    }

    public void setTotalWorkingShift(int totalWorkingShift) {
        this.totalWorkingShift = totalWorkingShift;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập totalWorkingShift: ");
        this.totalWorkingShift = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập baseSalary: ");
        this.baseSalary = scanner.nextInt();
        scanner.nextLine();
    }


    @Override
    public void output() {
        super.output();
        System.out.println("totalWorkingShift: " + this.totalWorkingShift);
        System.out.println("baseSalary: " + this.baseSalary);
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "Name: " + getName() +
                ", Tuổi: " + getAge() +
                ", Id: " + getId() +
                ", totalWorkingShift=" + totalWorkingShift +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
