package chapter12.emergence.bad.example;

import java.util.Scanner;

public class BadConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Celsius temperature: ");
        double celsius = scanner.nextDouble();

        // conversion logic mixed with I/O
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin     = celsius + 273.15;

        // magic numbers, no way to reuse logic elsewhere
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}
