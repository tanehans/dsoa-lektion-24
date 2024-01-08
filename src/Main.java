public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen!");

        Car car = new Car("Celica");
        Car anotherCar = new Car("Veyron");

        System.out.println(car.getName());
        anotherCar.setName("Galardo");
        System.out.println(anotherCar.getName());
    }
}