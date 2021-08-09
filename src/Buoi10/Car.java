package Buoi10;

public class Car implements Travel {
    @Override
    public void move() {
        System.out.println("By Car");
        Travel.getIntance().print();
    }
}
