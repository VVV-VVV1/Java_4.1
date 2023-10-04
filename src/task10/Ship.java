package task10;

public class Ship extends Transport{
    public Ship(int people, double time) {
        super(people, time);
    }

    @Override
    double method_time() {
        return getTime() * 3;
    }

    @Override
    int method_price() {
        return getPeople() * 5000;
    }

    @Override
    public String toString() {
        return "На каробле\nвремя поездки: " + method_time() + "\nцена поездки: " + method_price();
    }
}
