
public class Tester {
	
	public static void main (String args[]){
		
		//MyCalculation demo = new MyCalculation(); 
	
		int a = 2; 
		int b = 5; 
	
		//demo.addition(a, b);
		//demo.subtraction(a,b);
		//demo.multiply(a, b);
		
		
		//demo.mymethod();
		
		
		/*
		 **********Testing for super(int)*********
		 * 
	     MyCalculation demo = new MyCalculation(24); 
		
		demo.getAge();
		*/
		
		/*
		 * 
		 ******Testing for extends and different superclasses*******
		 *
		 *
		
		Calculation M = new Calculation();
		MyCalculation N = new MyCalculation();
		
		System.out.println(N instanceof Math);
		System.out.println(N instanceof Calculation);
		System.out.println(N instanceof MyCalculation);
		System.out.println(M instanceof MyCalculation);
		*/
		
		/*
		 *******Testing for interface
		 * 
		
		Calculation N = new Calculation();
		MyCalculation M = new MyCalculation();
		
		System.out.println(M instanceof Math);
		System.out.println(M instanceof Homework);
		*/
		
		/*** Overriding
		 *
		 */
		
		Calculation A = new Calculation();
		MyCalculation B = new MyCalculation();
		
		A.state();
		B.state();
		B.TestSuper();
	}

}
