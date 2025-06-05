package oopAbstractizare;

public class ElevPersoana extends Persoana implements Elev {

    private String scoala;
    private  int clasa;


    public ElevPersoana(String nume, String prenume, int vartsa, String scoala, int clasa) {
        super(nume, prenume, vartsa);
        this.scoala = scoala;
        this.clasa = clasa;

    }
    public void infoElev(){
        infoPersoana();
        System.out.println("Scoala la care merge elevului este " + scoala);
        System.out.println("Clasa din care face parte elevul este " + clasa);
    }

    public String getScoala() {
        return scoala;
    }

    public void setScoala(String scoala) {
        this.scoala = scoala;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    @Override
    public void mergeLaScoala() {
        System.out.println("Elevul merge la scola.");

    }

    @Override
    public void isiFaceTemele() {
        System.out.println("Elevul isi face temele.");

    }

    @Override
    public void meregInPauze() {
        System.out.println("Elevul merge in pauza.");

    }
}
