public abstract class Ptak extends Zwierze {
    protected boolean potrafiLatac;

    public Ptak(String nazwa, int wiek, boolean potrafiLatac) {
        super(nazwa, wiek);
        this.potrafiLatac = potrafiLatac;
    }

    public void zlatuj() {
        System.out.println(nazwa + " zlatuje z wysokosci");
    }
}
