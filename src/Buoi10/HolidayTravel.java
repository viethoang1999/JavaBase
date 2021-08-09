package Buoi10;

public class HolidayTravel {
    private Travel travel;

    public HolidayTravel(Travel travel) {
        this.travel = travel;
    }

    public void travel() {
        travel.move();
        travel.print();
    }

}
