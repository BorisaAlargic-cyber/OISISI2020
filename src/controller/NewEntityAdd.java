package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.NewProfessorWindow;
import view.NewStudentWindow;
import view.WorkSpace;

public class NewEntityAdd extends AbstractAction
{


	public NewEntityAdd() 
	{
		super("Add");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		int index=WorkSpace.getTabbedPane().getSelectedIndex();
		if(index==0) 
		{
			NewStudentWindow.getInstance().show();
			NewStudentWindow.getInstance().getBtnEdit().setVisible(false);
			NewStudentWindow.getInstance().getBtnSave().setVisible(true);
		}
		 else if (index==1)
		{
			NewProfessorWindow.getInstance().show();
			NewProfessorWindow.getInstance().getBtnEdit().setVisible(false);
		}
		 else
		 {
			
		 }
		
	}

}
