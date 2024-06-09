/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CustomArrayList<T> extends ArrayList<T> {

    public static abstract class Callback {

        public abstract void onComplete();

        public void onError() {
            System.out.println("Error");
        }
    }

    public CustomArrayList<T> addItem(T t) {
        super.add(t);
        return this;
    }

    public CustomArrayList<T> addItems(T... t) {
        super.addAll(Arrays.asList(t));
        return this;
    }

    public CustomArrayList<T> addItem(T t, Callback c) {
        boolean isCompleted = super.add(t);
        if (isCompleted) {
            c.onComplete();
        } else {
            c.onError();
        }
        return this;
    }

    public CustomArrayList<T> addAllItems(Collection<? extends T> c) {
        super.addAll(c);
        return this;
    }


}
