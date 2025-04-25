import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Test1");
        lista.add("Test2");

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista.remove("Test2");
        lista.remove(0);
        System.out.println(lista);

        ArrayList<Integer> lista2 = new ArrayList<>();


        Playlista pl1 = new Playlista("Playlista1");
        pl1.dodajUtwor("Test1");
        pl1.dodajUtwor("Test2");
        pl1.dodajUtwor("Utwor1");
        pl1.dodajUtwor("Utwor2");
        pl1.dodajUtwor("Utwor3");

        pl1.dodajUtwor(null);
        pl1.dodajUtwor("");
        pl1.dodajUtwor("Test1");

        pl1.wyswietlUtwory();

        pl1.usunUtwor("Test1");
        pl1.usunUtwor("");
        pl1.usunUtwor(null);
        pl1.wyswietlUtwory();

        pl1.wyszukajUtwory("Test");
        pl1.wyszukajUtwory("t");
        pl1.wyszukajUtwory(null);
        pl1.wyszukajUtwory("");
    }
}
