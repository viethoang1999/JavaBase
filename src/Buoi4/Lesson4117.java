package Buoi4;
//Viết chương trình nhập n và tính tổng S(n) = x + x^2 + x^3 + … + x^n
public class Lesson4117 {
    public static float luyThua(float x,float n){
        float t=1;
        for (int i=1;i<=n;i++){
            t*=x;
        }
        return t;
    }
    public  static float sum(float x,int n){

        float s=0;
        for (int i=1;i<=n;i++){
            s+=luyThua(x,i);
        }
        return s;
    }

    public static void main(String[] args) {
        float ketqua=sum(3,2);
        System.out.println(ketqua);
    }
}
