package task10;

public class Train extends Transport{
    public Train(int people, double time) {
        super(people, time);
    }

    @Override
    double method_time() {
        return getTime() * 1.5;
    }

    @Override
    int method_price() {
        return getPeople() * 1000;
    }

    @Override
    public String toString() {
        return "На поезде\nвремя поездки: " + method_time() + "\nцена поездки: " + method_price();
    }
}
