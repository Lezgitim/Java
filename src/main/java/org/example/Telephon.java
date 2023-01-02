package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Telephon {

    private static HashMap<String, ArrayList<Integer>> number = new HashMap<>();


    public void add (String name, Integer numbermet) {
        if (number.containsKey(name)) {
            number.get(name).add(numbermet);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(numbermet);
            number.put(name, values);
        }

    }

            public ArrayList<Integer> find (String name){
                if (number.containsKey(name)) {
                    return number.get(name);
                }
                return new ArrayList<Integer>();
            }
            public static HashMap<String, ArrayList<Integer>> getNumber () {
                return number;
            }

        }
