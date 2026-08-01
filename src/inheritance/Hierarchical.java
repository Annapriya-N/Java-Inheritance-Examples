package inheritance;

 class Degree //Superclass
{
	void BscComputer()
	{
		System.out.println("Bsc. Computer Science");
	}
}
 
 class PG extends Degree //Subclass
 {
	 void MscComputer()
	 {
		 System.out.println("Msc. Computer Science");
	 }
 }

public  class Hierarchical {

	public static void main(String[] args) {
		
		PG P = new PG(); //Create Object in Child class name then we can call parent class from it
		P.BscComputer(); //Parent class(inherited)
		P.MscComputer(); // Child class

	}

}
