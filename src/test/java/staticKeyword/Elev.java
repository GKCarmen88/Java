package staticKeyword;

public class Elev {
    //Static modalitate prin care setam o valoare pe care sa o accesam in toate instantele clasei
    //un alt scop este de accesa o resursa fara sa fie nevoie sa definim un obiect
    //se pastreaza valoarea propiretatii pentru toate obiectele

    private String nume;
    private String prenume;
    private int varsta;
    private static String scoala = "Poli";

    public Elev(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoElev(){
        System.out.println("Numele si prenumele elevului sunt:" + nume  +' '+ prenume);
        System.out.println("Varsta elevului este:" + varsta);
        System.out.println("Scoala elevului este:" + scoala);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public static String getScoala() {
        return scoala;
    }

}
