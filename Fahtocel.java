/* Programmer : Paul Kumar
   Date       : 15/05/2022
   Topic      : WAP in Java to accept temperature in Fahrenheit
                and convert it into Celsuis.
   IDE        : VS Code             */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fahtocel {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        float fah, cel;

        System.out.printf("Enter temperature in Fahrenheit ");
        fah = Float.parseFloat(in.readLine());
        cel = (fah - 32) / 1.8f;

        System.out.println("Temperature in Celsius is " + cel);
    }

}
