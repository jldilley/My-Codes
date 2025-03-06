/*Name: Joshua Dilley
Date: 03/05/2025
Source Code: TruthTable.java
Action: A truth table that displays results for conjunction and disjuntion of two statements.
*/

package my.codes;

import java.util.Scanner;

public class TruthTable 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        char P, Q, Choice; // ! serves as a negation in Java
        
        
        System.out.print("Is P true or false? T for true, F for false--> ");
        P = Input.next().charAt(0);
        System.out.print("Is Q true or false? T for true, F for false--> ");
        Q = Input.next().charAt(0);
        System.out.println(" ");
        
        System.out.print("P and Q: Conjunction |  ");System.out.println("P or Q: Disjunction");
        System.out.println("-----------------------------------");
        
        do
        {    
            if (P == 'T' && Q == 'T')
                {System.out.print("T and T: True         |  ");System.out.println("T or T: True ");
                 System.out.println(" ");}
            else if(P == 'T' && Q == 'F')
                {System.out.print("T and F: False        |  ");System.out.println("T or F: True ");
                 System.out.println("");}
            else if(P == 'F' && Q == 'T')
                {System.out.print("F and T: False        |  ");System.out.println("F or T: True ");
                 System.out.println(" ");}
            else
            {System.out.print("F and F: False        |  ");System.out.println("F or F: False ");
                System.out.println(" ");}
            
            System.out.print("Would you like to test another statement? N to leave program. Any other key to continue --> ");
            Choice = Input.next().charAt(0);
            System.out.println(" ");
            
            if(!(Choice == 'N' || Choice == 'n'))
            {        
                System.out.print("Is P true or false? T for true, F for false--> ");
                P = Input.next().charAt(0);
                System.out.print("Is Q true or false? T for true, F for false--> ");
                Q = Input.next().charAt(0);
                System.out.println(" ");
                System.out.print("P and Q: Conjunction |  ");System.out.println("P or Q: Disjunction");
                System.out.println("-----------------------------------");
            }    
            
                
        }while (!(Choice == 'N' || Choice == 'n'));
    }
}
/* *******************************Program Output*******************************
Is P true or false? T for true, F for false--> T
Is Q true or false? T for true, F for false--> T
 
P and Q: Conjunction |  P or Q: Disjunction
-----------------------------------
T and T: True         |  T or T: True 
 
Would you like to test another statement? N to leave program. Any other key to continue --> y
 
Is P true or false? T for true, F for false--> T
Is Q true or false? T for true, F for false--> F
 
P and Q: Conjunction |  P or Q: Disjunction
-----------------------------------
T and F: False        |  T or F: True 

Would you like to test another statement? N to leave program. Any other key to continue --> y
 
Is P true or false? T for true, F for false--> F
Is Q true or false? T for true, F for false--> T
 
P and Q: Conjunction |  P or Q: Disjunction
-----------------------------------
F and T: False        |  F or T: True 
 
Would you like to test another statement? N to leave program. Any other key to continue --> y
 
Is P true or false? T for true, F for false--> F
Is Q true or false? T for true, F for false--> F
 
P and Q: Conjunction |  P or Q: Disjunction
-----------------------------------
F and F: False        |  F or F: False 
 
Would you like to test another statement? N to leave program. Any other key to continue --> n
*/
