package oopAbstractizare;

public class CasnicPersoana extends Persoana implements Casnic{

    public CasnicPersoana(String nume, String prenume, int vartsa) {
        super(nume, prenume, vartsa);
    }

    @Override
    public void faceCurat() {

    }

    @Override
    public void mergeLaCumparaturi() {

    }
}
