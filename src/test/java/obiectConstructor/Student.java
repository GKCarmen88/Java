package obiectConstructor;

import org.checkerframework.checker.units.qual.N;
import org.testng.annotations.Test;

public class Student {
    //clasa ii un sablon iar din sablon creez obiectele
    //Constructor = are ca rol sa initializese variabilele unei clase
    //intr-o clasa recunoastem un constructor ca fiind o metoda oblica care are exact acelasi nume cu clasa
    //Pentru moment, un constructor este public (poate sa fie si privat - singletone)
    //Intr-o clasa putem avea mai multi constructori diferentiati prin nr sau tipul de parametrii
    //Exista 2 tipuri de constructori: Default (este in fiecare clasa fara sa definim noi ) si cu parametrii
    //Daca avem un parametru un Constructor care are acelasi nume cu o variabila din clasa => le initializam folosind This
    //Obiecte = instanta unei clase
    //Dintr-o clasa putem definii o multime de obiecte
    //aceste obiecte se diferentiaza prin numele lor
    //In momentul cand se initializeaza un obiect se apeleaza constructorul din clasa acestuia
    //Un obiect se initializeaza prin folosirea lui "new"
    //In momentul cand se creaza un obiect se aloca un spatiu dedicat pe memorie care are structura clasei

    public String nume;
    public String prenume;
    public int varsta;
    public String facultate;
    public int an;

    //Student de mai jos este constructorul
    public Student(String nume, String prenume, int varsta, String facultate, int an) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.facultate = facultate;
        this.an = an;

    }

    public Student(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void prezentareStudent(){
        System.out.println("Numele studentului este: " + nume);
        System.out.println("Prenumele studentului este: " + prenume);
        System.out.println("Varsta studentului este: " + varsta);


        if (varsta > 35){
            System.out.println("Studentul nu se mai poate inscrie la facultate ");
        } else if (facultate != null) {
            System.out.println("Facultatea studentului este: " + facultate);
            System.out.println("Anul in care este Studentul este: " + an);

        }



    }

}
