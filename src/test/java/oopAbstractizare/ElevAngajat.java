package oopAbstractizare;

public class ElevAngajat extends Persoana implements Elev,Angajat{

    private String scoala;
    private  int clasa;
    private String firma;
    private  String experienta;
    private  int salar;

    public ElevAngajat(String nume, String prenume, int vartsa, String scoala,
                       int clasa, String firma, String experienta, int salar) {
        super(nume, prenume, vartsa);
        this.scoala = scoala;
        this.clasa = clasa;
        this.firma = firma;
        this.experienta = experienta;
        this.salar = salar;
    }

    public void infoElevAngajat() {
        infoPersoana();
        System.out.println("Scoala la care merge elevul este:" + scoala);
        System.out.println("Scoala la care merge elevul este:" + clasa);
        System.out.println("Scoala la care merge elevul este:" + firma);
        System.out.println("Scoala la care merge elevul este:" + experienta);
        System.out.println("Scoala la care merge elevul este:" + salar);
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

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    @Override
    public void mergeLaLucru() {

    }

    @Override
    public void primesteSalar() {

    }

    @Override
    public void pauzaDeMasa() {

    }

    @Override
    public void areConcediu() {

    }

    @Override
    public void mergeLaScoala() {

    }

    @Override
    public void isiFaceTemele() {

    }

    @Override
    public void meregInPauze() {

    }
}
