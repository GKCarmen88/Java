package oopAbstractizare;

public class Persoana {

    //Abstractizare = conceptul prin care putem definii, coportamentul unei clase
    //Abstractizarea se poate face in 2 feluri:folosind INTERFETE sau CLASE ABSTRACTE
    // interfata contine doar metode abstarcte(metode care nu au body{})
    //Recunoastem o interfata pe baza cuvantului INTERFACE
    //Toate metodele din interfata sunt publice
    //O interfata nu poate sa contina un constructor => nu putem face un obiect
    //O interfata se implementeaza
    //O clasa poate sa implementeze o interfata => trebuie sa implementeze toate metodele din interfata
    //o clasa poate implementa mai multe interfete
    //o interfata poate extinde o alta interfata
    //o clasa abstracta poate implementa o interfata insa interfata nu poate extinde o clasa abstracta



    private String nume;
    private  String prenume;
    private int vartsa;

    public Persoana(String nume, String prenume, int vartsa) {
        this.nume = nume;
        this.prenume = prenume;
        this.vartsa = vartsa;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este " + nume);
        System.out.println("Prenumele persoanei este " + prenume);
        System.out.println("Varsta persoanei este " + vartsa);
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

    public int getVartsa() {
        return vartsa;
    }

    public void setVartsa(int vartsa) {
        this.vartsa = vartsa;
    }
}
