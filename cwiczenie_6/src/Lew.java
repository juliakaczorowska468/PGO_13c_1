public class Lew extends Ssak {
    public Lew(String nazwa, int wiek, boolean maFutro) {
        super(nazwa, wiek, maFutro);
    }

    @Override
    public String wydajDzwiek() {
        return "Roar";
    }

    @Override
    public String poruszSie() {
        return "Lew biegnie";
    }
}

