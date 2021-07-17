package Buoi3;

import javafx.scene.transform.Scale;

import java.util.Scanner;

//Viết chương trình nhập giá trị x sau tính giá trị của hàm số
//f(x) = 2x^2 + 5x + 9 khi x >= 5, f(x) = -2x^2 + 4x – 9 khi x < 5
public class Lesson396 {
    public static float tinh(float x) {
        float ketqua = 0;
        if (x >= 5) {
            ketqua = 2 * x * x + 5 * x + 9;
        } else {
            ketqua = -2 * x * x + 4 * x - 9;
        }
        return ketqua;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        float x = scanner.nextFloat();
        float ketqua = tinh(x);
        System.out.println(x + " kết quả là: " + ketqua);
    }
}
