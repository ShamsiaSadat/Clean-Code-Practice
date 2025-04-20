package chapter_12_Emergence.goodExample;

import java.util.Scanner;

public class TemperatureApp {
    public static void main(String[] args) {
        double c = readCelsius();
        TemperatureConverter conv = new TemperatureConverter();
        printResults(c, conv);
    }

    private static double readCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Celsius temperature: ");
        return scanner.nextDouble();
    }

    private static void printResults(double c, TemperatureConverter conv) {
        System.out.printf("Fahrenheit: %.2f%n", conv.celsiusToFahrenheit(c));
        System.out.printf("Kelvin:     %.2f%n", conv.celsiusToKelvin(c));
    }
}
