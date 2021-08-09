package Buoi9.BaiTap.QuanLyXe;

public class XeNgoaiThanh extends ChuyenXe {
    private String noiden;
    private int songaydiduoc;

    public XeNgoaiThanh() {
    }

    public XeNgoaiThanh(int maxe, String hoten, int soxe, double doanhthu, String noiden, int songaydiduoc) {
        super(maxe, hoten, soxe, doanhthu);
        this.noiden = noiden;
        this.songaydiduoc = songaydiduoc;
    }

    public String getNoiden() {
        return noiden;
    }

    public int getSongaydiduoc() {
        return songaydiduoc;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public void setSongaydiduoc(int songaydiduoc) {
        this.songaydiduoc = songaydiduoc;
    }

    @Override
    public String toString() {
        return "XeNgoaiThanh{" +
                "ma xe: " + getMaxe() +
                "Họ tên: " + getHoten() +
                "Số xe: " + getSoxe() +
                "noiden='" + noiden + '\'' +
                ", songaydiduoc=" + songaydiduoc +
                "Doanh thu: " + getDoanhthu() +
                '}';
    }
}
