public class Orzel extends Ptak {
    public Orzel(String nazwa, int wiek, boolean potrafiLatac) {
        super(nazwa, wiek, potrafiLatac);
    }

    @Override
    public String wydajDzwiek() {
        return "Aaua";
    }

    @Override
    public String poruszSie() {
        return "Orzel szybuje w powietrzu";
    }
}

