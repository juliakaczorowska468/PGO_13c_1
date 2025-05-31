public class Zmija extends Gad {
    public Zmija(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek, jadowity);
    }

    @Override
    public String wydajDzwiek() {
        return "Ssssss";
    }

    @Override
    public String poruszSie() {
        return "Zmija pelza";
    }
}

