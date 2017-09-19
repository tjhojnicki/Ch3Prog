
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
        String choice;
        char pick;
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Would you like to enter angles or sides?");
        choice=scan.next();
        pick=choice.charAt(0);
        
        switch(pick){
            case('A'): 
            case('a'):
            {
                int a1,a2,a3;
                
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
               int s1,s2,s3;
               
               System.out.println("Please enter three different side lengths");
              s1=scan.nextInt();
              s2=scan.nextInt();
              s3=scan.nextInt();
              
              if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2)
                System.out.println("This a triangle");
              else
                System.out.println("This is not a triangle");
              
               if(s1==s2 && s1!=s3||s1==s3 && s3!=s2|| s2==s3 && s2!=s1)
                    System.out.println("This is an isosceles triangle");
              
              else if (s1==s2 && s2==s3)
                    System.out.println("This is an equilateral triangle");
              else if(Math.pow(s1,2)+Math.pow(s2,2)==Math.pow(s3,2)|| Math.pow(s2,2)+Math.pow(s3,2)==Math.pow(s1,2) || Math.pow(s1,2)+Math.pow(s3,2)==Math.pow(s2,2))
                    System.out.println("This is a right triangle");
           
            }
          }
    }
}
