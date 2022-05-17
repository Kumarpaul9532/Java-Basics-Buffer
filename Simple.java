/* Programmer : Paul Kumar
   Date       : 15/05/2022
   Topic      : WAP in JAVA to calculate the Simple Interest.Take necessary  
                Input from the user.
   IDE        : VS Code             */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Simple {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int P, T;
        float R, SI;

        System.out.print("Enter Principal Amount : ");
        P = Integer.parseInt(in.readLine());
        System.out.print("Enter Rate of Interest : ");
        R = Float.parseFloat(in.readLine());
        System.out.print("Enter Time : ");
        T = Integer.parseInt(in.readLine());
        SI = (P * R * T) / 100f;

        System.out.println("Simple Interest = " + SI);
    }
}
