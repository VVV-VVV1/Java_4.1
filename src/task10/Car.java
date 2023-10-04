package task10;

public class Car extends Transport{
    public Car(int people, double time) {
        super(people, time);
    }

    @Override
    double method_time() {
        return getTime() * 2;

    }

    @Override
    int method_price() {
        return getPeople() * 100;
    }

    @Override
    public String toString() {
        return "На машине\nвремя поездки: " + method_time() + "\nцена поездки: " + method_price();
    }
}
