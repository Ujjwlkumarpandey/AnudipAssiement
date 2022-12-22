
package lab3;

public class Person {
   // private instance variables
   private String name;
   private int Age;
   private long Mob;
   
   /** Constructs a Person instance with the given name and address */
   public Person(String name, int Age,long Mob) {
      this.name = name;
      this.Age = Age;
      this.Mob=Mob;
   }

    public long getMob() {
        return Mob;
    }

    public void setMob(long Mob) {
        this.Mob = Mob;
    }
   
   // Getters and Setters
   /** Returns the name */
   public String getName() {
      return name;
   }
   /** Returns the address */
   public int getAge() {
      return Age;
   }
   /** Sets the address */
   public void setAge(int Age) {
      this.Age = Age;
   }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", Age=" + Age + ", Mob=" + Mob + '}';
    }
   
 
  
}
   

    


