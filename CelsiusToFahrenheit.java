/*Name: Joshua Dilley
Date: 01/31/2025
Source Code: CelsiusToFahrenheit.java
Action: In class, Professor Hollway gave an example program to convert Fahrenheit to Celsius. I just wanted to see if I could code a 
program that would convert Celsius to Fahrenheit. 
 */
package my.codes;

import java.util.Scanner;

public class CelsiusToFahrenheit 
{
    public static void main(String[] args) 
    {
        float Celsius, Fahrenheit;
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Please enter the temperature in Celsius --> ");
        Celsius = Input.nextFloat();
        
        Fahrenheit = ((float)(9.0/5.0 * Celsius) + 32);
        System.out.println("The temperature in Fahrenheit is --> " + Fahrenheit);
        
        
        
    }  
}
/* ******************Program Output********************
Please enter the temperature in Celsius --> 100
The temperature in Fahrenheit is --> 212.0

Please enter the temperature in Celsius --> 356
The temperature in Fahrenheit is --> 672.8

Please enter the temperature in Celsius --> -6
The temperature in Fahrenheit is --> 21.2

*/