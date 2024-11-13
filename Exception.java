import java.util.*;
public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            
            System.out.println("Enter second number: ");
            int b = sc.nextInt();

            int c = a/b;
            System.out.println("The result of the division is: " + c);
        
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!"+e);
        }
    
        
        }}