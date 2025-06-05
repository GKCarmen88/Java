package oop;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class OOPTest {
    public OOPTest() {
    }

    @Test
    public void testMethod() {
        RangeRover carmenSprot = new RangeRover("Range Rover", " Sport",
                "Negru", 2023, Arrays.asList("Aer conditionat", "Oglinzi electrice", "Geamuri electrice"));
        carmenSprot.infoMasina();
        carmenSprot.pornesteMasina();
        carmenSprot.promotie();

        System.out.println();

        Audi aliceA4 = new Audi("Audi", "A4", "Negru", 2009, Arrays.asList("Aer conditionat", "ESP", "Stop Out"), Arrays.asList("Scaune Incalzite", "Dezumidificator"));
        aliceA4.infoAudiExterior();
        aliceA4.pornesteMasina();

        System.out.println();

        Audi alexA4 = new Audi("Audi", "A4", "Negru", 2009, 462772, Arrays.asList("Aer conditionat", "ESP", "Stop Out"), Arrays.asList("Scaune Incalzite", "Dezumidificator"));
        alexA4.infoAudiExterior();

        System.out.println();

        RangeRover alexSport = new RangeRover("RangeRover", "Sport", "rosu", 2024,
                23450, Arrays.asList("Aer conditionat", "Oglinzi electrice", "Geamuri electrice"));
        alexSport.infoRangeRover();
        System.out.println(alexSport.getCuloare());
        alexSport.setCuloare("mov");
        alexSport.infoRangeRover();
        System.out.println(alexSport.getCuloare());
        System.out.println(alexSport.getPret());
        alexSport.promotie(5);

        System.out.println();
    }
}
