class Calculation extends Math{
	int z; 
	int num; 
	
	public void addition(int x, int y){
	
	z = x + y;
	System.out.println("SUPERCLASS: The sum of the given numbers is " + z);
	
	}
	
	public void subtraction( int x, int y){
		
		z = x -y;
		System.out.println("The subtraction of the given numbers is " + z);
	}
	
	/* This is for testing how to use the superclass constructor 
	 * 
	 *
	Calculation (int num){    //constructor 
		this.num = num; 
	}
	
	public void getAge(){
		System.out.println("GetAge will give me: " + num); 
	}
	*/ 
	
	public void state(){
		System.out.println("Weather in Calculation is windy");
	}
	
	public void TestSuper(){
		System.out.println("I AM SUPERCLASS");
	}
}
