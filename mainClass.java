import java.util.*;
import CIE.Student;
import CIE.Internals;
import SEE.*;
public class mainClass{
    public static void main(String args[]){
        int fm=0;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number of Students:");
        int n= in.nextInt();
        Internals[] im=new Internals[n];
        External[] em = new External[n];
        Student[] stu=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details for Student"+(i+1)+":");
            System.out.println("--------------------------");
            System.out.print("Enter Name:");
            in.nextLine();
            String name=in.nextLine();
            System.out.print("Enter USN:");
            String usn=in.nextLine();
            System.out.print("Enter Semester:");
            int sem=in.nextInt();
            int[] internalmarks=new int[5];
            int[] externalmarks=new int[5];
            System.out.println();
            System.out.println("Enter Marks Details:");
            System.out.println("--------------------");
            for(int j=0;j<5;j++){
               
                System.out.print("Enter Internal marks for course "+(j+1)+":");
                internalmarks[j]=in.nextInt();
                System.out.print("Enter External marks for course "+(j+1)+":");
                externalmarks[j]=in.nextInt();
                
            }
            System.out.println();
            stu[i]=new Student(usn,name,sem);
            im[i]=new Internals(usn,name,sem,internalmarks);
            em[i]=new External(usn,name,sem,externalmarks);
            

        }
        System.out.println("Final Marks Details:");
        System.out.println("--------------------");
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+":");
            System.out.println("Name:"+stu[i].name);
            System.out.println("USN:"+stu[i].usn);
            System.out.println("Sem:"+stu[i].sem);
            
            for(int j=0;j<5;j++){
                fm+=im[i].m[j]+em[i].sm[j];
                System.out.println("Final Marks Of Course "+(j+1)+":"+fm);
                fm=0;
            }
            System.out.println();
             }
    }
}