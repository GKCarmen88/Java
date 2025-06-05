package tema;

import org.testng.annotations.Test;

public class Tema2 {
    //Afisam in consola urmatoarele cerinte

    @Test
    public void metodaTema2(){
        afisamDa();
        afisamPrime3();
        afisamNumarMaiMare(15,20);
        afiseazaNumarulMaiMic(4.5, 3.25);
        afisamNumerePareSiImpare();
        afisamNumerelePare();

        afisamNrDivizibil5(100);
        afisamPrime3NumereDivizibil5(15);
        afisamSumaNumerelor();
        afisamSumaNrPanaLa10();
        produsulNumerelorPanaLa5();



        }

    //Verificam ca apare in consola de 5x DA
    public void afisamDa(){
        for (int i = 0; i < 5; i++) {
            System.out.print("DA" + " ");
        }
        System.out.println();
    }
            // Verificam in consola primele  3 numere de la 1 la 3;
       public void afisamPrime3(){
           for (int i = 1; i <= 3; i = i + 1){
               System.out.println(i);
           }
       }

       //Verificam numarul cel mai mare dintre 15 si 20;
    public void afisamNumarMaiMare(int nr1, int nr2) {
        int maxim = (nr1 > nr2) ? nr1 : nr2;
        System.out.println("Numarul cel mai mare este: " + maxim);

    }
//Verificam in consola numarul cel mai mic dintre 4.5 si 3.25;
    public void afiseazaNumarulMaiMic(double nr1, double nr2){
        double min = (nr1<nr2) ? nr1 : nr2;
        System.out.println("Numarul cel mai mic este: " + min);
    }

    //Afisam numerele pare si numerele impare pana la 10;
    public void afisamNumerePareSiImpare(){
        for (int i = 0; i<=10; i++)
            System.out.println(i);
    }
//Afisam  numerele pare pana la 10;
    public void afisamNumerelePare(){
        for(int i = 0; i<= 10; i = i + 2)
            System.out.println(i);
    }
//Afisam numerele divizibile cu 5;
    public void afisamNrDivizibil5(int limita) {
        for (int i = 1; i <= limita; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " este divizibil cu 5.");
            }

        }
    }
//Afisam primele 3 numere divizibile cu 5;
    public void afisamPrime3NumereDivizibil5(int limita){
        for (int i = 1; i<=limita; i++) {
        if (i % 5 == 0){
            System.out.println(i + " este divizibil cu 5.");
        }

        }
    }

// Afisam suma a doua numere 235 si 10;
    public void afisamSumaNumerelor(){
        int num1 = 235;
        int num2 = 10;
        int suma = num1 + num2;
        System.out.println(suma);
    }
//suma numerelor pana la 10
    public void afisamSumaNrPanaLa10(){
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println(suma);

    }

    //Afisam produsul numerelor pana la 5;
    public void produsulNumerelorPanaLa5(){
        int produs = 1;
        for (int i = 1; i<=5; i++){
            produs *=i;
        }
        System.out.println(produs);
    }

}


