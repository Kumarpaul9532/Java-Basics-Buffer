/* Programmer : Paul Kumar
   Date       : 15/05/2022
   Topic      : WAP in JAVA to accept radius of circle from the user
                and calculate the Area of circle .
   IDE        : VS Code             */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Area {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        float r, area;

        System.out.print("Enter radius of circle : ");
        r = Float.parseFloat(in.readLine());
        area = 3.14f * r * r;

        System.out.println("Area of circle is " + area);

    }

}