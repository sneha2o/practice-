class parentclass
{
	void display()
	{
		System.out.println("Parent class method");
	}
}
class subclass extends parentclass
{
	void display()
	{
		System.out.println("child class method");
	}
	void printMsg()
	{
		display();
		super.display();
	}
	
}
class superclass
{
	public static void main(String args[])
	{
		subclass obj=new subclass();
		obj.printMsg();
	}
}
/*OUTPUT=>>javac superclass.java

C:\Users\sneha\OneDrive\Desktop\JAVA>java superclass
child class method
Parent class method
*/
