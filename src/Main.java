import java.util.Random;
import java.util.Scanner;

public class Main {
    static final double GAME_VERSION = 1.0;
    public static void main(String[] args) {
        System.out.println("Välkommen!");

        Car car = new Car("Celica");
        Car anotherCar = new Car("Veyron");

        Bike bike = new Bike("Tunturi");

        Shirt shirt = new Shirt("Black t-shirt", 100, "1234");

        shirt.setPrice(123);
        System.out.println(shirt.getCondition());

        System.out.println(car.getName());
        anotherCar.setName("Galardo");
        System.out.println(anotherCar.getName());
        System.out.println(bike.getName());

        System.out.println("Cars created: " + car.getCarsCreated());


        System.out.println("GAME VERSION: " + GAME_VERSION);

        while(true) {
            Random random = new Random();
            Scanner strInput = new Scanner(System.in);

            System.out.println(random.nextInt(0,100));
            System.out.println("Write q to quit");
            if (strInput.nextLine().equals("q")) {
                System.out.println("BYE!");
                System.exit(0);
            }
            System.out.println();
        }
    }
}