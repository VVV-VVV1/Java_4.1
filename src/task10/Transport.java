package task10;

public abstract class Transport {
    private int people;
    private double time;

    public Transport(int people, double time) {
        this.people = people;
        this.time = time;
    }

    public int getPeople() {
        return people;
    }

    public double getTime() {
        return time;
    }

    abstract double method_time();
    abstract int method_price();

    public abstract String toString();

}
