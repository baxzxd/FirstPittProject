/*
 * Name: Adam Mason
 * Date: 2/12/2019
 * Project Description: Prompt user to enter the left and right operands and display the sum of the two.
 */
import java.util.Scanner;
public class Part1
{
    public static void main()
    {
        while( true )
        {
            String stringInput = " ";
            int left_op = -1, right_op = -1, sum;
            Scanner scan = new Scanner( System.in );
            char progEnd = ' ';
            //Get first operand
            System.out.print("Enter a value for the left operand: ");
            left_op = scan.nextInt();
            
            //Get second operand
            System.out.print("Enter a value for the right operand: ");
            right_op = scan.nextInt();
            
            //Add two operands and display sum
            sum = right_op + left_op;
            System.out.println( left_op + " + " + right_op + " = " + sum );
            
            scan.nextLine();
            while( progEnd != 'y' && progEnd != 'n')
            {
                System.out.print("Run again (Y/N): ");
                stringInput = scan.nextLine().toLowerCase();
                if( stringInput.length() == 0 )
                    progEnd = ' ';
                else if ( stringInput.length() > 0 )
                    progEnd = stringInput.charAt(0);
            }
            
            if( stringInput.equals("n"))
                    break;
                    
            System.out.println();
        }
    }
}