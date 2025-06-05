package abstarctizareRestaurant;

public class RestaurantVegan extends Restaurant implements Vegan{



    public RestaurantVegan(String nume, String adresa, String brand) {
        super(nume, adresa, brand);
    }

    @Override
    public void ingredienteVegane() {
        System.out.println("Toate ingredientele sunt Vegane.");

    }

    @Override
    public void chelneri() {
        System.out.println("Toti chelnerii au experienta pentru restaurantele vegane.");

    }

    @Override
    public void bucatarVegan() {
        System.out.println("Toti bucatarii au experienta pentru bucataria vegana.");

    }
}
