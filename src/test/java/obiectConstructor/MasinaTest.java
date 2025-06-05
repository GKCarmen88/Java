package obiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {

    @Test
    public void testMethod() {
        Masina Toyota = new Masina("Toyota", "1600", 2024, 40000, "Corola");
        Toyota.afisareDetalii();
        System.out.println();

        Masina Dacia = new Masina("Dacia", "1200", 2008, "Duster");
        Dacia.afisareDetalii();
        System.out.println();


    }
}