/*Name: Joshua Dilley
Date:02/07/2025
Source Code:FlabedStrapAngle.java
Action: I've noticed that whenever you strap over a sharp piece of freight, 
so long as the angle of downforce is less than thirty degrees, the strap 
tends to be fine in transit. Any angle sharper than that can cause problems.

 */
package my.codes;

import java.util.Scanner;

public class FlatbedStrapAngle 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        int Angle = 0;
        char SharpEdge;

        System.out.print("Is the strap over a sharp edge? Enter Y for Yes or N for no ");
        SharpEdge = Input.next().charAt(0); //I ought to see the man, Mulcahey
            if (SharpEdge == 89)
            {
                System.out.print("Please enter the approximate angle of the strap--> ");
                Angle = Input.nextInt();
                if(Angle >= 30)
                    System.out.println("Angle is too sharp. Please add protection between the strap and the contact point. ");
                    else
                    System.out.println("Angle is ok. Please drive safe.");
            }    
            else if (SharpEdge !=78)
                System.out.println("Unrecognized input. Please enter Y for yes or N for no. ");
            else
                System.out.println("Cool beans. Please drive safe. ");
    }
}
/* ********************Program Output***************************************
Is the strap over a sharp edge? Enter Y for Yes or N for no Y
Please enter the approximate angle of the strap--> 31
Angle is too sharp. Please add protection between the strap and the contact point.

Is the strap over a sharp edge? Enter Y for Yes or N for no Y
Please enter the approximate angle of the strap--> 29
Angle is ok. Please drive safe.

Is the strap over a sharp edge? Enter Y for Yes or N for no N
Cool beans. Please drive safe. 

Is the strap over a sharp edge? Enter Y for Yes or N for no p
Unrecognized input. Please enter Y for yes or N for no. 
*/