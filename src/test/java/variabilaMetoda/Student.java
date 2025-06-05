package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //clasa= sablon pe baza careia putem defini un exemplu din viata reala
    //Intrun fisier java recunoastem o clasa dupa cuvantul "class"
    // este obligatoriu pt o clasa sa aiba un nume
    //intr-un fisier java putem avea mai multe clase diferentiate prin numele acestora
    //nu este un best practice in java sa avem mai multe clase intr-un fisier
    //o clasa contine variabile(proprietate) si metode(actiuniile pe care face clasa)
    //variabila= proprietatea unei clase (nume prenume varsta)
    //o variabila poate sau nu sa aibe o valoare
    //o variabila isi poate modifica valoarea
    //valoare unei variabile se stabileste in functie de data
    //exista 2 tipuri de valori: globala(ex: nume) si locala(ex:CNP)
    //o variabila globala se defineste specificand nivelul de vizibilitate(access control)
    //o valiabila globala este vizzibila peste tot in aceasta clasa
    //o valiabila locala se defineste specificand tipul de data si nume
    //o variabila locala este vizibila doar in locul definit
    //metoda=actiunea specifica unei clase
    //intr-o clasa putem avea mai multe metode
    //exista 2 tipuri de metode: void(vizibil) si return(nepublic)
    //recunoastem o metoda dupa access control, tipul metodei, nume, (),{}
    //Select all= Command + A
    // Pt formatare: Command + option + L

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char gen;
    public boolean areRestante;

    @Test
    public void prezentareStudent() {
        nume = "Gerendi-Klimek";
        prenume = "Carmen";
        varsta = 36;
        adresa = "Bistrita, str. C.R.vivu, nr. 10";
        inaltime = 1.60;
        greutate = 56f;
        gen = 'F';
        areRestante = false;

        System.out.println("Prezentare Studentului este: " + nume + ' ' + prenume + ' ' + varsta);
        System.out.println("Adresa Studentului este: " + adresa);
        System.out.println("Inaltimea Studentului este:" + inaltime);
        System.out.println("Greutatea Studentului este: " + greutate);
        System.out.println("Genul Stdentului este: " + gen);
        System.out.println("Are Studentul restante? " + areRestante);

        calculMedie(6,7);
        calculMedie(9,7);
        calculMedie3(5,9,8);
    }

    //Facem o metoda cu variabile locale
    public void calculMedie(double nota1, double nota2) {
        double medie = (nota1 + nota2) / 2;

        System.out.println("Media Studentului este: " + medie);


    }
public void calculMedie3 (double nota1, double nota2, double nota3){
        double medie = (nota1 + nota2 + nota3) / 3;
    System.out.println("Media Studentului este: " + medie);
}

}
