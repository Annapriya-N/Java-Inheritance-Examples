package inheritance;

class grandFather{
 void parentMeth()
{
      System.out.println("I am a grand Father");
      
}
}
class father extends grandFather{
	 void fatherMeth()
	 {
		 System.out.println("I am a father");
	 }
}

class child1 extends father{
	void childMeth()
	{
		System.out.println("I am a child");
	}
}

public class multilevelInteritance {
	public static void main(String[] args)
	{
		child1 c1 = new child1();
		c1.childMeth();
		c1.fatherMeth();
		c1.parentMeth();
		
	}

}
