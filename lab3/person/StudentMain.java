
package person;

public class StudentMain {
    	public static void main(String[] args) {
        //Declaring and initializing the array....
		String[] subjects= {"Java","OS","OOPS"};
		
        //Instantiation of students
		Student s1=new Student("ujjwal",20,"57769778","15",subjects);
		Student s2=new Student("jothish",22,"6495799","10",subjects);

//Printing the students details
		System.out.println(s1);
		System.out.println(s2);
		

	
	}

}
    

