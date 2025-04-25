import java.util.ArrayList;

public class Playlista {
    private String nazwa;
    private ArrayList<String> utwory;

    //TODO Getter, Setter do nazwy - ZROBIONE

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Playlista(String nazwa) {
        this.nazwa = nazwa;
        this.utwory = new ArrayList<>();
    }

    public void dodajUtwor(String nazwaUtworu) {
        if (nazwaUtworu == null || nazwaUtworu.isBlank()) {
            return;
        }
        if (utwory.contains(nazwaUtworu)) {
            return;
        }
        utwory.add(nazwaUtworu);
    }

    public void usunUtwor(String nazwaUtworu) {
        utwory.remove(nazwaUtworu);
    }

    public void wyswietlUtwory() {
        System.out.println("Playlista: " + nazwa);
        for (int i = 0; i < utwory.size(); i++) {
            System.out.println("Utwor: " + (i + 1) + ": " + utwory.get(i));
        }
    }

    public void wyszukajUtwory(String opis) {
        if (opis == null) {
            opis = "";
        }
        System.out.println("Playlista: " + nazwa);
        System.out.println("Nazwa utworu zawiera: " + opis);
        for (int i = 0; i < utwory.size(); i++) {
            if (utwory.get(i).contains(opis)) {
                System.out.println("Utwor: " + (i + 1) + ": " + utwory.get(i));
            }
        }
    }

    public void wyswietl() {
        System.out.println("Playlista: " + nazwa);
        for (String utwor : utwory) {
            System.out.println(" - " + utwor);
        }
    }
}

