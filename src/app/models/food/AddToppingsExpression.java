/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models.food;

public class AddToppingsExpression implements Expression {

    private final Toppings topping;

    public AddToppingsExpression(Toppings toppings) {
        this.topping = toppings;
    }

    @Override
    public Food interpret(Food food) {

        food.setName(food.getName()+" WITH "+topping.getName());
        food.setPrice(food.getPrice() + topping.getPrice());
        return food;
    }
}
