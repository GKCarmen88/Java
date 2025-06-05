package constant;

import org.testng.annotations.Test;

public class ConstantConcept {

    //Constanta = conceptul prin care definim o proprietate care nu isi mai modifica valoarea initiala. eg credentiale

    public final String nume = "Gerendi";

    @Test
    public void testMethod() {
        System.out.println(nume);

        //nume = "Martina";
        System.out.println(nume);

    }
}