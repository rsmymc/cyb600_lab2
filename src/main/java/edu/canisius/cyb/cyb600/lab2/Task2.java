package edu.canisius.cyb.cyb600.lab2;

import java.util.Locale;

public class Task2 {

    public String method1(String parameter1){

        if ( parameter1 == null || parameter1.isEmpty())
            return "";

        StringBuilder reversed = new StringBuilder();

        for (int i = parameter1.length() - 1 ; i >=0 ; i--) {
            reversed.append(parameter1.charAt(i));
        }

        return reversed.toString().toUpperCase(Locale.ENGLISH);
    }

    public String method2(String parameter2){
        if ( parameter2 == null || parameter2.isEmpty())
            return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0 ; i < parameter2.length(); i++) {
            result.insert(0, parameter2.charAt(0));
        }

        result.append(parameter2);

        return result.toString();
    }

    public String method3(String parameter3){

        if ( parameter3 == null || parameter3.isEmpty())
            return "";

        StringBuilder reversed = new StringBuilder();

        String [] array = parameter3.split(" ");

        for (int i = array.length - 1 ; i >=0 ; i--) {
            reversed.append(array[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}
