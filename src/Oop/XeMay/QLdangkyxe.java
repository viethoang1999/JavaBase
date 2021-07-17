package Oop.XeMay;

import java.util.Scanner;

public class QLdangkyxe {
    private String name;
    private String loaixe;
    private int dungtich;
    private float price;


    public QLdangkyxe() {
    }

    public QLdangkyxe(String name, String loaixe, int dungtich, float price) {
        this.name = name;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public int getDungtich() {
        return dungtich;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ten: ");
        name = scanner.nextLine();
        System.out.println("Loai xe: ");
        loaixe = scanner.nextLine();
        System.out.println("Dung tich: ");
        dungtich = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Gia: ");
        price = scanner.nextFloat();
    }

    public void xuat() {
        System.out.println("Ten: " + name);
        System.out.println("Loai xe: " + loaixe);
        System.out.println("Dung tich: " + dungtich);
        System.out.println("Gia: " + price);
    }

    public float thuephainop() {
        float thue = 1;
        if (dungtich < 100) {
            thue = (float) (price * 0.01);
        } else if (100 <= dungtich || dungtich <= 200) {
            thue = (float) (price * 0.03);
        } else {
            thue = (float) (price * 0.05);
        }
        return thue;
    }

    public String toString() {
        return "{ Ten: " + name + "; loai xe: " + loaixe +
                "; dung tich: " + dungtich + "; gia: " + price +
                "; thue phai nop: " + thuephainop() + " }";
    }

}
