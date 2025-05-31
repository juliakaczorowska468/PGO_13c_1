public abstract class Zwierze {
    protected String nazwa;
    protected int wiek;

    public Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public abstract String wydajDzwiek();
    public abstract String poruszSie();

    public void wyswietlInformacje() {
        System.out.println("Zwierzę: " + nazwa + ", wiek: " + wiek);
    }
}

