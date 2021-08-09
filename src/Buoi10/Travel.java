package Buoi10;

public interface Travel {
    void move();

//    Travel instance();

    default void print(){
        System.out.println("Chỉ làm đề mô");
    }
   static Travel getIntance(){
        return new Car();
   }
}
