package Question_1;
import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
// Declaring  the variables.
        boolean error = false;
        boolean error2 = false;
        float sum = 0;
        double d;
        int count = 0;
        while (!error2)
        {
            do
            {
                System.out.println("Enter a Floating Value:");
                try
                {
                    d = input.nextDouble();
                    sum = (float) (sum + d);
                }
                catch (Exception e)

                {
                    String in = input.nextLine();
                    System.out.println(
                            "Input Error. Try again.");
                    count++;
                    break;
                }
            }
            while (!error);
// Checking whether the value of count greater than 2 or not.
            if (count >= 2)
            {
                System.out.println("Sum: " + sum);
                error2 = true;
            }
        }
    }
}
