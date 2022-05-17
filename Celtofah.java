/* Programmer : Paul Kumar
   Date       : 15/05/2022
   Topic      : WAP in Java to accept temperature in Celsius
                and convert it into Fahrenheit.
   IDE        : VS Code             */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Celtofah {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        float fah, cel;

        System.out.printf("Enter temperature in Celsius : ");
        cel = Float.parseFloat(in.readLine());
        fah = (cel * 1.8f) + 32;

        System.out.println("Temperature in Fahrenheit is " + fah);
    }
}
