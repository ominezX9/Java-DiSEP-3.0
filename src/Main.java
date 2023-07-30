import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        boolean input = true;

        while(input == true) {
            double capital = CurrencyConverter.TakeMoney();
            double coRate = CurrencyConverter.ConvertTo();
            CurrencyConverter.runConversion(capital, coRate);
            CurrencyConverter.displayConversion();
            System.out.print("Welcome, Do you want to perform an exchange? (y/n)");
            char key = keys.next().charAt(0);
            if(key == 'y'){
                input = true;

            }else{
                input = false;
            }
        }



    }
}