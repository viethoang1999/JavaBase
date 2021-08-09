package Buoi10.TruuTuong.QuanLyHangHoa;

public class ProductFactory {
    public static Hang[] hangs;
    public static final int FOOD = 0;
    public static final int ELECTRIC = 1;
    public static final int CROCKERY = 2;

    static {
        hangs = new Hang[3];
        hangs[FOOD] = new HangThucPham();
        hangs[ELECTRIC] = new HangDienMay();
        hangs[CROCKERY] = new HangSanhSu();
    }

    public static Hang get(int type) {
        return hangs[type];
    }
}
