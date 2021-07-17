package LuyenTap.VongLap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
