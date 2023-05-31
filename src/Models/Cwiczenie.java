package Models;

abstract class Cwiczenie {
    protected String nazwa;
    protected int serie;

    public Cwiczenie(String nazwa, int serie) {
        this.nazwa = nazwa;
        this.serie = serie;
    }

    public void wyswietlInformacje() {
        System.out.println("Ćwiczenie: " + nazwa);
        System.out.println("Serie: " + serie);
    }
}

class CwiczenieKlaty extends Cwiczenie {
    public CwiczenieKlaty(String nazwa, int serie) {
        super(nazwa, serie);
    }
}

class CwiczeniePlecow extends Cwiczenie {
    public CwiczeniePlecow(String nazwa, int serie) {
        super(nazwa, serie);
    }
}