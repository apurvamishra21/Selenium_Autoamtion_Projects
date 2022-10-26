package TEST;

abstract class MyClass {
	
	private void disp1()
	{
		System.out.println("Parent class");
	}
	abstract public void disp2();
	abstract void disp3();
	abstract protected void disp4();
}

class Program extends MyClass
{
	void disp2()
	{
		System.out.println("1");
	}
	void disp3()
	{
		System.out.println("2");
	}
	protected void disp4()
	{
		System.out.println("3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program obj = new Program();
	}

}
