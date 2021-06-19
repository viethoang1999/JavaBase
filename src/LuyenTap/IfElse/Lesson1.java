package LuyenTap.IfElse;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Mời bạn nhập tuổi: ");
        int age=scanner.nextInt();
        if(age==16){
            System.out.println("Tuổi của bạn là "+age+" đã đủ tuổi");
            System.out.println("Bạn đã đủ tuổi vào lớp 10");
        }else {
            System.out.println("Tuổi của bạn là "+age);
            System.out.println("Bạn chưa đủ tuổi vào lớp 10");
        }
    }
}
