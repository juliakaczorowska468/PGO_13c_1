class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    @Override
    public void start(){
        System.out.println("Samochod z " + numberOfSeats + "miejscami zostal uruchomiony");
    }

    @Override
    public void stop(){
        System.out.println("Samochod z" + numberOfSeats + "miejscami zostal zatrzymany");
    }
}
