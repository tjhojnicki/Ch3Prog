
/**
 * Tommy Hojnicki
 * September 19,2017
 * Planet program
 * use a switch to determine the users weight on different planets
 */
import java.util.Scanner;

public class Planet
{
    public static void main(String[] args)
    {
        //creates variables
        char choice;
        String planet;
        double weight,newweight;
        Scanner scan= new Scanner(System.in);
        
        //gets the users weight
        System.out.println("What is your weight on earth?");
        weight=scan.nextDouble();
        
        //asks the user to enter their choice of which planet their weight will be calculated on
        System.out.println("Please enter what planet you would like to know your weight on?");
        System.out.println("\nM-Moon\nC-Mercury\nV-Venus\nX-Mars\nJ-Jupiter\nS-Saturn\nU-Uranus\nN-Neptune\nP-Pluto");
        planet=scan.next();
        choice=planet.charAt(0);
        
        switch(choice){
            case('M'):
            case('m'):
                //calculates the new weight by multipluing the earth weight by the planets gravity divided by the earths gravity
                newweight=weight*(1.622/9.8);
                System.out.printf("\nYour weight on the Moon would be %.3f\n pounds",newweight);
                break;
            
            case('C'):
            case('c'):
                newweight=weight*(3.7/9.8);
                System.out.printf("\nYour weight on the Mercury would be %.3f\n pounds",newweight);
                break;
                
            case('V'):
            case('v'):
                newweight=weight*(8.87/9.8);
                System.out.printf("\nYour weight on the Venus would be %.3f\n pounds",newweight);
                break;
                
            case('X'):
            case('x'):
                newweight=weight*(3.711/9.8);
                System.out.printf("\nYour weight on the Saturn would be %.3f\n",newweight);
                break;
                
            case('J'):
            case('j'):
                newweight=weight*(24.79/9.8);
                System.out.printf("\nYour weight on the Saturn would be %.3f\n pounds",newweight);
                break;
                
            case('S'):
            case('s'):
                newweight=weight*(10.44/9.8);
                System.out.printf("\nYour weight on the Saturn would be %.3f\n pounds",newweight);
                break;
         
            case('U'):
            case('u'):
                newweight=weight*(8.69/9.8);
                System.out.printf("\nYour weight on the Uranus would be %.3f\n pounds",newweight);
                break;
            
            case('N'):
            case('n'):
                newweight=weight*(11.15/9.8);
                System.out.printf("\nYour weight on the Neptune would be %.3f\n pounds",newweight);
                break;
            
            case('P'):
            case('p'):
                newweight=weight*(.62/9.8);
                System.out.printf("\nYour weight on the Pluto would be %.3f\n pounds",newweight);
                break;
            
           
        
    }
}
}
