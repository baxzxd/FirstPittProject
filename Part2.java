/*
 * Name: Adam Mason
 * Date: 2/12/2019
 * Project Description: Allow the user to enter one operand then and operator then another operand to get a result.
 */
import java.util.Scanner;
public class Part2
{
    public static void main()
    {
        while( true ) 
        {
            Scanner scan = new Scanner( System.in );
            char operator = ' ', progEnd = ' ';
            String stringInput = " ";
            //Get first operand
            System.out.print("Enter a value for the left operand: ");
            int left_op = scan.nextInt();
            scan.nextLine();
            //Get operator ( +, -, *, / )
            System.out.print("Enter an operator: ");
            operator = scan.nextLine().toLowerCase().charAt(0);
            //Get second operand
            System.out.print("Enter a value for the right operand: ");
            int right_op = scan.nextInt();
            
            //Perform operation depending one what operator was entered.
            if( operator == '+' )
            {
                int result = left_op + right_op;
                System.out.println( left_op + " + " + right_op + " = " + result );
            }
            else if( operator == '-' )
            {
                int result = left_op - right_op;
                System.out.println( left_op + " - " + right_op + " = " + result );
            }
            else if( operator == '*' )
            {
                int result = left_op * right_op;
                System.out.println( left_op + " * " + right_op + " = " + result );
            }
            else if( operator == '/' )
            {
                int result = left_op / right_op;
                System.out.println( left_op + " / " + right_op + " = " + result );
            }
        
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