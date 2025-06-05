package practiceOOP;

public class Sportiv {
    // definim mai departe proprietatiile unui sportiv pe care le customizam in functie de

    private String nume;
    private String prenume;
    private int varsta;
    private String sport;


    public Sportiv(String nume, String prenume, int varsta, String sport) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sport = sport;

    }
    public void infoSportiv(){
        System.out.println("Sportivul are Numele si Pronumele " + nume + " " + prenume);
        System.out.println("Sportivul are varsata de " + varsta);
        System.out.println("Sportivul are sportul de " + sport);

        //System.out.println("Sportivul face parte din echipa de " + echipa);
        //System.out.println("Sportivul are rolul in echipa de " + rolulDinEchipa);
    }
}
