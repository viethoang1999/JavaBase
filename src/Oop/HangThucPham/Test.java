package Oop.HangThucPham;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HangHoa hangHoa=new HangHoa();
            boolean ktrahang=true;
            boolean ktranngay=true;
        System.out.println("Nhập mã hàng : ");
        String mahang=scanner.nextLine();
        do {
            System.out.println("Nhập tên hàng: ");
           hangHoa.setTenhang(scanner.nextLine());
        }while (hangHoa.kiemTraTenHang(ktrahang));
        System.out.println("Nhập đơn giá: ");
        long dongia= scanner.nextLong();
        do {
            System.out.println("Nhập ngày tháng năm sx: ");
            hangHoa.ngaySanXuat(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
            System.out.println("Nhập ngày tháng ănm hết hạn: ");
            hangHoa.ngayHetHan(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }while (hangHoa.kiemTraNgay(ktranngay));
        System.out.println(hangHoa);
        hangHoa.kiemTraHSD();

    }
}
