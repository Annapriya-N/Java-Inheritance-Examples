package inheritance;

class Parent
{
	Parent() //constructor name should be class name
	{
		System.out.println("Vechicle Sound");
	}
}

class Child1 extends Parent
{
	 Child1() //constructor name should be class name
	{
		System.out.println("Child1 Sound");
	}
}

public class singleInheritancewithConstructor {

	public static void main(String[] args) 
	{
		Parent p1 = new Parent(); // only parent will print
		Child1 c1 = new Child1(); // print both parent and class as it is inherited from the parent class
		
	}

}
