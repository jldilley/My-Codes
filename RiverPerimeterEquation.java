/*Name:Joshua Dilley    
Date: 02/07/2025    
Source Code: RiverPerimeterProblem.java
Action: I wrote this program based on a recurring problem in my last two 
algebra classes. It uses the formula for the relative maximum of a vertex of
a parabola in order to calculate length and width of a fenced in area. The 
formula calculates in order to maximize area and assumes that one side is 
bordered by something like a river or a wall.

****************************Algortihm************************************

    
 */
package my.codes;

import java.util.Scanner;

public class RiverPerimeterEquation 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        double LengthY = 0.0, WidthX = 0.0, Perimeter = 0.0, MaxArea = 0.0;
    
        System.out.print("Please enter the perimeter--> ");
        Perimeter = Input.nextDouble();
   
        LengthY = Perimeter - (Perimeter/2.0);
        WidthX = Perimeter/4.0;
        MaxArea = LengthY*WidthX;
        
        if (Perimeter>=0)
            System.out.printf("\nThe perimeter of your fenced in area is " + Perimeter + "\nThe maximum area of your fenced in land is " + MaxArea + "\nThe length of you fencing is " + LengthY + "\nThe width of your fencing is " + WidthX +" \n");
        else
            System.out.println("Input not recognized.");
    }   
}        
/* ************************Program Output************************************
Please enter the perimeter--> 100

The perimeter of your fenced in area is 100.0
The maximum area of your fenced in land is 1250.0
The length of you fencing is 50.0
The width of your fencing is 25.0 

Please enter the perimeter--> 0

The perimeter of your fenced in area is 0.0
The maximum area of your fenced in land is 0.0
The length of you fencing is 0.0
The width of your fencing is 0.0 

The perimeter of your fenced in area is 1.0
The maximum area of your fenced in land is 0.125
The length of you fencing is 0.5
The width of your fencing is 0.25 

Please enter the perimeter--> 253

The perimeter of your fenced in area is 253.0
The maximum area of your fenced in land is 8001.125
The length of you fencing is 126.5
The width of your fencing is 63.25 
*/




            
            
            
            
            
            
                
     
        

