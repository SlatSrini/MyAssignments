package org.system;

public class Desktop extends Computer{
	
	public void desktopSize(int size)
	{
		System.out.println("DeskTop Size : "+size);
	}

public static void main(String[] args) {
	
	Desktop desktop = new Desktop();
	
	desktop.computerModel("Lenovo B490");
	desktop.desktopSize(64);
}	
}
