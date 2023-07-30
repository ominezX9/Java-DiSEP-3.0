import java.util.Scanner;

public class Menu {
    // Setup Universal input listener
    static Scanner keyboard = new Scanner(System.in);
    public static char Pick(){
        // Menu Design
        System.out.println("TempreApp");
        System.out.println("[A] Convert temperature from Celsius to Fahrenheit");
        System.out.println("[B] Convert temperature from Fahrenheit to Celsius");
        System.out.println("[C] Quit");

        char selOption = keyboard.next().charAt(0);
        return selOption;
    }
    public static void MenuMgr(char option){
        switch (option){
            case 'A':
                Menu.ConvertToFahrenheit();
                break;
            case 'B':
                Menu.ConvertToCelsius();
                break;
            case 'C':
                System.exit(0);
                break;
            default:
        }
    }

    public static void ConvertToFahrenheit(){
        System.out.println("Enter Celsius Value to convert to Fahrenheit: ");
        double F = 0;
        double C = keyboard.nextDouble();
        if(C < 0){
            System.out.println("No Negative Value Allowed");
        }else {
            // Do the Conversion.
            F= ((9 * C) / 5) + 32;
            System.out.println(C + " Celsius is " + F + " Fahrenheit.");

        }


    }
    public static void ConvertToCelsius(){
        System.out.println("Enter Fahrenheit Value to convert to Celsius: ");
        double F = keyboard.nextDouble();
        double C = 0;
        if(F < 0){
            System.out.println("No Negative Value Allowed");
        }else {
            C = (5 * (F - 32)) / 9;
            System.out.println(F + " Fahrenheit is " + C + " Celsius.");

        }

    }

}
