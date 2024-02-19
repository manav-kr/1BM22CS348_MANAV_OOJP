/*Write a program that demonstrates handling of exceptions in inheritance tree. 
Create a base class called “Father” and derived class called “Son” which extends 
the base class. In Father class, implement a constructor which takes the age and 
throws the exception WrongAge( ) when the input age<0. In Son class, implement 
a constructor that cases both father and son’s age and throws an exception if son’s 
age is >=father’s age */
import java.util.*;
class WrongAgeException extends Exception{
    WrongAgeException(String msg){
        System.out.println(msg);
    }
}
class Father{
    int age;
    Father(int age) throws WrongAgeException {
        this.age=age;
        if(age<0){
            throw new WrongAgeException("Age Can't be less than zero!");
        }
        else{
            System.out.println(" Father's Age Verified!!");
        }
    }
}
class Son extends Father{
    int sonage;
    Son(int age,int sonage)throws WrongAgeException{
        super(age);
        this.sonage=sonage;
    
        if(sonage<0 || sonage>=age){
        throw new WrongAgeException("Son's age is Invalid!");
    }
    else{
        System.out.println("Son's age verified!");
    }
}
}
class Age{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int age,sonage;
        System.out.print("Enter Father's Age:");
        age=in.nextInt();
        System.out.print("Enter Son's Age:");
        sonage=in.nextInt();
        try{
        Father father = new Father(age);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            Son son = new Son(age,sonage);
            }
            catch (Exception e){
                System.out.println(e);
            }
    }
}