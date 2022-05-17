/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to Swap the two numbers using third variable take  
                Input from the user.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swap {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;

        System.out.print("Enter two number : ");
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());

        System.out.println("\nNumbers before swapping");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        c = a;
        a = b;
        b = c;

        System.out.println("\nNumbers after swapping");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
