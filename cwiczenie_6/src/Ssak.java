public abstract class Ssak extends Zwierze {
    protected boolean maFutro;

    public Ssak(String nazwa, int wiek, boolean maFutro) {
        super(nazwa, wiek);
        this.maFutro = maFutro;
    }

    public void ssieMleko() {
        System.out.println(nazwa + " ssie mleko.");
    }
}

