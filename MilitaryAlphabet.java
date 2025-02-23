/*Name: Joshua Dilley   
Date: 02/22/25  
Source Code: MilitaryAlphabet.java
Action: Input a letter. Return its corresponding military alphabet designation.
 */
package my.codes;

import java.util.Scanner;

public class MilitaryAlphabet 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        char Letter;        
        
        System.out.print("\nPlease enter a letter--> ");
        Letter = Input.next().charAt(0);
        
        switch (Letter)
        {
            case'a':System.out.print("Alpha\n");break;
            case'A':System.out.print("Alpha\n");break;
            
            case'b':System.out.print("Bravo\n");break;
            case'B':System.out.print("Bravo\n");break;
            
            case'c':System.out.print("Charlie\n");break;
            case'C':System.out.print("Charlie\n");break;
            
            case'd':System.out.print("Delta\n");break;
            case'D':System.out.print("Delta\n");break;
            
            case'e':System.out.print("Echo\n");break;
            case'E':System.out.print("Echo\n");break;
            
            case'f':System.out.print("Foxtrot\n");break;
            case'F':System.out.print("Foxtrot\n");break;
            
            case'g':System.out.print("Golf\n");break;
            case'G':System.out.print("Golf\n");break;
            
            case'h':System.out.print("Hotel\n");break;
            case'H':System.out.print("Hotel\n");break;
            
            case'i':System.out.print("India\n");break;
            case'I':System.out.print("India");break;
            
            case'j':System.out.print("Juliet\n");break;
            case'J':System.out.print("Juliet\n");break;
            
            case'k':System.out.print("Kilo\n");break;
            case'K':System.out.print("Kilo\n");break;
            
            case'l':System.out.print("Lima\n");break;
            case'L':System.out.print("Lima\n");break;
            
            case'm':System.out.print("Mike\n");break;
            case'M':System.out.print("Mike\n");break;
            
            case'n':System.out.print("November\n");break;
            case'N':System.out.print("November\n");break;
            
            case'o':System.out.print("Oscar\n");break;
            case'O':System.out.print("Oscar\n");break;
            
            case'p':System.out.print("Papa\n");break;
            case'P':System.out.print("Papa\n");break;
            
            case'q':System.out.print("Quebec\n");break;
            case'Q':System.out.print("Quebec\n");break;
            
            case'r':System.out.print("Romeo\n");break;
            case'R':System.out.print("Romeo\n");break;
            
            case's':System.out.print("Sierra\n");break;
            case'S':System.out.print("Sierra\n");break;
            
            case't':System.out.print("Tango\n");break;
            case'T':System.out.print("Tango\n");break;
            
            case'u':System.out.print("Uniform\n");break;
            case'U':System.out.print("Uniform\n");break;
            
            case'v':System.out.print("Victor\n");break;
            case'V':System.out.print("Victor\n");break;
            
            case'w':System.out.print("Whiskey\n");break;
            case'W':System.out.print("Whiskey\n");break;
            
            case'x':System.out.print("X-ray\n");break;
            case'X':System.out.print("X-ray\n");break;
            
            case'y':System.out.print("Yankee\n");break;
            case'Y':System.out.print("Yankee\n");break;
            
            case'z':System.out.print("Zulu\n");break;
            case'Z':System.out.print("Zulu\n");break;
        }
        
    }
                
}

/* *********************Program Output*****************************************
Please enter a letter--> a
Alpha

Please enter a letter--> A
Alpha


*/
    

