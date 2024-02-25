abstract class Animal
{
	public abstract void sound();
}
 class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog says:Boww Woww");
	}
}
class ex
{
	public static void main(String args[])
	{
		Dog obj=new Dog();
		obj.sound();
	}
}
/*OUTPUT=>javac ex.java

C:\Users\sneha\OneDrive\Desktop\JAVA>java ex
Dog says:Boww Woww
*/
