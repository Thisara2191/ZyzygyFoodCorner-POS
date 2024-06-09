/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models.database;

import app.models.CustomArrayList;
import app.models.food.Food;
import app.models.food.Ingredient;
import app.models.food.Toppings;
import java.util.ArrayList;

/**
 *
 * @author Titu
 */
public class Database {

    public static class PredefinedData {

        private static final String[] FOOD_CATEGORIES;
        private static final ArrayList<Food> FOOD_LIST;
        private static final ArrayList<Toppings> TOPPING_LIST;

        static {
            FOOD_CATEGORIES = new String[]{"SPECIAL OFFERS", "BURGERS", "TACOS", "RICES", "SALADS", "NACHOS", "BEVERAGES"};
            FOOD_LIST = new ArrayList<>();
            TOPPING_LIST = new ArrayList<>();

            FOOD_LIST.add(Food.getInstance("BEEF BURGER",
                    new CustomArrayList<Ingredient>().addItems(
                            Ingredient.getInstance("BREAD", 200),
                            Ingredient.getInstance("COOKING OIL", 100),
                            Ingredient.getInstance("RAW BEEF", 400),
                            Ingredient.getInstance("MAYO", 20),
                            Ingredient.getInstance("OTHER SEASONINGS", 50)
                    )));

            FOOD_LIST.add(Food.getInstance("CHICKEN BURGER",
                    new CustomArrayList<Ingredient>().addItems(
                            Ingredient.getInstance("BREAD", 200),
                            Ingredient.getInstance("COOKING OIL", 100),
                            Ingredient.getInstance("RAW CHICKEN", 300),
                            Ingredient.getInstance("MAYO", 20),
                            Ingredient.getInstance("OTHER SEASONINGS", 50)
                    )));

            FOOD_LIST.add(Food.getInstance("FISH BURGER",
                    new CustomArrayList<Ingredient>().addItems(
                            Ingredient.getInstance("BREAD", 200),
                            Ingredient.getInstance("COOKING OIL", 100),
                            Ingredient.getInstance("RAW FISH", 200),
                            Ingredient.getInstance("MAYO", 20),
                            Ingredient.getInstance("OTHER SEASONINGS", 50)
                    )));

            FOOD_LIST.add(Food.getInstance("CHEESE BURGER",
                    new CustomArrayList<Ingredient>().addItems(
                            Ingredient.getInstance("BREAD", 200),
                            Ingredient.getInstance("COOKING OIL", 100),
                            Ingredient.getInstance("RAW CHEESE", 200),
                            Ingredient.getInstance("MAYO", 20),
                            Ingredient.getInstance("OTHER SEASONINGS", 50)
                    )));

            FOOD_LIST.add(Food.getInstance("VEGGIE BURGER",
                    new CustomArrayList<Ingredient>().addItems(
                            Ingredient.getInstance("BREAD", 200),
                            Ingredient.getInstance("COOKING OIL", 100),
                            Ingredient.getInstance("MAYO", 20),
                            Ingredient.getInstance("OTHER SEASONINGS", 50)
                    )));

            TOPPING_LIST.add(Toppings.getInstance("BBQ SAUCE", new CustomArrayList<Ingredient>().addItems(Ingredient.getInstance("SUGAR", 10), Ingredient.getInstance("WATER", 5), Ingredient.getInstance("KETCHUP", 30))));
            TOPPING_LIST.add(Toppings.getInstance("TOMATO SAUCE", new CustomArrayList<Ingredient>().addItems(Ingredient.getInstance("NEEDS FOR TOMATO SAUCE", 10))));
            TOPPING_LIST.add(Toppings.getInstance("GARLIC SAUCE", new CustomArrayList<Ingredient>().addItems(Ingredient.getInstance("NEEDS FOR GARLIC SAUCE", 20))));
            TOPPING_LIST.add(Toppings.getInstance("PICKLES", new CustomArrayList<Ingredient>().addItems(Ingredient.getInstance("NEEDS FOR PICKELS", 20))));
            TOPPING_LIST.add(Toppings.getInstance("HOT SAUCE", new CustomArrayList<Ingredient>().addItems(Ingredient.getInstance("NEEDS FOR HOT SAUCE", 10))));
            TOPPING_LIST.add(Toppings.getInstance("CHICKEN PATTY", new CustomArrayList<Ingredient>().addItems(Ingredient.getInstance("RAW CHIKEN", 100), Ingredient.getInstance("COOKING OIL", 100), Ingredient.getInstance("OTHER SEASONINGS", 10))));
            TOPPING_LIST.add(Toppings.getInstance("BEFF PATTY",  new CustomArrayList<Ingredient>().addItems(Ingredient.getInstance("RAW BEEF", 100), Ingredient.getInstance("COOKING OIL", 100), Ingredient.getInstance("OTHER SEASONINGS", 10))));
            TOPPING_LIST.add(Toppings.getInstance("PEPPERONI", new CustomArrayList<Ingredient>().addItems(Ingredient.getInstance("NEEDS FOR PEPPERONI", 20))));
            TOPPING_LIST.add(Toppings.getInstance("MAYO", new CustomArrayList<Ingredient>().addItems(Ingredient.getInstance("NEEDS FOR MAYO SAUCE", 20))));
            TOPPING_LIST.add(Toppings.getInstance("EXTRA CHEESE", new CustomArrayList<Ingredient>().addItems(Ingredient.getInstance("RAW CHEESE", 100))));

        }

        public static ArrayList<Food> getFoodList() {
            return FOOD_LIST;
        }

        public static ArrayList<Toppings> getToppingsList() {
            return TOPPING_LIST;
        }

        public static String[] getFoodCategories() {
            return FOOD_CATEGORIES;
        }

    }

}
