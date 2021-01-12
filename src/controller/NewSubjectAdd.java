package controller;

import java.awt.event.ActionEvent;


import javax.swing.AbstractAction;

import enums.CurrentYear;
import enums.Semestar;
import model.Subject;
import view.MainWindow;
import view.WorkSpace;
import view.NewSubjectWindow;

public class NewSubjectAdd extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 43435545435435435L;
	
	
	public NewSubjectAdd() 
	{
		super("Add subject");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object[] data = {
			NewSubjectWindow.getInstance().getTxtIdOfSubject().getText(),
			NewSubjectWindow.getInstance().getTxtNameOfSubject().getText(),
			NewSubjectWindow.getInstance().getCbS().getSelectedItem().toString(),
			NewSubjectWindow.getInstance().getCbY().getSelectedItem().toString()
		};
		
		WorkSpace.getModelTableSubjects().addRow(data);
		addInModel();
		NewSubjectWindow.getInstance().dispose();
		
	}
	
	private void addInModel()
	{
		Subject s = new Subject();
		
		s.setIdOfSubject(NewSubjectWindow.getInstance().getTxtIdOfSubject().getText());
		s.setNameOfSubject(NewSubjectWindow.getInstance().getTxtNameOfSubject().getText());
		int semestar = NewSubjectWindow.getInstance().getCbS().getSelectedIndex();
		Semestar ss;
		if(semestar == 0)
		{
			ss = Semestar.Summer;
		}
		else
		{
			ss = Semestar.Winter;
		}
		
		s.setSemestar(ss);
		
		int year = NewSubjectWindow.getInstance().getCbY().getSelectedIndex();
		CurrentYear yr;
		if(year == 0)
		{
			yr = CurrentYear.I;
		}
		else if(year == 1)
		{
			yr = CurrentYear.II;
		}
		else if(year == 2)
		{
			yr = CurrentYear.III;
		}
		else
		{
			yr = CurrentYear.IV;
		}
		
		s.setYearOfListening(yr);
		
		MainWindow.getInstance().getModel().getListOfSubject().add(s);
	}
	
}
