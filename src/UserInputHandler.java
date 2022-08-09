import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {

    public static int getIntFromUser() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the integer: ");
            return sc.nextInt();

        } catch (InputMismatchException exception) {
            System.out.println("Not an integer");
            return -1;
        }

    }
}
