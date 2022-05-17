/* Programmer : Paul Kumar
   Date       : 15/05/2022
   Topic      : WAP in JAVA to calculate the average of three subjects/numbers,
                Entered by the user.
   IDE        : VS Code             */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Average {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a, b, c;
        float avg;

        System.out.print("Enter three numbers : ");
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());
        c = Integer.parseInt(in.readLine());
        avg = (a + b + c) / 3.0f;

        System.out.println("The average is " + avg);
    }
}
