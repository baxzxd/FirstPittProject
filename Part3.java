/*
 * Name: Adam Mason
 * Date: 2/12/2019
 * Project Description: Allow the user to enter one operand then and operator then another operand to get a result with 
 *                      input validation.
 */
import java.util.Scanner;
public class Part3
{
    public static void main()
    {
        Scanner scan = new Scanner( System.in );
        String stringInput = "";
        char operator = ' ';
        int left_op = -1, right_op = -1, result = 0;
        
        //Allow user to input left operand until is is greater than zero and less than 1000000.
        while( left_op < 0 || left_op >= 1000000 )
        {
            System.out.print("Enter a value for the left operand (or -1 to exit): ");
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
        scan.nextLine();
        
        //Allow user to input an operator until it is valid.
        System.out.print("Enter an operator: ");
        while( operator != '-' && operator != '+' && operator != '/' && operator != '*' )
        {
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
        while( operator != '-' && operator != '+' && operator != '/' && operator != '*' )
        {
            System.out.print("Enter an operator: ");
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
        
        //Perform selected operation.
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
            System.out.println( left_op + " " + operator + " " + right_op + " = " + result +"\n" );
        
    }
}
