
package lab3;



public class Student extends Person {
   // private instance variables
private String Institutename;   
   private String[] subjec; 
   private int[] rollno;    

    public Student(String Institutename, String[] subjec, int[] rollno, String name, int Age, long Mob) {
        super(name, Age, Mob);
        this.Institutename = Institutename;
        this.subjec = subjec;
        this.rollno = rollno;
    }
 
    @Override
    public String toString() {
        return "Student{" + "Institutename=" + Institutename + ", subjec=" + subjec + ", rollno=" + rollno + '}';
    }
   
   
}
    
    

