package practiceOOP;

import org.testng.annotations.Test;

public class PracticeOOP {

    @Test
    public void metodaTest(){
        Tenis SimonaHalep = new Tenis("Halep","Simona", 36, "Tenis", 1, 500);
        SimonaHalep.infoSportiv();

        System.out.println();

        Fotbalist Dragusin = new Fotbalist("Dragusin", "Alex", 32, "Fotbal", "Romania", "Aparator");
        Dragusin.infoSportiv();

    }
}
