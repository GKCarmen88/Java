package valueReferance;

import org.testng.annotations.Test;

public class ValueReferenceTest {

    //Variabilele pot fi primitive si non primitive
    //primitive un tip de data predefinit care poate doar sa primeascs o valoare specifica
    //exemple primitive: int, double, float, char, boolean, byte
    //ex nonprimitive: String, ori ce instantiere care se face cu "new"
    //Wrapper class este o noua implementare care este construita pe implementarea veche
    //exemple wrapper class: Integer, Doubel, Float, Character, Boolean

    public Integer varsta = 29;
    public String nume = "Klimek";
    public StringBuilder prenume = new StringBuilder("Carmen");

    @Test
    public void testMethod(){

        System.out.println("valoare initiala este: " + varsta);
        calcul(varsta);
        System.out.println("valoare initiala este: " + varsta);

        System.out.println();

        System.out.println("valoare initiala este: " + nume);
        concatenare(nume);
        System.out.println("valoare initiala este: " + nume);


        System.out.println();

        System.out.println("valoare initiala este: " + prenume);
        concatenare(prenume);
        System.out.println("valoare initiala este: " + prenume);

        double a = 12.34;
        System.out.println(Integer.valueOf((int)a));

    }


    public void calcul(Integer value){
        value = value + 5;
        System.out.println("valoare noua este " + value);
    }

    public void concatenare(String value) {
        value = value + " Savu";
        System.out.println("valoare noua este " + value);
    }

    public void concatenare(StringBuilder value) {
       value.append("Dorha");
        System.out.println("valoare noua este " + value);
    }

}

