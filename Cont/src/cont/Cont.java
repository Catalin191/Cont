package cont;

import java.util.Calendar;
import java.util.Date;

public class Cont {

    private int id = 0;
    private int sold = 0;
    private double anualInterestRate = 0;
    private Date dateCreated = Calendar.getInstance().getTime();

    public Cont(int id, int sold){
        this.id = id;
        this.sold = sold;
    }
    public Cont(){
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public int getId() {
        return id;
    }

    public int getSold() {
        return sold;
    }

    public double getAnualInterestRate() {
        return anualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double interest(){
        double interestAmount = sold * (anualInterestRate / 100);

        return interestAmount;
    }

    public double lunarInterestRate(){
        double lunarInterestRate = anualInterestRate / 12;

        return lunarInterestRate;
    }

    public int calculateSoldAfterInterest(){
        sold += interest();

        return sold;
    }

    public int retragere(int retragere){
        sold -= retragere;

        return sold;
    }

    public int depundere( int depunere){
        sold += depunere;

        return sold;
    }
}
