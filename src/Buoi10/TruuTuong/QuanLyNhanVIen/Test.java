package Buoi10.TruuTuong.QuanLyNhanVIen;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số luộng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        EmployManagermant employManagermant = new EmployManagermant(n);
        employManagermant.input();
        employManagermant.output();
        Employee a = employManagermant.maxSalaryRate();
        System.out.println("Lương cao nhất là: " + a);
        Employee b = employManagermant.minSalaryRate();
        System.out.println("lương thấp nhất là : " + b);
        employManagermant.print();

    }
}
