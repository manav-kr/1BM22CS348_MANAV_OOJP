package SEE;
import CIE.Student;
public class External extends Student{
    public int sm[]=new int[5];
    public External(String usn, String name, int sem, int[] sm){
        super(usn,name,sem);
        this.sm=sm;
    }
}