package Buoi9;

public class Dog extends Animal {

    public String speak(){
        return "gau gau";
    }
   @Override
    public  Dog demo(Animal dog){
        return new Dog();
    }
}
