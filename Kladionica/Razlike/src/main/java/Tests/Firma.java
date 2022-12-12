package Tests;

public class Firma {
    public String naziv;
    public String adresa;
    public String pib;
    public Boolean status;
    public double brojZaposlenih;
    public double prihodi;

    public Firma() {
    }

    public Firma(String naziv) {
        this.naziv = naziv;
    }

    public Firma(String naziv, String adresa, String pib, Boolean status, double brojZaposlenih, double prihodi) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.pib = pib;
        this.status = status;
        this.brojZaposlenih = brojZaposlenih;
        this.prihodi = prihodi;
    }

    public void stampa() {
        System.out.print("Ime: " + this.naziv + "   ");
        System.out.print("Adresa: " + this.adresa + "   ");
        System.out.println("Pib: " + this.pib + "   ");
        System.out.print("Status: " + this.status + "   ");
        System.out.print("Broj zaposlenih: " + this.brojZaposlenih + "   ");
        System.out.println("Prihodi: " + this.prihodi + "   ");

    }

}
