public class zarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze[] zoo = {
                new Lew("Lew", 8, true),
                new Orzel("Orzel bialy", 10, true),
                new Zmija ("Zmija zygzakowata", 4, true)
        };

        for (Zwierze zwierze : zoo) {
            zwierze.wyswietlInformacje();
            System.out.println("Dzwiek: " + zwierze.wydajDzwiek());
            System.out.println("Ruch: " + zwierze.poruszSie());

            if (zwierze instanceof Ssak) {
                ((Ssak) zwierze).ssieMleko();
            } else if (zwierze instanceof Ptak) {
                ((Ptak) zwierze).zlatuj();
            } else if (zwierze instanceof Gad) {
                ((Gad) zwierze).zrzucaSkore();
            }

            System.out.println("--");
        }
    }
}
