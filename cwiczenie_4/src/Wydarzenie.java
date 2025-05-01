import java.util.ArrayList;

public class Wydarzenie {
        private String nazwa;
        private String data;
        private String miejsce;
        private int maxLiczbaMiejsc = 100;
        private int dostepneMiejsca = 100;
        private double cena;

        public Wydarzenie(String nazwa, double cena) {
            this.nazwa = nazwa;
            this.cena = cena;
        }

        public Wydarzenie(String nazwa, double cena, String data) {
            this(nazwa, cena);
            this.data = data;
        }

        public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
            this(nazwa, cena, data);
            this.miejsce = miejsce;
        }

        public String getNazwa() { return nazwa; }
        public void setNazwa(String nazwa) { this.nazwa = nazwa; }

        public String getData() { return data; }
        public void setData(String data) { this.data = data; }

        public String getMiejsce() { return miejsce; }
        public void setMiejsce(String miejsce) { this.miejsce = miejsce; }

        public int getMaxLiczbaMiejsc() { return maxLiczbaMiejsc; }

        public int getDostepneMiejsca() { return dostepneMiejsca; }
        public void setDostepneMiejsca(int dostepneMiejsca) { this.dostepneMiejsca = dostepneMiejsca; }

        public double getCena() { return cena; }
        public void setCena(double cena) { this.cena = cena; }

        public String toString() {
            return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce +
                    ", Cena: " + cena + " PLN, Dostępne miejsca: " + dostepneMiejsca;
        }

        public void zarezerwujMiejsce() {
            if (dostepneMiejsca > 0) {
                dostepneMiejsca--;
            } else {
                System.out.println("Brak wolnych miejsc na wydarzeniu: " + nazwa);
            }
        }
    }

