package Buoi10;

public abstract class SV {
    private int msv;
    private int hoten;

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public int getHoten() {
        return hoten;
    }

    public void setHoten(int hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return "SV{" +
                "msv=" + msv +
                ", hoten=" + hoten +
                '}';
    }
}
