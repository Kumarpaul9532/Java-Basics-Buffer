/* Programmer : Paul Kumar
   Date       : 15/05/2022
   Topic      : WAP in JAVA to find the sum of two numbers Entered by the user.  
                Display the output.
   IDE        : VS Code             */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a, b, sum;

        System.out.print("Enter two numbers : ");
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());
        sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
