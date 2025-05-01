import java.util.ArrayList;
public class SystemRezerwacji {

        private ArrayList<Wydarzenie> wydarzenia = new ArrayList<>();
        private ArrayList<Klient> klienci = new ArrayList<>();

        public void dodajWydarzenie(Wydarzenie wydarzenie) {
            wydarzenia.add(wydarzenie);
        }

        public void dodajWydarzenie(String nazwa, double cena) {
            wydarzenia.add(new Wydarzenie(nazwa, cena));
        }

        public void dodajKlienta(Klient klient) {
            klienci.add(klient);
        }

        public void dodajKlienta(String imie, String nazwisko, String email) {
            klienci.add(new Klient(imie, nazwisko, email));
        }

        public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
            if (wydarzenie.getDostepneMiejsca() > 0) {
                klient.dodajRezerwacje(wydarzenie);
                wydarzenie.zarezerwujMiejsce();
            } else {
                System.out.println("Brak wolnych miejsc na to wydarzenie!");
            }
        }

        public Wydarzenie znajdzWydarzenie(String nazwa) {
            for (Wydarzenie w : wydarzenia) {
                if (w.getNazwa().equalsIgnoreCase(nazwa)) {
                    return w;
                }
            }
            return null;
        }

        public Klient znajdzKlienta (String nazwisko) {
            for (Klient k : klienci) {
                if (k.getNazwisko().equalsIgnoreCase(nazwisko)) {
                    return k;
                }
            }
            return null;
        }

        public void zmienCeneWydarzenia (String nazwa, double nowaCena) {
            Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
            if (wydarzenie != null) {
                wydarzenie.setCena(nowaCena);
            }
        }
    }



