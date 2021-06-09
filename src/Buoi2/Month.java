package Buoi2;

import java.util.Scanner;

//Nhập vào tháng cho biết tháng đó có bao nhiêu ngày
//input:nhập vào 1 tháng
//output:số ngày
//tháng có 31 ngày:1,3,5,7, 8, 10, 12
//tháng có 30 ngày:4,6,9,11
//năm nhuận tháng 2:29 ngày, ko nhuận tháng 2:28 ngày;
//năm nhuận là năm chia hết cho 4 và ko  ko chia hết cho 100 hoặc chia hết cho 400;
public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm cần tìm: ");
        int nam = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào tháng: ");
        int thang = scanner.nextInt();
        scanner.nextLine();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 31 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày ");
            case 2:
                if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
                    System.out.println("Tháng có 29 ngày");
                } else {
                    System.out.println("Tháng có 28 ngày");
                }
                break;
            default:
                System.out.println("Tháng không hợp lệ");
                break;
        }

    }
}
