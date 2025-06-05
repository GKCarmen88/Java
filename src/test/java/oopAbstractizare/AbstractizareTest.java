package oopAbstractizare;

import org.testng.annotations.Test;

public class AbstractizareTest {

    @Test
    public void metodaTest(){
        ElevPersoana Obiect1 = new ElevPersoana("Marin","Alexandru", 16,
                "CNLR", 10);
        Obiect1.infoElev();
        System.out.println();

        AngajatPersoana Obiect2 = new AngajatPersoana("Gerendi", "Carmen", 36,
                "SFAW", "10 ani", 1442);
        Obiect2.infoAngajat();
        System.out.println();

        ElevAngajat Obiect3 = new ElevAngajat("Sabau", "Alexandru", 19, "CNLR", 12,
                "Dell", "1 an", 1623);
        Obiect3.infoPersoana();
        System.out.println();
    }
}
