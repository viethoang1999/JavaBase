package Buoi10.TruuTuong.QuanLyHangHoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HangThucPham extends Hang {
    private LocalDate ngaysanxuat;
    private LocalDate ngayhethan;
    private String nhacungcap;

    public LocalDate getNgaysanxuat() {
        return ngaysanxuat;
    }

    public void setNgaysanxuat(LocalDate ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    public LocalDate getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(LocalDate ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày sản xuất: ");
        String inputDate = scanner.nextLine();
        this.ngaysanxuat = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập ngày hết hạn: ");
        String output = scanner.nextLine();
        this.ngayhethan = LocalDate.parse(output, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập nhà cung cấp: ");
        this.nhacungcap = scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Nhà sản xuất: " + this.nhacungcap);
        System.out.println("Ngày sản xuất: " + this.ngaysanxuat);
        System.out.println("Ngày hết hạn: " + this.ngayhethan);
        System.out.println("Nhà cung cáp: " + this.nhacungcap);

    }

    @Override
    public String toString() {
        return "HangThucPham{" +
                "ngaysanxuat=" + ngaysanxuat +
                ", ngayhethan=" + ngayhethan +
                ", nhacungcap='" + nhacungcap + '\'' +
                '}';
    }

    @Override
    public double getVat() {
        return vats[FOOD];
    }

    @Override
    public int valuate() {
        if (getSoluongtonkho()>0&&LocalDate.now().compareTo(ngayhethan)>0){
            return KHO_BAN;
        }
        return BAN_DUOC;
    }
}
