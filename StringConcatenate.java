/*Name: Joshua Dilley
Date: 02/08/2026
Source Code: StringConcatente.java
Action: Experimenting with different ways to concatenate two Strings.
 */
package my.codes;

public class StringConcatenate 
{
    public static void main(String[] args) 
    {
        String X;
        String Y;
        String Z;
        
        X = "Hello ";
        Y = "World!";
        Z = X.concat(Y);
        
        System.out.println("Trial 1: " + X.concat(Y));
        System.out.println("Trial 2: " + Z);
        System.out.println("Trial 3: " + X + Y);
        System.out.println("Trial 4: Hello " + "World!");
    }
}
/* **************************Program Output************************************

*/