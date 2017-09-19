
/**
 * Tommy Hojnicki
 * September 19,2017
 * Triangle Program
 * Will tell the user what kind of triangle they have entered after putting in either the side lengths or the angle measures
 */
import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        //create variables
        String choice;
        char pick;
        Scanner scan= new Scanner(System.in);
        
        //asks the user whether they want angles or sides
        System.out.println("Would you like to enter angles or sides?");
        choice=scan.next();
        pick=choice.charAt(0);
        
        switch(pick){
            case('A'): 
            case('a'):
            {
                //creates angle length variables
                int a1,a2,a3;
                
                //has the user input the angle measures
                System.out.println("Please enter the three angles");
                a1=scan.nextInt();
                a2=scan.nextInt();
                a3=scan.nextInt();
                
                //checks to see if the angles are equal to 180
                if (a1+a2+a3!=180|| a1==0||a2==0||a3==0)
                    System.out.println("This is not a possible triangle");
                //checks to see if there are two angles that are equal to 45 degrees and it will be a right triangle 
                else if(a1==45 && a2==45||a1==45 && a3==45||a2==45 && a3==45)
                    System.out.println("This is a right triangle");
                //checks to see if the angles are equal to each other   
                else if(a1==60 && a2==60 && a3==60)
                    System.out.println("This is an equilateral triangle");
                //Checks to see if there are two angles that are equal to each other
                else if(a1==a2||a1==a3||a2==a3)
                System.out.println("This is an isosceles triangle");
                break;
          }
            case('S'):
            case('s'):
            {
              //creates variables for side lengths
              int s1,s2,s3;
              
              //has the user input side lengths
              System.out.println("Please enter three different side lengths");
              s1=scan.nextInt();
              s2=scan.nextInt();
              s3=scan.nextInt();
              
              //Checks to see if this can actually be a triangle or not
              if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2)
                System.out.println("This a triangle");
              //if the side lengths don't make a triangle
              else
                System.out.println("This is not a triangle");
              
              //check if there are two equal sides and one side that isn't
               if(s1==s2 && s1!=s3||s1==s3 && s3!=s2|| s2==s3 && s2!=s1)
                    System.out.println("This is an isosceles triangle");
              
              //checks if all of the sides are equal
              else if (s1==s2 && s2==s3)
                    System.out.println("This is an equilateral triangle");
              //checks if one side legth squared plus another side length squared is equal to the third length squared
              else if(Math.pow(s1,2)+Math.pow(s2,2)==Math.pow(s3,2)|| Math.pow(s2,2)+Math.pow(s3,2)==Math.pow(s1,2) || Math.pow(s1,2)+Math.pow(s3,2)==Math.pow(s2,2))
                    System.out.println("This is a right triangle");
           
            }
          }
    }
}
