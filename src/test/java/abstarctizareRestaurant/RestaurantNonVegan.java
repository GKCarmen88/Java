package abstarctizareRestaurant;

public class RestaurantNonVegan extends Restaurant implements NonVegan{


    public RestaurantNonVegan(String nume, String adresa, String brand) {
        super(nume, adresa, brand);
    }

    @Override
    public void ingredienteNonVegan() {
        System.out.println("Toate ingredientele sunt pt bucataria nonvegana.");
    }

    @Override
    public void tipCarne() {
        System.out.println("Avem o gama variata de tipuri de carne. ");

    }

    @Override
    public void tipPeste() {
        System.out.println("Avem o gama variata de tipuri de peste. ");

    }
}
