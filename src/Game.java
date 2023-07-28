import java.util.Scanner;

public class Game {
    public static void execute(){
        char level;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****Welcome 3.0 GAMING SOFTWARE ***");
        System.out.println("****Welcome A: Beginner Level ***");
        System.out.println("****Welcome B: Intermediate  ***");
        System.out.println("****Welcome C: Advance Level ***");
        System.out.println("Enter level");

        level = keyboard.next().charAt(0);
        switch(level)
        {
            case 'A':
                System.out.println("Hello Beginner Guy");
                break;
            case 'B':
                System.out.println("Intermediate Level");
                break;
            case 'C':
                System.out.println("Hard, Hold your Rocks Cause we are gonna take them");
                break;
            default:
                System.out.println("Mehn, no input");
        }

    }
}
