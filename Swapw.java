/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to Swap the two numbers without using third variable take  
                Input from the user.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swapw {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        float a, b;

        System.out.print("Enter two number : ");
        a = Float.parseFloat(in.readLine());
        b = Float.parseFloat(in.readLine());

        System.out.println("\nNumbers before swapping");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nNumbers after swapping");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
