package app.models.food;

import java.util.ArrayList;
import java.util.HashMap;

public class Toppings implements FoodParent {

    private final int id;
    private final String name;
    private double price;
    private final ArrayList<Ingredient> ingredientList;

    private static final HashMap<String, Toppings> TOPPINGS_POOL = new HashMap();

    public static Toppings getInstance(String name, ArrayList<Ingredient> ingredientList) {
        Toppings toppingInstance = TOPPINGS_POOL.get(name);

        if (toppingInstance == null) {
            toppingInstance = new Toppings(name, ingredientList);
            TOPPINGS_POOL.put(name, toppingInstance);
        }
        return toppingInstance;
    }

    private Toppings(String name, ArrayList<Ingredient> ingredientList) {
        this.id = TOPPINGS_POOL.size() + 1;
        this.name = name;
        this.ingredientList = ingredientList;
        for (Ingredient ingredient : ingredientList) {
            this.price = this.price + ingredient.getPrice();
        }
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public ArrayList<Ingredient> getIngredientList() {
        return ingredientList;
    }

}
