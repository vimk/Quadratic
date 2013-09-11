//eksempel fra bogen side 158

package quadratic;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        int a, b, c; //ax^2 + bx + c 
        double discriminant, root1, root2;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter the coefficient of x squared: ");
        a = scan.nextInt();
        
        System.out.println("Enter the coefficient of x: ");
        b = scan.nextInt();
        
        System.out.println("Enter the constant: ");
        c = scan.nextInt();
        
        //use the quadratic formula to compute the roots.
        //assumes a positive discriminant.
        
        discriminant = Math.pow(b, 2) - (4 * a * c);
        root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
        root2 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
        
        System.out.println("Root #1: " + root1);
        System.out.println("Root #2: " + root2);
    }
}
