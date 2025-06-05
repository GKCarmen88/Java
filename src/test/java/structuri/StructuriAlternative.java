package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //Exista 2 tipuri de structuri in programare : Aletrantive si Repetitive
    //Structuri Alternative: IF....ELSE,....SWITCH...CASE
    //Un "=" reprezinta atribuirea
    // "==" reprezinta egalul pe care il stim noi
    // procent%
    // impartire/
    @Test
    public void metodaTest (){
        afisamNrMaiMare(10,7);
        afisamNrMaiMare(7,10);
        afisamNrMaiMare(15,15);

        verificamNrDivizibil5(50);
        verificamNrDivizibil5(99);

        afisamZileleSaptamanii(10);

    }

    //Afisam nr. mai mare dintre 2 valori
    public void afisamNrMaiMare (int nr1, int nr2) {

        if (nr1==nr2){
            System.out.println("cele doua numere sunt egale. ");
        } else if (nr1 > nr2){
            System.out.println("Numarul mai mare este: " +nr1);
        }
        else {
            System.out.println("Numarul mai mare este: " +nr2);
        }

    }
     //Verifica ca un numar este divizibil cu 5
    public void verificamNrDivizibil5 (int nr) {
        if (nr % 5 == 0){
            System.out.println("Numarul este divizibil cu 5.");
        }
    }

    //Afisam zilele saptamanii
    public void afisamZileleSaptamanii (int zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            case 5:
                System.out.println("Astazi este Vineri");
                break;
            case 6:
                System.out.println("Astazi este Sambata");
                break;
            case 7:
                System.out.println("Astazi este Duminica");
                break;
            default:
                System.out.println("Nu mai sunt zile.");

        }


    }


}
    

