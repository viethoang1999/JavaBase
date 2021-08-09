package Buoi10;

public class Test {
    public static void main(String[] args) {
        // SV sv=new SVDH() ;
//        Travel travel = new Bicycle();
//        travel.move();
//        Travel car = new Car();
//        car.move();
        HolidayTravel holidayTravel=new HolidayTravel(new Car());
        holidayTravel.travel();
    }
}
