import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {

        System.out.println("Enter the numerator: ");
        double numerator = s.nextDouble();
        s.nextLine();
        System.out.println("Enter the denominator: ");
        double denominator = s.nextDouble();
        s.nextLine();

        double result;

            result = numerator/denominator;
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            System.out.println("Not a number");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            s.close();
            System.out.println("End of application");
        }
    }

}
