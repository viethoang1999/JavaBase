package Buoi8.Lopvadoituong;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Student student=new Student();
//        student.nhap();
//        student.in();
//        HCN hcn=new HCN();
//        hcn.nhap();
//        hcn.in();
//        hcn.KichThuoc();
//        Person person = new Person("Hoang", 22);
//        Person person1 = new Person();
//        person.in();
//        person1.nhap();
//        person1.in();
//        Circle circle=new Circle(10);
//        System.out.println("Diện tích: "+circle.getArea());
//        System.out.println("Chu vi: "+circle.getCircumference());
        int n = scanner.nextInt();
        Studentes[] studentes = new Studentes[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so luong sinh vien " + (i + 1));
            studentes[i] = new Studentes();
            studentes[i].nhap();
            studentes[i].in();
          
        }
    }
}
