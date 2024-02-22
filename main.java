class vehicle 
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}
class Car extends vehicle
{
	void run()
	{
	   System.out.println("Car is running");
	}
}
class main
{
	public static void main(String args[])
	{
		Car obj=new Car();
		obj.run();
	}
}
/*OUTPUT=>javac main.java

C:\Users\sneha\OneDrive\Desktop\JAVA>java main
Car is running
*/
		