package app.models.food;

import java.util.ArrayList;
import java.util.HashMap;

interface Prototype<T> {

    T getClone();
}

public class Food implements FoodParent, Prototype<Food> {

    private final int id;
    private String name;
    private double price;
    private final ArrayList<Ingredient> ingredientList;

    private static final HashMap<String, Food> FOODS_POOL = new HashMap();

    public static Food getInstance(String name, ArrayList<Ingredient> ingredientList) {
        Food toppingInstance = FOODS_POOL.get(name);

        if (toppingInstance == null) {
            toppingInstance = new Food(name, ingredientList);
            FOODS_POOL.put(name, toppingInstance);
        }
        return toppingInstance;
    }

    public Food(String name, ArrayList<Ingredient> ingredientList) {
        this.id = FOODS_POOL.size() + 1;
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
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public ArrayList<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Food getClone() {
        return new Food(getName(), getIngredientList());
    }

}
