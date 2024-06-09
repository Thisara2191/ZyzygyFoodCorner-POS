package app.models.food;

import java.util.HashMap;

public class Ingredient implements FoodParent {

    private final int id;
    private final String name;
    private final double price;

    private static final HashMap<String, Ingredient> INGREDIENT_POOL = new HashMap();

    public static Ingredient getInstance(String name, double price) {
        Ingredient ingredientInstance = INGREDIENT_POOL.get(name);

        if (ingredientInstance == null) {
            ingredientInstance = new Ingredient(name, price);
            INGREDIENT_POOL.put(name, ingredientInstance);
        }
        return ingredientInstance;
    }

    private Ingredient(String name, double price) {
        this.id = INGREDIENT_POOL.size() + 1;
        this.name = name;
        this.price = price;
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

}
