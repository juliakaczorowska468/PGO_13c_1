public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(5);

        myCar.start();
        myCar.stop();

        System.out.println("Liczba miejsc:" + myCar.getNumberOfSeats());
    }
}