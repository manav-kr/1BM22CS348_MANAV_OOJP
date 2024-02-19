/*Develop a Java program that prints all real solutions to the quadratic equation ax^2 +bx+c = 0. Read in a, b, c and use the quadratic formula. If the discriminant b^2 -4ac is negative, display a message stating that there are no real solutions. */
import java.util.Scanner;
class Quadratic{
    public static void main(String args[]){
        int a,b,c,D;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A :");
        a=sc.nextInt();
        System.out.println("Enter the value of B :");
        b=sc.nextInt();
        System.out.println("Enter the value of C :");
        c=sc.nextInt();
        D=(b*b)-(4*a*c);
        if(D>0){
            System.out.println("Roots are real and distinct.");
            double r1=(-b + Math.sqrt(D))/(2*a);
            double r2=(-b - Math.sqrt(D))/(2*a);
            System.out.println("R1 = "+r1);
            System.out.println("R2 = "+r2);
        }
        else if(D==0){
            System.out.println("Roots are real and equal.");
            double r=(-b)/(2*a);
            System.out.println("R1 = "+r);
            System.out.println("R2 = "+r);
        }
        else{
            System.out.println("Roots are imaginary and distinct");
            double x = (double)-b/(2*a);
            double y = Math.sqrt(-D)/(2*a);
            System.out.println("R1 = "+x+" + "+y+"i");
            System.out.println("R2 = "+x+" - "+y+"i");
        }

    }
}