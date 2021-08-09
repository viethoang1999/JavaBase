package Buoi10.TruuTuong.QuanLyNhanVIen;

import java.util.Scanner;

public abstract class Employee {
    private String name;
    private int age;
    private int id;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract long getMealAllowance();

    public abstract long getSalary();

    public abstract long getWorkingCount();

    public long getCalculateSalary() {
        return  getMealAllowance() + getWorkingCount() * getSalary();

    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập id: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
    }
    public void output(){
        System.out.println("Tên: "+this.name);
        System.out.println("Tuổi: "+this.age);
        System.out.println("Id: "+this.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
