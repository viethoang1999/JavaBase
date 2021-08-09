package Buoi10;
// các phương thức trong interface mựac định là public abstract
// các biến trong interface mặc định là public static final
// từ java 7 đổ về trk thì interface ko khai báo đk thân hàm
// các class implement đk nhiều interface
public class Plain implements Travel {
    @Override
    public void move() {
        System.out.println("By Plain");
    }
}
