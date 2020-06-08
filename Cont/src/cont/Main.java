package cont;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Cont cont = new Cont(2, 200);

        Date date = cont.getDateCreated();
        System.out.println(date);

        cont.setAnualInterestRate(10);
        cont.interest();
        System.out.println(cont.interest());
        cont.calculateSoldAfterInterest();

        System.out.println(cont.getSold());

        cont.depundere(50);
        System.out.println(cont.getSold());

        cont.retragere(100);
        System.out.println(cont.getSold());

        System.out.printf("%.2f", cont.lunarInterestRate());
        System.out.print(" %");
    }
}
