package Oop.Nganhang;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] user = null;
        int luachon = 0;
        int n = 0;
        do {
            System.out.println("Ban chon nghiep vu: ");
            System.out.println("1.Nhập thông tin khách hàng");
            System.out.println("2.Nạp tiền: ");
            System.out.println("3.Rút tiền");
            System.out.println("4.Đáo hạn");
            System.out.println("5.chuyển tiền");
            luachon = scanner.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println("Nhập số lượng khách hàng: ");
                    n = scanner.nextInt();
                    user = new User[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Khách hàng thứ: " + (i + 1));
                        user[i] = new User();
                        user[i].nhap();
                        user[i].xuat();
                    }
                    break;
                case 2:
                    System.out.println("Nhập số tài khoản cần nạp: ");
                    long stkcn = scanner.nextLong();
                    for (int i = 0; i < n; i++) {
                        long stk = user[i].getSotaikhoan();
                        if (stkcn == stk) {
                            System.out.println("Bjan chọn tài khoản: " + stk);
                            user[i].naptien();
                            System.out.println("");
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhập số tài khoản bạn muốn rút: ");
                    long stkcr = scanner.nextLong();
                    for (int i = 0; i < n; i++) {
                        long stk = user[i].getSotaikhoan();
                        if (stkcr == stk) {
                            System.out.println("Bạn chọn tài khoản: " + stk);
                            user[i].ruttien();
                        } else {
                            System.out.println(" ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập stk bạn cần đáo hạn: ");
                    long stkcdh = scanner.nextLong();
                    for (int i = 0; i < n; i++) {
                        long stk = user[i].getSotaikhoan();
                        if (stkcdh == stk) {
                            user[i].daohan();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 5:
                    double chuyen, nhan, tienchuyen;
                    System.out.println("Số tài khoản chuyển tiên: ");
                    long stkchuyentien = scanner.nextLong();
                    System.out.println("Số tài khoản nhận tiền: ");
                    long stknhantien = scanner.nextLong();
                    for (int i = 0; i < n; i++) {
                        long stkchuyen = user[i].getSotaikhoan();
                        if (stkchuyentien == stkchuyen) {
                            chuyen = user[i].getSotaikhoan();
                            for (int j = 0; j < n; j++) {
                                long stknhan = user[j].getSotaikhoan();
                                if (stknhantien == stknhan) {
                                    nhan = user[j].getSotaikhoan();
                                    System.out.println("Số tiền cần chuyển: ");
                                    tienchuyen = scanner.nextLong();
                                    if (tienchuyen <= chuyen) {
                                        chuyen -= tienchuyen;
                                        nhan += tienchuyen;
                                        user[i].setTientrongtaikhoan(stkchuyen);
                                        user[j].setTientrongtaikhoan(stknhan);
                                        System.out.println("Tài khoản số " + stkchuyen + " vừa chuyển: " + tienchuyen);
                                        System.out.println("Tài khoản số " + stknhan + " vừa nhận: " + tienchuyen);
                                    } else {
                                        System.out.println("Số tiền vừa chuyển không hợp lệ");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
            }
        } while (luachon < 6);

    }
}
