package Buoi8.Lopvadoituong;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
public Person(){

}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name=scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age=scanner.nextInt();
    }
     public void in(){
         System.out.println("Ten: "+name);
         System.out.println("Tuoi" +age);
     }
}
