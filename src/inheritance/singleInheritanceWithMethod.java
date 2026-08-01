package inheritance;

class Parent1 //super class
 { 
	   void method1Parent()
	   {
		   System.out.println("I am the super class");
	   }
	 
 }

class child extends Parent1 //Sub class
{
	void method1Child()
	{
		System.out.println("I am the subclass will be inherited from the parent class");
	}
}

public class singleInheritanceWithMethod {
	public static void main(String[] args)
	{
		child c2 = new child(); //create a object of child class so that we can access both child and parent class
		c2.method1Child();
		c2.method1Parent();
	}
	

}
