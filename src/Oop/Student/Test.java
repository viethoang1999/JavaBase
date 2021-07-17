package Oop.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien[] sinhVien = null;
        int n = 0;
        int luachon = 0;
        do {
            System.out.println("1.Nhập số lượng sinh viên: ");
            System.out.println("2.NHập và in ra thông tin sinh viên");
            System.out.println("3.Sắp xêp danh sách sinh viên theo thứ tự tăng dần");
            System.out.println("4.Sắp xếp sinh viê theo thư stự giảm dân");
            luachon = scanner.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println("Mời bạn nhập số lượng sinh viên");
                    n = scanner.nextInt();
                    sinhVien = new SinhVien[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ: " + (i + 1));
                        sinhVien[i] = new SinhVien();
                        sinhVien[i].Nhap();

                        sinhVien[i].In();
                    }
                    break;
                case 2:
                    System.out.println("Sắp xếp sinh viên theo thứ tự tăng dần: ");
                    SinhVien temp = sinhVien[0];
                    for (int i = 0; i < sinhVien.length; i++) {
                        for (int j = i + 1; j < sinhVien.length; j++) {
                            if (sinhVien[i].getMasinhvien() > sinhVien[j].getMasinhvien()) {
                                temp = sinhVien[j];
                                sinhVien[i] = sinhVien[j];
                                sinhVien[i] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        sinhVien[i].In();
                    }
                    break;


            }

        } while (luachon < 3);
    }
}
