/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;


   
import java.util.Arrays;

public class Student extends Person {
	static final String institute="itm";
	String roll;
	String[] subjects;
	
	//default constructor
	 public Student(){
		System.out.println("default constructor");
	}
	
	 //parameterized constructor
	 public Student(String name,int age,String mob,String roll,String[] subjects){
		 super(name,age,mob);
			this.roll = roll;
			this.subjects=subjects;
		} 
	
	//override toString
	 public String toString() {
			System.out.println("Institute: "+institute);
            
			return "Student [RollNo=" + roll + ", Subject=" + Arrays.toString(subjects) + ", Name=" + name + ", Age=" + age
					+ ", Mob=" + mob + "]";
		}
}
    

