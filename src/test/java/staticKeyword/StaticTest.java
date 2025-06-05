package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {
    @Test
    public void metodaTest(){

        Elev Alice = new Elev("George", "Luciana", 34);
        Alice.infoElev();
        System.out.println();

        Elev Cristi = new Elev("Cristi","Genis", 23);
        Cristi.infoElev();
        System.out.println();

        System.out.println(Elev.getScoala());
    }

}
