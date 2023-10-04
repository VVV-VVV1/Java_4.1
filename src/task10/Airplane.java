package task10;

public class Airplane extends Transport{
    public Airplane(int people, double time) {
        super(people, time);
    }

    @Override
    double method_time() {
        return getTime();
    }

    @Override
    int method_price() {
        return getPeople() * 2000;
    }

    @Override
    public String toString() {
        return "На самолете\nвремя поездки: " + method_time() + "\nцена поездки: " + method_price();
    }
}
