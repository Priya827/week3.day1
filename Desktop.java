package Org.system;

public class Desktop {
	
	public void desktopSize()
	{
		System.out.println("Some size to be printed");
	}
	public static void main(String[] args) {
		
		Computer c = new Computer();
		c.computerModel();
		Desktop d = new Desktop();
		d.desktopSize();

  }
}

