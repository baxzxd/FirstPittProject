/*
 * Name: Adam Mason
 * Date: 2/12/2019
 * Project Description: Allow the user to enter one operand then and operator then another operand to get a result with 
 *                      input validation. This program will loop until -1 is entered for the first operand
 */
import java.util.Scanner;
public class Part4
{
    public static void main()
    {
        Scanner scan = new Scanner( System.in );
        int statementCount = -1;
        while( true )
        {
            //Add 1 to statement value each run of the program
            statementCount++;
            String stringInput = "";
            char operator = ' ';
            int left_op = -4, right_op = -1, result = 0;
            //Allow user to input left operand until is is greater than zero and less than 1000000.
            while( left_op < 0 || left_op >= 1000000 )
            {
                System.out.print("(Statement " + statementCount + ") " + "Enter a value for the left operand (or -1 to exit): ");
                left_op = scan.nextInt();
                //If left_op = -1 break out of while so program can end.
                if( left_op == -1 )
                {
                    break;
                }
                if( left_op < 0 || left_op >= 1000000 )
                {
                    System.out.print("Out of range.\nOperands must be between 0 and 999,999: ");
                    left_op = scan.nextInt();
                }
            }
            
            //Exit Program if left_op = -1
            if( left_op == -1 )
                break;
            
            scan.nextLine();
            
            //Input validation for the 4 operator characters
            while( operator != '-' && operator != '+' && operator != '/' && operator != '*' )
            {
                System.out.print("(Statement " + statementCount + ") " + "Enter an operator: ");
                stringInput = scan.nextLine().toLowerCase();
                if( stringInput.length() == 0 )
                    operator = ' ';
                else if ( stringInput.length() > 0 )
                    operator = stringInput.charAt(0);
                    
                if( operator != '-' && operator != '+' && operator != '/' && operator != '*' )
                {
                    System.out.print("Invalid operation!\nOperation must be +, -, *, or /: ");
                }
            }
            //Allow user to input right operand until is is greater than zero and less than 1000000.
            while( right_op < 0 || right_op >= 1000000 )
            {
                System.out.print("(Statement " + statementCount + ") " + "Enter a value for the right operand: ");
                right_op = scan.nextInt();
                if( right_op < 0 || right_op >= 1000000 )
                {
                    System.out.print("Out of range.\nOperands must be between 0 and 999,999: ");
                    right_op = scan.nextInt();
                }
            }
            //Check for operator and perform operation
            switch( operator )
            {
                case '+':
                    result = left_op + right_op;
                break;
                case '-':
                    result = left_op - right_op;
                break;
                case '*':
                    result = left_op * right_op;
                break;
                case '/':
                    result = left_op / right_op;
                break;
            }
            //Display output equation with left_op, the operator, and right_op.
            System.out.println( "(Statement " + statementCount + ") " +  left_op + " " + operator + " " + right_op + " = " + result +"\n" );
        }
    }
}
//end-of-file