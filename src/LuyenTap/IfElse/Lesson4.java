package LuyenTap.IfElse;

import java.util.Scanner;

//Viết chương trình  xếp hạng học lực của học sinh dựa trên
// các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ.
//Điểm trung bình >= 9.0 là hạng A.
//Điểm trung bình >=7.0 và < 9.0 là hạng B
//Điểm trung bình >=5.0 và < 7.0 là hạng C
//Điểm trung bình <5.0 là hạng F
public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Điển ktra: ");
        float scorekt = scanner.nextInt();
        System.out.println("Điểm thi giữa kì: ");
        float scoregk = scanner.nextInt();
        System.out.println("Điểm thi cuối kì: ");
        float scoreck = scanner.nextInt();
        float medium = (scorekt + scoregk + scoreck) / 3;
        if (medium >= 9) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println(medium + " đạt loại A");
        } else if (medium < 9 && medium >= 7) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println(medium + " đạt loại B");
        } else if (medium < 7 && medium >= 5) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println(medium + " Đạt loại C");
        } else if (medium < 5) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println(medium + " Đạt lạoi F");
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}
