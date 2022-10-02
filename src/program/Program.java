
package program;
import java.util.Scanner;
import java.util.Locale;
import entities.Student;
/**
 *
 * @author Jfc01
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        Student al = new Student();
        
        al.name = tc.nextLine();
        al.n1 = tc.nextFloat();
        al.n2 = tc.nextFloat();
        al.n3 = tc.nextFloat();
        
        System.out.printf("FINAL GRADE = %.2f\n", al.finalGrade());
        System.out.println(al.gradesResult());
        
        tc.close();
    }
    
}
