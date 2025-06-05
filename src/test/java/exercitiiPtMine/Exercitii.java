package exercitiiPtMine;

import org.testng.annotations.Test;

public class Exercitii {

    @Test
    public void exercitiu() {
        variabile();
        calcul();
        testIf();
        testPatru();

    }
        //Incepem testul cu variabile
        public void variabile() {
            int anul = 1988;
            String nume = "Carmen";
            double numar = 23.8;
            boolean codezi = true;

            // Afișează valorile variabilelor
            System.out.println("Anul nasterii este: " + anul);
            System.out.println("Numele este: " + nume);
            System.out.println("Numarul este: " + numar);
            System.out.println("Iti place sa codezi? " + codezi);

            // Verificăm cu assert
            assert codezi : "Ar fi trebuit să fie true!";
        }
        public void calcul(){
        int a = 43;
        int b = 76;
        int sum = a + b;
            System.out.println("Totalul este :" + sum);
        }

        public void testIf(){
        int varsta = 36;
        if (varsta >= 18){
            System.out.println("Esti major");
        }else {
            System.out.println("Esti minor");

        }
        assert varsta >= 18 : "Persoana ar fi trebuit să fie majoră!";
        }

        // test 4:for si while
    public void testPatru(){
        int suma = 0;
        for (int i = 1; i <= 5; i++){
            suma += i;
            System.out.println("Pasul " + i + ", suma: " + suma);
        }
    }






}
