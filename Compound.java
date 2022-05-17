/* Programmer : Paul Kumar
Date          : 15/05/2022
Topic         : WAP in JAVA to calculate the Compound Interest.Take necessary  
                Input from the user.
IDE           : VS Code             */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Compound {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int P, T;
        double R, CI;

        System.out.print("Enter Principal Amount : ");
        P = Integer.parseInt(in.readLine());
        System.out.print("Enter Rate of Interest : ");
        R = Double.parseDouble(in.readLine());
        System.out.print("Enter Time in years : ");
        T = Integer.parseInt(in.readLine());
        CI = P * Math.pow(1 + (R / 100), T) - P;

        System.out.println("Compound Interest = " + CI);
    }
}
