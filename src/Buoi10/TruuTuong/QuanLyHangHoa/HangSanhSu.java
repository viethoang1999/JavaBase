package Buoi10.TruuTuong.QuanLyHangHoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HangSanhSu extends Hang {
    private String nhasanxuat;
    private LocalDate ngaysanxuat;

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public LocalDate getNgaysanxuat() {
        return ngaysanxuat;
    }

    public void setNgaysanxuat(LocalDate ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập nhà sản xuát: ");
        this.nhasanxuat = scanner.nextLine();
        ;
        System.out.println("Nhập ngày sản xuát: ");
        String inputDate = scanner.nextLine();
        ;
        this.ngaysanxuat = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Nhà sản xuất: "+this.nhasanxuat);
        System.out.println("Ngày sản xuát: "+this.ngaysanxuat);
    }

    @Override
    public double getVat() {
        return vats[CROCKERY];
    }

    @Override
    public int valuate() {
         if (getSoluongtonkho()>50&&LocalDate.now().compareTo(ngaysanxuat)>10)return BAN_CHAM;
         return BAN_DUOC;
    }
}

