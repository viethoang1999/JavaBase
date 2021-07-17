package Buoi4;
// Viết chương trình nhập n và tính tổng S = 1 + 2 + 3 + … + n
public class Lesson4116 {
    public  static int sum(int n){
        int s=0;
        for (int i=1;i<=n;i++) {
            s+=i;
        }

        return s;
    }

    public static void main(String[] args) {
        int ketqua=sum(5);
        System.out.println(ketqua);
    }

}
