public class Main {
    public static void main(String[] args) {
        Animal [] animals = {
                new Lion(),
                new Cat(),
                new Wolf(),
                new Dog()
        };
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            animal.sleep();

            System.out.println();
        }
    }

}