/*Develop a Java program to create a class Student with members usn, name, an array credits and an array marks. Include methods to accept and display details and a method to calculate SGPA of a student.*/
import java.util.Scanner;
class Student{
    String usn;
    String name;
    int [] credits;
    int [] marks;

    Student(String usn , String name, int[] marks,int[] credits){
        this.usn=usn;
        this.name=name;
        this.marks=marks;
        this.credits=credits;
    }
    void acceptDetails(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of Subjects:");
        int sub=s.nextInt();
        s.nextLine();
        marks=new int[sub];
        credits=new int[sub];
        System.out.print("Enter Name:");
        name= s.nextLine();
        System.out.print("Enter USN:");
        usn= s.nextLine();
        for(int i=0;i<credits.length;i++){
            System.out.print("Enter Marks in Subject "+(i+1)+": " );
            this.marks[i]=s.nextInt();
            System.out.print("Enter Credits of Subject "+(i+1)+": ");
            this.credits[i]=s.nextInt();
            System.out.println("----------------------------------------");
        }
    }
    void displayDetails(){
        System.out.println("Student Name : "+name);
        System.out.println("USN : "+usn);
        for(int i=0;i<marks.length;i++){
            System.out.println("Marks in Subject "+(i+1)+": "+marks[i]+" ; Credits : "+credits[i]);
        }
    }
    double calculateSGPA() {
        double totalCredits =0 ,GradePoints =0;

        for (int i = 0; i < credits.length; i++) {
            totalCredits += credits[i];
            GradePoints += calculateGradePoint(marks[i]) * credits[i];
        }

        return GradePoints / totalCredits;
    }
    double calculateGradePoint(int marks) {
        if (marks >= 90) {
            return 10.0;
        } else if (marks >= 80) {
            return 9.0;
        } else if (marks >= 70) {
            return 8.0;
        } else if (marks >= 60) {
            return 7.0;
        } else if (marks >= 50) {
            return 6.0;
        } else {
            return 0.0;
        }
    }
}
class StudentMain{
    public static void main(String args[]){
        Student student = new Student(" "," ",null,null);
        student.acceptDetails();
        student.displayDetails();
        double sg = student.calculateSGPA();
        System.out.println("SGPA : "+sg);
    }
}