package Buoi9.BaiTap.QuanLyXe;

public class XeNoiThanh extends ChuyenXe {
    private int sotuyen;
    private float sokmdiduoc;

    public XeNoiThanh() {
    }

    public XeNoiThanh(int maxe, String hoten, int soxe, double doanhthu, int sotuyen, float sokmdiduoc) {
        super(maxe, hoten, soxe, doanhthu);
        this.sotuyen = sotuyen;
        this.sokmdiduoc = sokmdiduoc;
    }

    public int getSotuyen() {
        return sotuyen;
    }

    public float getSokmdiduoc() {
        return sokmdiduoc;
    }

    public void setSotuyen(int sotuyen) {
        this.sotuyen = sotuyen;
    }

    public void setSokmdiduoc(float sokmdiduoc) {
        this.sokmdiduoc = sokmdiduoc;
    }

    @Override
    public String toString() {
        return "XeNoiThanh{" + "Ma xe: " + getMaxe() +
                "Họ tên: " + getHoten() +
                "Số xe: " + getSoxe() +
                "sotuyen=" + sotuyen +
                ", sokmdiduoc=" + sokmdiduoc +
                "Doanh thu: " + getDoanhthu() +
                '}';
    }
}
