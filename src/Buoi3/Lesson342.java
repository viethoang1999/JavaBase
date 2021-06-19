package Buoi3;
//Cho n là số nguyên dương. Hãy tìm giá trị nguyên dương k lớn nhất sao
//cho S(k) < n. Trong đó chuỗi S(k) được định nghĩa như sau : S(k) = 1 +
//2 + 3 + … + k.
import java.util.Scanner;

public class Lesson342 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        int sum=0;
        for (int i=1;sum+i<n;i++){
            sum+=++i;
        }
        System.out.println("Giá trị nguyên dương k lớn nhất thỏa mãn: "+sum);
    }
}
