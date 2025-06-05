package practiceOOP;

public class Tenis extends Sportiv{

    private int pozitieClasament;
    private int trofee;


    public Tenis(String nume, String prenume, int varsta, String sport, int pozitieClasament, int trofee) {
        super(nume, prenume, varsta, sport);
        this.pozitieClasament = pozitieClasament;
        this.trofee = trofee;
    }

    @Override
    public void infoSportiv() {
        super.infoSportiv();
        System.out.println("Pozitia sportivuil in clasament este: " + pozitieClasament);
        System.out.println("Trofeele sportivului castigate sunt: " + trofee);

    }
}
