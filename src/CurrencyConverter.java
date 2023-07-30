import java.util.Scanner;

public class CurrencyConverter {
    // Setup input point // Set as global to save time
    static Scanner keyboard = new Scanner(System.in);
    static double convertedCurrencyUpper;
    static double convertedCurrencyLower;
    public static void execute(){


    }
    public static double TakeMoney(){
        // Declare capital
        double capital;
        // Print Message
        System.out.println("Good day Dear Customer, Lets Convert your Naira for you.");
        capital  = keyboard.nextDouble();
        // output the capital
        return capital;
    }

    public static double ConvertTo(){
        System.out.println("Please Select currency you want to convert to:");
        System.out.println("1. British Pound [GBP] 999.2 \n" +
                            "2. European Euros [EUR] 852.5\n" +
                            "3. American Dollar [USD] 772.437\n" +
                            "4. Austrialian Dollar [AUD] 513.593\n");

        // set rate after option has been selected
        double convertRate = 0;
        // rateOption
        int rateOption = keyboard.nextInt();
        switch(rateOption){
            case 1:
                System.out.println("GBP");
                convertRate = 992;
                break;
            case 2:
                System.out.println("EUR");
                convertRate = 852.5;
                break;
            case 3:
                System.out.println("USD");
                convertRate = 772.437;
                break;
            case 4:
                System.out.println("AUD");
                convertRate = 513.593;
                break;
            default:
                System.out.println("You didn't select any currency");
        }

        return convertRate;
    }

    public static void runConversion(double capital, double convertRate){
        convertedCurrencyLower = capital / convertRate;
        convertedCurrencyUpper = capital * convertRate;
    }
    public static void displayConversion(){
        System.out.println("NGN - CURRENCY");
        System.out.println("Worth of Naira to the above currency is: " + convertedCurrencyLower);
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("CURRENCY - NGN");
        System.out.println("Worth of Currency to Naira is: " + convertedCurrencyUpper);
    }
}
