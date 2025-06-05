package oopAbstractizareClasaAbstracta;

public abstract class Persoana {

    // o clasa abstracta se recunoaste dupa cuvantul ABSTRACT
    //o clasa abstracta poate sau nu sa contina metode ABSTRACTE
    //o clasa abstracta se mosteneste
    //Clasa care mosteneste o clasa abrtacta trebuie sa implemnteze
    // O metoda abstracta trebuie sa contina cuvantul abstract
    //metodele abstracte pot fi publice/protected
    //O clasa abstracta poate sa implementeze o interfata
    //O clasa abstracta poate sa contina un constructor => nu putem face un obiect dintr-o clasa abstracta

    private String nume;
    private  String prenume;
    private int vartsa;

    public Persoana(String nume, String prenume, int vartsa) {
        this.nume = nume;
        this.prenume = prenume;
        this.vartsa = vartsa;
    }

    public abstract void mergeLaLucru();

    public abstract void primesteSalar();

    public abstract void pauzaDeMasa();

    public abstract void areConcediu();

    public abstract void faceCurat();

    public abstract  void mergeLaCumparaturi();

    public abstract void mergeLaScoala();

    public abstract void isiFaceTemele();

    public abstract void meregInPauze();

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






