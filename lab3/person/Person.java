
package person;

public class Person {
	//data members declaration
	String name;
	String mob;
	int age;
	 
	//Default Constructor
		public Person(){
			System.out.println("Default Constructor.....");	
		}
	//parameterized constructor	
	Person(String name,int age,String mob){
		this.name = name;
		this.age = age;
		this.mob = mob;
		
	}
}


