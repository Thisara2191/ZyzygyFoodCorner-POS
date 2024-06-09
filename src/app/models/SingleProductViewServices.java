package app.models;

import app.gui.panels.components.qtyCard;
import app.gui.panels.odrernew.singleProductView;
import app.models.food.Food;
import app.models.food.Toppings;
import java.util.ArrayList;

/**
 *
 * @author Titu
 */
public class SingleProductViewServices {

    private final singleProductView parent;
    private final ArrayList<Toppings> toppingList;

    public SingleProductViewServices(singleProductView parent) {
        this.parent = parent;
        this.toppingList = parent.getToppingList();
    }

    public String getPriceAsString(double price, String prefix) {
        return prefix + String.format("%.2f", price);
    }

    public void updateAndDisplayTotalPrice() {
        updateTotalQtyDisplay();
        double toppingsTotal = calculateAndDisplayToppingsTotal(toppingList);
        double grandTotal = calculateAndDisplayGrandTotal(parent.getQtyCard(), parent.getFood());
    }

    private double calculateAndDisplayToppingsTotal(ArrayList<Toppings> list) {
        parent.spvToppingsTotal.setText("0.00");
        double toppingsTotal = 0;
        if (!list.isEmpty()) {
            for (Toppings toppings : list) {
                toppingsTotal += toppings.getPrice();
            }
            System.out.println("All Toppings Price : " + toppingsTotal);
            parent.spvToppingsTotal.setText(getPriceAsString(toppingsTotal, ""));
        }
        return toppingsTotal;
    }

    private double calculateAndDisplayGrandTotal(qtyCard card, Food food) {
        int selectedQty = card.getSelectedQty();
        double grandTotal = food.getPrice() * selectedQty;
        System.out.println("Grand Total: " + grandTotal);
        System.out.println(" ------------------------------------------- ");
        parent.spvGrandTotal.setText(getPriceAsString(grandTotal, "LKR "));
        return grandTotal;
    }

    private void updateTotalQtyDisplay() {
        parent.spvTotalQty.setText(String.valueOf(parent.getQtyCard().getSelectedQty()));
    }

    public ArrayList<Toppings> addToppingTotheList(Toppings topping) {
        toppingList.add(topping);
        return toppingList;
    }

    public ArrayList<Toppings> gettoppingList() {
        return toppingList;
    }

    

}
