package inheritance;

class vechicle{
 void VechicleMethod()
{
	System.out.println("This is parent : Vechicle class");
}
}
class Car extends vechicle{
	void carmethod()
	{
		System.out.println("This is child class extends from parent class : Car class");
	}
	
}

class bus extends vechicle{
	void busmethod()
	{
		System.out.println("This is child class extends from parent class : Bus class");
	}
}

interface fare {
	default void money()
	{
		System.out.println("This is INR");
	}
}

class total extends vechicle implements fare
{
	total()
	{
		System.out.println("Total Amount");
	}
}


public class hybridInheritance {
	
	public static void main(String args[])
	{
		bus b1 = new bus();
		b1.busmethod();
		b1.VechicleMethod();
		
		Car c1 = new Car();
		c1.carmethod();
		
		total t1 = new total();
		t1.money();
		
		
	}
	

}
