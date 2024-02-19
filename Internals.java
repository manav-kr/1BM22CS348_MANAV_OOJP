package CIE;
public class Internals extends Student {
  public int m[]=new int[5];
  public Internals(String usn, String name, int sem,int [] m){
    super(usn,name,sem);
    this.m=m;
  }   
}