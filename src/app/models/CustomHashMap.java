/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models;

import java.util.HashMap;

public class CustomHashMap<K, V> extends HashMap<K, V> {

    interface Callback {

        void OnComplete();

    }

    public CustomHashMap<K, V> putItem(K key, V value, Callback c) {
        super.put(key, value);
        c.OnComplete();
        return this;
    }

}
