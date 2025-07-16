/*Name: Joshua Dilley
Date: 07/15/2025
Source Code: QuadraticFormula.java
Action: Input coefficients of a quadratic equation and calculate the values of X using the 
quadratic equation. Returns "no REAL answers" if the solutions are complex.

 */
package absolutejava;

import java.util.*;

public class QuadraticFormula 
{
    public static final int DISCRIMINANT_CONSTANT = 4;
    public static final int DENOMINATOR = 2;
    
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        
        char Choice;
        double CoefficientA, CoefficientB, CoefficientC;
        double SecondPartOfDiscriminant; 
        double PositiveDiscriminantFormula, NegativeDiscriminantFormula;
        double Discriminant, SquaredCoefficientB;
        double SquareRootOfDiscriminant, NegativeCoefficientB;
        
        do
        {
            System.out.print("Please enter the value of coefficient a: ");
            CoefficientA = Input.nextDouble();
            
            System.out.print("Please enter the value of coefficient b: ");
            CoefficientB = Input.nextDouble();
            
            System.out.print("Please enter the value of coefficient C: ");
            CoefficientC = Input.nextDouble();
            
            NegativeCoefficientB = -1 * CoefficientB;
            SquaredCoefficientB = CoefficientB * CoefficientB;
            SecondPartOfDiscriminant =  DISCRIMINANT_CONSTANT * CoefficientA * CoefficientC;
            Discriminant = SquaredCoefficientB - SecondPartOfDiscriminant;
            SquareRootOfDiscriminant = Math.sqrt(Discriminant);
            PositiveDiscriminantFormula = (NegativeCoefficientB + SquareRootOfDiscriminant)/(DENOMINATOR * CoefficientA);
            NegativeDiscriminantFormula = (NegativeCoefficientB - SquareRootOfDiscriminant)/(DENOMINATOR * CoefficientA);
            
            if (Discriminant < 0)
            {
                System.out.println(" ");
                System.out.println("No REAL answers.");
                System.out.println(" ");
            }    
            
            else
            {
                System.out.println(" ");
                System.out.println("The values of X are" );
                System.out.printf("%.2f %n", PositiveDiscriminantFormula);
                System.out.println("and ");
                System.out.printf("%.2f %n", NegativeDiscriminantFormula);
                System.out.println(" ");
            }    
            
            System.out.print("Would you like to calculate another value? N for no. Any other key to continue: ");
            Choice = Input.next().charAt(0);
            
            
        }   while (!(Choice == 'N' ||  Choice == 'n'));
    }
    
}

/*****************************Program Output**********************************
Please enter the value of coefficient a: 1
Please enter the value of coefficient b: 3
Please enter the value of coefficient C: 1
 
The values of X are
-0.38 
and 
-2.62 
 
Would you like to calculate another value? N for no. Any other key to continue: y
Please enter the value of coefficient a: 2
Please enter the value of coefficient b: 3
Please enter the value of coefficient C: -1
 
The values of X are
0.28 
and 
-1.78 
 
Would you like to calculate another value? N for no. Any other key to continue: n

Please enter the value of coefficient a: 2
Please enter the value of coefficient b: 1
Please enter the value of coefficient C: 5
 
No REAL answers.
 
Would you like to calculate another value? N for no. Any other key to continue: n
 
*/
