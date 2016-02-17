package array.view;

import javax.swing.JFrame;

import array.controller.ArrayController;

public class ArrayFrame extends JFrame
{
	private ArrayPanel basePanel;
	private ArrayController baseController;
	
	public ArrayFrame(ArrayController baseController)
	{
		this.baseController = baseController;
		basePanel = new ArrayPanel(baseController);
		
		buildFrame();
	}
	private void buildFrame()
	{
		setContentPane(basePanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setTitle("Array Assignment :/ ");
		setVisible(true);
	}
}
