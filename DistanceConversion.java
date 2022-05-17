/* Programmer : Paul Kumar
   Date       : 15/05/2022
   Topic      : WAP in JAVA to accept distance in kilometer and 
                convert it into meter and centimeter .
   IDE        : VS Code             */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DistanceConversion {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int km;

        System.out.print("Enter the distance in kilometer : ");
        km = Integer.parseInt(in.readLine());

        System.out.println("Distance in meter is " + km * 1000);
        System.out.println("Distance in centimeter is " + km * 1000 * 100);
    }

}
