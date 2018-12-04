package ba.unsa.rpr.tutorijal7;
import java.io.Serializable;

public class Grad implements Serializable{
    private String naziv;
    private int brojStanovnika;
    private double[]  temperature;

    public Grad() {
    }

    public double[] getTemperature() {
        return temperature;
    }

    public void setTemperature(double[] temperature) {
        this.temperature = temperature;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int broj_stanovnika) {
        this.brojStanovnika = broj_stanovnika;
    }
}
