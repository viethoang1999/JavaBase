package Buoi3;

import java.util.Scanner;

//Nhập vào tháng của 1 năm. Cho biết tháng thuộc quý mấy trong năm
public class Lesson385 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tháng : ");
        int thang=scanner.nextInt();
        switch (thang){
            case 1:
            case 2:
            case 3:
                System.out.println("Thuộc quý 1");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Thuộc quý 2");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Thuộc quý 3");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Thuộc quý 4");
                break;
            default:
                System.out.println("Không hợp lệ");

        }

    }

}
