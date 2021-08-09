package Buoi8.Lopvadoituong;

import java.util.Scanner;

public class Student {
    private String name;
    private  int age;



    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên: ");
         name=scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        age=scanner.nextInt();
    }
    public void in(){
        System.out.println("Tên: "+name);
        System.out.println("Tuổi: "+age);
    }


}
