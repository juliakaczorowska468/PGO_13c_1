import java.time.LocalDate;

public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[10];
    private Klient[] klienci = new Klient[10];
    private Zamowienie[] zamowienia = new Zamowienie[10];
    private int liczbaProduktow = 0;
    private int liczbaKlientow = 0;
    private int liczbaZamowien = 0;

    // Dodawanie produktow

    public void dodajProdukt(Produkt produkt) {
        if (liczbaProduktow < produkty.length) {
            produkty[liczbaProduktow++] = produkt;
        } else {
            System.out.println("Brak miejsca na nowy produkt.");
        }
    }

    // Dodawanie klientów

    public void dodajKlienta(Klient klient) {
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow++] = klient;
        } else {
            System.out.println("Brak miejsca na nowego klienta.");
        }
    }

    // Tworzenie zamowienia

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produktyZamowienia, int[] ilosciZamowienia) {
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setId(liczbaZamowien);
        zamowienie.setKlient(klient);
        zamowienie.setProdukty(produktyZamowienia);
        zamowienie.setIlosci(ilosciZamowienia);
        zamowienie.setDataZamowienia(LocalDate.now().toString());
        zamowienie.setStatus("Nowe");

        if (liczbaZamowien < zamowienia.length) {
            zamowienia[liczbaZamowien++] = zamowienie;
        } else {
            System.out.println("Brak miejsca na nowe zamówienie.");
        }

        return zamowienie;
    }

    // Aktualizacja stanu magazynowego po zamówieniu

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        Produkt[] zamProdukty = zamowienie.getProdukty();
        int[] zamIlosci = zamowienie.getIlosci();

        for (int i = 0; i < zamProdukty.length; i++) {
            int idZamowionegoProduktu = zamProdukty[i].getId();
            int iloscZamowiona = zamIlosci[i];

            for (int j = 0; j < liczbaProduktow; j++) {
                if (produkty[j].getId() == idZamowionegoProduktu) {
                    int nowaIlosc = produkty[j].getIloscWMagazynie() - iloscZamowiona;
                    produkty[j].setIloscWMagazynie(nowaIlosc);
                    break;
                }
            }
        }
    }

    // Zmiana statusu zamówienia

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {

        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getId() == idZamowienia) {
                zamowienia[i].setStatus(nowyStatus);
                System.out.println("Status zamówienia " + idZamowienia + " został zmieniony na: " + nowyStatus);
                return;
            }
        }
        System.out.println("Nie znaleziono zamówienia: " + idZamowienia);
    }

    // Wyświetlenie produktów z danej kategorii

    public void wyswietlProduktyWKategorii(String kategoria) {
        System.out.println("Produkty w kategorii: " + kategoria);

        for (int i = 0; i < liczbaProduktow; i++) {
            if (produkty[i].getKategoria().equalsIgnoreCase(kategoria)) {
                produkty[i].wyswietlInformacje();
                System.out.println("--------------");
            }
        }
    }

    // Wyświetlenie zamówień klienta o podanym ID

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        System.out.println("Zamówienia klienta: " + idKlienta);

        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getKlient().getId() == idKlienta) {
                zamowienia[i].wyswietlSzczegoly();
                System.out.println("=======");
            }
        }
    }
}







