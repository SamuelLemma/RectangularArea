package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class CalculateRectangularArea {
    double l, w, area;

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The program help you to calculate rectangular area");
        System.out.println("Enter the value of the length L:");
        l = Double.parseDouble(br.readLine());
        System.out.println("Enter the value of the width w:");
        w = Double.parseDouble(br.readLine());
    }

    void computeField() {
        area = l * w;
    }

    void fieldDisplay() {
        System.out.print("The area of the rectangle with a length l=");
        System.out.printf("%2.2f", l);
        System.out.print("and width w =");
        System.out.printf("%2.2f", w);
        System.out.print(" is =");
        System.out.printf("%2.2f.\n", area);
    }
}
    public class Rectangledemo{
    public static void main(String[] args) throws IOException {
    CalculateRectangularArea cra = new CalculateRectangularArea();
    cra.getData();
    cra.computeField();
    cra.fieldDisplay();
    }
}
