package Buoi10.TruuTuong.QuanLyHangHoa;

import java.awt.*;

public class ProductManager {
    private int n;
    private Hang[] hangs;

    public ProductManager(int n) {
        this.n = n;
        this.hangs = new Hang[n];
    }

    public boolean add(Hang hang) {
        if (n > 100) return false;
        for (int i = 0; i < n; i++) {
            if (hang.getMahang().equals(hangs[i].getMahang())){
                return false;
            }
        }
        hangs[n++]=hang;
        return true;
    }
  public void input(){
        for (int i=0;i<n;i++){
            if (i%3==ProductFactory.FOOD){
                hangs[i]=ProductFactory.get(ProductFactory.FOOD);

            }else if(i%3==ProductFactory.ELECTRIC){
                hangs[i]= ProductFactory.get(ProductFactory.ELECTRIC);
            }else {
                hangs[i]=ProductFactory.get(ProductFactory.CROCKERY);
            }
            hangs[i].input();
        }
  }
  public void output(){
        for (int i=0;i<n;i++){
            hangs[i].output();
        }
  }
}
