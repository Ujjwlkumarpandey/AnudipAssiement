
package lab3;

public class Rectangle extends Circle {
    int l=0,b=0;
    double ar;
    
    public void input(){
        super.input();
        l=6;
        b=5;
    }
    
    public void area(){
        super.area();
        ar=l*b;
        System.out.println("area of rectangle:"+ar);
        
    }
    
}
