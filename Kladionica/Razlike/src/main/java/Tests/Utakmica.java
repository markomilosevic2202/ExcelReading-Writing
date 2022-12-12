package Tests;

public class Utakmica {
    String naziv;
    double kec;
    double x;
    double dvojka;
    double razlikaKec;
    double razlikaDvojka;
    String datuma;
    String vreme;

    public Utakmica() {
    }


    public Utakmica(String naziv, double kec, double x, double dvojka) {
        this.naziv = naziv;
        this.kec = kec;
        this.x = x;
        this.dvojka = dvojka;
        this.razlikaKec = 0;
        this.razlikaDvojka = 0;
        this.datuma = null;
        this.vreme = null;
    }
    public Utakmica(String naziv, double kec, double x, double dvojka, String datum, String vreme) {
        this.naziv = naziv;
        this.kec = kec;
        this.x = x;
        this.dvojka = dvojka;
        this.razlikaKec = 0;
        this.razlikaDvojka = 0;
        this.datuma = datum;
        this.vreme = vreme;
    }

    public Utakmica(String naziv) {
        this.naziv = naziv;
    }

    public void stampa(){
        System.out.println(this.datuma);
        System.out.println(this.vreme);
        System.out.println(this.naziv);
        System.out.println(this.kec);
        System.out.println(this.razlikaKec);
        System.out.println(x);
        System.out.println(dvojka);
        System.out.println(razlikaDvojka);


    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getKec() {
        return kec;
    }

    public void setKec(double kec) {
        this.kec = kec;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getDvojka() {
        return dvojka;
    }

    public void setDvojka(double dvojka) {
        this.dvojka = dvojka;
    }

    public double getRazlikaKec() {
        return razlikaKec;
    }

    public void setRazlikaKec(double razlikaKec) {
        this.razlikaKec = razlikaKec;
    }

    public double getRazlikaDvojka() {
        return razlikaDvojka;
    }

    public void setRazlikaDvojka(double razlikaDvojka) {
        this.razlikaDvojka = razlikaDvojka;
    }

    public String getDatuma() {
        return datuma;
    }

    public void setDatuma(String datuma) {
        this.datuma = datuma;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }
}

