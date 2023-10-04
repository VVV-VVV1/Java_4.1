package task10;
import java.util.Scanner;

public class TesterTransport {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько людей поедет?");
        int x = scanner.nextInt();
        Transport obj1 = new Car(x,4);
        System.out.println(obj1.toString());
        Transport obj2 = new Airplane(x, 4);
        System.out.println(obj2.toString());
        Transport obj3 = new Train(x, 4);
        System.out.println(obj3.toString());
        Transport obj4 = new Ship(x, 4);
        System.out.println(obj4.toString());

    }
}
