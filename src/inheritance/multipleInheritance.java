package inheritance;

interface parent1 //super class 1 
{
	default void method1()
	{
		System.out.println("I am the first parent1 class");
	}
}

interface parent2 //super class 2
{
	default void method2()
	{
		System.out.println("I am the second parent2 class");
	}
}

class childcls implements parent1, parent2 //child class implements both parent1 and parent2 interfaces using implements keyword
{
	childcls() //constructor is created here
	{
		System.out.println("I am the subclass which implements both super classes parent 1 and parent 2 ");
	}
}


public class multipleInheritance {
	public static void main(String args[])
	{
		childcls child1 = new childcls(); //object is created in constructor name so statement in constructor will be invoked automatically
		child1.method1();
		child1.method2();
	}

}
