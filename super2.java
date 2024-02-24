class parentclass
{
	int num=10;
}
class subclass extends parentclass
{
	int num=20;
	void printNum()
	{
		System.out.println(super.num);
	}
}
class super2
{
	public static void main(String args[])
	{
		subclass obj=new subclass();
		obj.printNum();
	}
}
/*OUTPUT=>javac super2.java

C:\Users\sneha\OneDrive\Desktop\JAVA>java super2
10
*/