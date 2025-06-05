package tema;

import org.testng.annotations.Test;

public class Tema1 {
    //Afiseaza pe ecran urmatoarele:
    //PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI

    public String titlu;
    public int varsta;
    public String prenume;
    public String nume;
    public String salut;
    public char caracterM;
    public String salut1;
    public char caracterH;


    @Test
    public void metodaTema1() {
        //Verificam titlul de "Hello World"
        titlu = "Hello World";
        System.out.println(titlu + " " + "Poti pleca acasa dupa ce iti verific munca!");
        //Verificam varsta
        varsta = 36;
        System.out.println(varsta + " " + "Poti pleca acasa dupa ce iti verific munca!");
        // Verificam prenuma si nume
        prenume = "Carmen";
        System.out.println(prenume + " " + "Poti pleca acasa dupa ce iti verific munca!");
        nume = "Gerendi-Klimek";
        System.out.println(nume + " " + "Poti pleca acasa dupa ce iti verific munca!");
        //Verificam ca se adauga caracterul 'M' la "Salut"
        salut = "Salut";
        caracterM = 'M';
        System.out.println(salut + caracterM + " " + "Poti pleca acasa dupa ce iti verific munca!");
        //Verificam ca se adauga caracterul 'H' la "Hello"
        salut1 = "Hello";
        caracterH = 'H';
        System.out.println(salut1 + caracterH + " " + "Poti pleca acasa dupa ce iti verific munca!");

    }

    //Adaugam dupa fiecare vocala de la finalul cuvantului apare caracterul "Z"
    public static void main(String[] args) {
        // Apelăm metoda metodaTema1
        Tema1 tema = new Tema1();
        tema.metodaTema1();

        // Text inițial
        String mytext = "Ana are mere,pere,prune ";
        System.out.println("Text inițial: " + mytext + "Poti pleca acasa dupa ce iti verific munca!");

        // Descompunem textul în variabile individuale
        String cuvant1 = "Ana";
        String cuvant2 = "are";
        String cuvant3 = "mere";
        String cuvant4 = "pere";
        String cuvant5 = "prune";


        // Adăugăm 'Z' după fiecare cuvânt dacă se termină cu o vocală
        if (cuvant1.endsWith("a") || cuvant1.endsWith("e") || cuvant1.endsWith("i") || cuvant1.endsWith("o") || cuvant1.endsWith("u")) {
            cuvant1 = cuvant1 + "Z";
        }

        if (cuvant2.endsWith("a") || cuvant2.endsWith("e") || cuvant2.endsWith("i") || cuvant2.endsWith("o") || cuvant2.endsWith("u")) {
            cuvant2 = cuvant2 + "Z";
        }

        if (cuvant3.endsWith("a") || cuvant3.endsWith("e") || cuvant3.endsWith("i") || cuvant3.endsWith("o") || cuvant3.endsWith("u")) {
            cuvant3 = cuvant3 + "Z";
        }

        if (cuvant4.endsWith("a") || cuvant4.endsWith("e") || cuvant4.endsWith("i") || cuvant4.endsWith("o") || cuvant4.endsWith("u")) {
            cuvant4 = cuvant4 + "Z";
        }

        if (cuvant5.endsWith("a") || cuvant5.endsWith("e") || cuvant5.endsWith("i") || cuvant5.endsWith("o") || cuvant5.endsWith("u")) {
            cuvant5 = cuvant5 + "Z";
        }


        // Construiesc textul final
        String rezultat = cuvant1 + " " + cuvant2 + " " + cuvant3 + " " + cuvant4 + " " + cuvant5 + " " + "Poti pleca acasa dupa ce iti verific munca!";
        System.out.println("Text modificat: " + rezultat);


        //Verifcam salariul unui angajat daca acesta are prenumele Andrei;

        String prenumeAngajat = "Andrei";
        int salar = 2300;
        if (prenumeAngajat.equals("Andrei")) {
            System.out.println("Salariul angajatului este afisat daca prenumele este Andrei: " + salar + " " + "Poti pleca acasa dupa ce iti verific munca!");

        }
        //Verificam ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
        String prnumeAngajat = "Popescu";
        int ID = 2639;
        String departament = "IT";
        if (prnumeAngajat.equals("Popescu")) {
            System.out.println("ID angajat este:" + " " + ID + " " + "Departament angajat este: " + " " + departament +  " " + "Poti pleca acasa dupa ce iti verific munca!");
        }

        // Afisati numarul unui departament daca acesta este mai mare de 287;
        int numarDepartament = 300; // Inițializare variabilă
        if (numarDepartament > 287) {
            System.out.println("Numarul departamentului este: " + numarDepartament + " Poti pleca acasa dupa ce iti verific munca!");
        }

        // Exercitiu Bonus
        double rezultatEcuatie = (2 + (3 * 4) - 3) / 3.0;
        System.out.println("Rezultatul ecuatiei este: " + rezultatEcuatie + " Poti pleca acasa dupa ce iti verific munca!");
    }

}

