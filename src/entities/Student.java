package entities;

/**
 *
 * @author Jfc01
 */
public class Student {
    public String name;
    public float n1,n2,n3;
    
    public float finalGrade(){
      return n1 + n2 + n3;
    }
    
    public String gradesResult(){
        if (finalGrade() <  60){
            float ms = 60 - finalGrade();
           // System.out.printf("FAILED \nMISSING %.2f POINTS\n", ms);
            return "FAILED" + String.format("\nMISSING %.2f POINTS \n", ms);
        }
        else{
            //System.out.println("PASS");
            return "PASS";
        }
    }
}
