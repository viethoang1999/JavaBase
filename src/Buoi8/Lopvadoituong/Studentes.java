package Buoi8.Lopvadoituong;

import java.util.Scanner;

public class Studentes {
    private String name;
    private int age;

    public Studentes() {
    }

    public Studentes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
    }

    public void in() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
    }
}
