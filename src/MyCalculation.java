import java.lang.Character.Subset;

public class MyCalculation extends Calculation implements Homework{

	/*
	 * 
	 * This is for testing how to use the superclass constructor 
	 
	 
	MyCalculation (int age){  // calling the constructor of the superclass since we can't use contrustors are not memberse 
	super(age);
	
	}
	
	*/
	
	public void multiply (int x, int y){ 
		
		z = x*y;
		System.out.println("The multiplication of the given numbers is " + z);
	}
	
	public void addition(int x, int y){
		
		z=x+y;
		System.out.println("SUBCLASS: The sum of the given numbers is " + z );
		
	}
	
	public void mymethod(){ //Using SUPER (when we have variables or methods with the same name between the sub and super
	
	super.addition(1,2); 
	addition(5,1);
	
	}
	
	public void state(){
		System.out.println("Weather in MyCalculation is sunny");
	}
	
	public void TestSuper(){ //overriding 
		super.TestSuper();
		System.out.println("I AM SUBSUB");
	}
}
