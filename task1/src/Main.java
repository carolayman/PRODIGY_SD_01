import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = 0;
        boolean validTemperature = false;
        while (!validTemperature) {
            System.out.print("Enter Temperature Value: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                validTemperature = true;
            } else {
                System.out.println("Invalid input. Please enter a valid numerical temperature value.");
                scanner.next(); // clear invalid input
            }
        }

        boolean inValidUnit ;
        do {
            System.out.print("Enter The Unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
            char unit = scanner.next().charAt(0);
            switch (unit) {
                case 'C':
                case 'c':
                    System.out.println("Temperature in Fahrenheit is : " + TemperatureConverter.celsiusToFahrenheit(temperature) + "°F");
                    System.out.println("Temperature in Kelvin is : " + TemperatureConverter.celsiusToKelvin(temperature) + "K");
                    inValidUnit = false ;
                    break;
                case 'F':
                case 'f':
                    System.out.println("Temperature in Celsius is : " + TemperatureConverter.fahrenheitToCelsius(temperature) + "°C");
                    System.out.println("Temperature in Kelvin is : " + TemperatureConverter.fahrenheitToKelvin(temperature) + "K");
                    inValidUnit = false ;
                    break;
                case 'K':
                case 'k':
                    System.out.println("Temperature in Fahrenheit is : " + TemperatureConverter.kelvinToFahrenheit(temperature) + "°F");
                    System.out.println("Temperature in Celsius is : " + TemperatureConverter.kelvinToCelsius(temperature) + "°C");
                    inValidUnit = false ;
                    break;
                default:
                    System.out.println("Invalid unit of measurement!");
                    inValidUnit = true ;
            }
        }  while (inValidUnit) ;

        scanner.close();
    }
}