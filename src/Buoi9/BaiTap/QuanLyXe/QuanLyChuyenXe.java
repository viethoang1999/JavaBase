package Buoi9.BaiTap.QuanLyXe;

import java.util.Scanner;

public class QuanLyChuyenXe {
    private int n;
    private ChuyenXe[] chuyenxe;

    public QuanLyChuyenXe(int n) {
        this.n = n;
        this.chuyenxe = new ChuyenXe[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin cho" + n + " chuyến xe");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào thông tin chuyến xe thứ: " + (i + 1));
            System.out.println("Nhập vào thông tin chuyên xe nội thành/ngoại thành:  ");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("nội thành")) {
                System.out.println("Nội thành");
            } else if (type.equalsIgnoreCase("Ngoại thành")) {
                System.out.println("Ngoại thành");
            } else {
                System.out.println("Nhập sai dữ liệu");
            }
            System.out.println("Nhập mã số chuyến xe: ");
            int maxe = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập Họ tên tài xế: ");
            String name = scanner.nextLine();
            System.out.println("Số xe: ");
            int soxe = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (type.equalsIgnoreCase("Nội thành")) {
                System.out.println("Số tuyến: ");
                int sotuyen = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Số km đi được: ");
                float sokmdi = scanner.nextFloat();
                System.out.println("Doanh thu: ");
                double doanhthu = scanner.nextDouble();
                scanner.nextLine();
                chuyenxe[i] = new XeNoiThanh(maxe, name, soxe, doanhthu, sotuyen, sokmdi);
            } else if (type.equalsIgnoreCase("Ngoại thành")) {
                System.out.println("Nơi đến: ");
                String noiden = scanner.nextLine();
                System.out.println("Số ngày đi được: ");
                int songaydiduoc = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Doanh thu: ");
                double doanhthu = scanner.nextDouble();
                scanner.nextLine();
                chuyenxe[i] = new XeNgoaiThanh(maxe, name, soxe, doanhthu, noiden, songaydiduoc);
            }

        }

    }

    public double Tongxenoithanh() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (chuyenxe[i] instanceof XeNoiThanh) {
                sum += chuyenxe[i].getDoanhthu();
            }
        }
        return sum;
    }

    public double Tongxengoaithanh() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (chuyenxe[i] instanceof XeNgoaiThanh) {
                sum += chuyenxe[i].getDoanhthu();
            }
        }
        return sum;
    }


    public void prinf() {
        System.out.println("Tổng số chuyến xe  là " + n);
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin chuyến xe thứ: " + (i + 1) + chuyenxe[i].toString());
        }
    }
}
