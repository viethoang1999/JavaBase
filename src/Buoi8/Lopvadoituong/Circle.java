package Buoi8.Lopvadoituong;

public class Circle {
    private double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return  3.14*radius*radius;
    }
    public double getCircumference(){
        return 3.14*2*radius;
    }
}
