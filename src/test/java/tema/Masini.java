package tema;

import org.testng.annotations.Test;

import java.security.PublicKey;

public class Masini {
    public String brand;
    public String model;
    public int an;
    public double kilometrii;
    public double pret;
    public String simbol;
    public String tara;
    public boolean esteNoua;
    public String descriere;
    public String caroserie;
    public int catiPropietari;


    @Test
    public void prezentareTema() {
        brand="Toyota";
        model= "RAV4";
        an= 2023;
        kilometrii= 20.000;
        pret=11.0000;
        simbol= "€";
        tara= "Franța";
        esteNoua = true;
        descriere = "Vehicule spațioase, ideale pentru familii și terenuri accidentate.";
        caroserie = "SUV, 5 usi";
        catiPropietari= 2;

        System.out.println("Prezentare masinii este: " +  brand + ' ' + model);
        System.out.println("Anul de fabricatie este: " +  an);
        System.out.println("Kilometraj: " +  kilometrii);
        System.out.println("Pretul masinii este: " +  pret + ' ' + simbol);
        System.out.println("Tara de provenienta: " +  tara);
        System.out.println("Descriere: " +  descriere);
        System.out.println("Caroserie: " +  caroserie);
        System.out.println("Nr Proprietari: " +  catiPropietari);
    }
}
