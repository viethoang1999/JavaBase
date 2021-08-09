package Buoi10.TruuTuong.QuanLyHangHoa;

import java.util.Scanner;

public class HangDienMay extends Hang {
    private int thoigianbaohanh;
    private float congsuat;

    public int getThoigianbaohanh() {
        return thoigianbaohanh;
    }

    public void setThoigianbaohanh(int thoigianbaohanh) {
        if (thoigianbaohanh < 0) {
            System.out.println("Thời gian bảo hành phải lớn hơn bằng 0");
            System.exit(0);
        }
        this.thoigianbaohanh = thoigianbaohanh;
    }

    public float getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(float congsuat) {
        if (congsuat < 0) {
            System.out.println("CÔng suất phải lớn hơn bằng 0");
            System.exit(0);
        }
        this.congsuat = congsuat;

    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thời gian bảo hành: ");
        this.thoigianbaohanh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập công suất: ");
        this.congsuat = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Thời gian bảo hành: " + this.thoigianbaohanh);
        System.out.println("Công suất: " + this.congsuat);
    }

    @Override
    public double getVat() {
        return vats[ELECTRIC];
    }

    @Override
    public int valuate() {
        if (getSoluongtonkho()<3)return BAN_DUOC;
        return BAN_CHAM;
    }

}
