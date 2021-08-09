package Buoi10.TruuTuong.QuanLyHangHoa;

public abstract class VatValue implements Vat{
    public static double[] vats;
    public  static final int FOOD=0;
    public static final int ELECTRIC=1;
    public static final int CROCKERY=2;
    static{
        vats= new double[3];
        vats[FOOD]=0.05;
        vats[ELECTRIC]=0.1;
        vats[CROCKERY]=0.1;
    }
}
