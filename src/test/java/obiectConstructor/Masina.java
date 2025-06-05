package obiectConstructor;

public class Masina {
    public String marca;
    public String motorizare;
    public int an;
    public int pret;
    public String model;

    public Masina(String marca, String motorizare, int an, int pret, String model) {
        this.marca = marca;
        this.motorizare = motorizare;
        this.an = an;
        this.pret = pret;
        this.model = model;
    }

    public Masina(String marca, String motorizare, int an, String model) {
        this.marca = marca;
        this.motorizare = motorizare;
        this.an = an;
        this.model = model;

    }

    public void afisareDetalii() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Motorizarea masinii este: " + motorizare);
        System.out.println("Anul masinii este: " + an);
        System.out.println("Modelul masinii este: " + model);

        if (pret != 0) {
            System.out.println("Pretul masinii este: " + pret);
        }
    }
}
