
package member1;

public class Member1 {
    String name;
    int age;
    int ph;
    int salary;
    String address;
 Member1(String name,int age,int ph,int salary,String address) {
    this.address=address;
    this.age=age;
    this.name=name;
    this.ph=ph;
    this.salary=salary;
    
    
}
public void printsalary(){
    System.out.println(salary);
}
}
class Employee extends Member1{
    String spcl;
    Employee(String name,int age,int ph,int salary,String address,String spcl){
        
        this.spcl=spcl;
    }

   
    public void printsolary(){
        System.out.println(salary);
        
    }
    
    
}
    class Manager extends Member1{
        String dep;
         Manager(String name,int age,int ph,int salary,String address,String dep){
        super(name,age,ph,address,salary);
        this.dep=dep;
    }

         public void printsalary(){
             System.out.println(salary);
         }
    }
        
    class memMain{
    public static void main(String[] args) {
      Employee obj1=new Employee("ujjwal",20,566755,30000,"merrut","cse");
      Manager obj2=new Manager("ujjwalku",23,56675566,30000,"merrut","software");
      obj1.printsalary();
      obj2.printsalary();
      
    }
    
}
