package abstarctizareRestaurant;

public class RestaurantMixt extends Restaurant implements Vegan,NonVegan{


    public RestaurantMixt(String nume, String adresa, String brand) {
        super(nume, adresa, brand);
    }

    @Override
    public void ingredienteNonVegan() {
        System.out.println("Toate ingredientele sunt din restaurantele nonvegane. ");

    }

    @Override
    public void tipCarne() {
        System.out.println("Avem o gama variata de tipuri de Carne.");

    }

    @Override
    public void tipPeste() {
        System.out.println("Avem o gama variata de tipuri de peste.");

    }

    @Override
    public void ingredienteVegane() {
        System.out.println("Toate ingredientele sunt din restaurantele vegane.");

    }

    @Override
    public void chelneri() {
        System.out.println("Chelnarii au experienta de servire in domeniul vegan cat si nonvegan.");

    }

    @Override
    public void bucatarVegan() {
        System.out.println("Bucatarii au experienta in gatirea vegana cat si nonvegana.");

    }
}
