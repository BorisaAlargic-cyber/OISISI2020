package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar
{
	public static JButton getBtnAddStudent() {
		return btnAddStudent;
	}


	public static void setBtnAddStudent(JButton btnAddStudent) {
		ToolBar.btnAddStudent = btnAddStudent;
	}


	public static JButton getBtnAddProfessor() {
		return btnAddProfessor;
	}


	public static void setBtnAddProfessor(JButton btnAddProfessor) {
		ToolBar.btnAddProfessor = btnAddProfessor;
	}


	public static final long serialVersionUID=78654324567L;
	
	private static JButton btnAddStudent;
	private static JButton btnAddProfessor;
	private static JButton btnDeleteProfessor;
	
	
	public ToolBar() 
	{
		
		this.setLayout(new BorderLayout());
		this.setBackground(new Color(150,220,180));
		
		JPanel buttons= new JPanel();
		buttons.setLayout(new FlowLayout(FlowLayout.LEFT));
		//TODO bind Actions
		JButton btnAddNewEntity= new JButton("Add");
		//TODO bind Actions
		JButton btnEditEntity= new JButton("Edit");
		
		JButton btnDeleteEntity= new JButton("Delete");
		btnAddStudent= new JButton("temp1");
		btnAddProfessor= new JButton("temp2");
		//TODO
		btnDeleteProfessor= new JButton("temp3");
		buttons.add(btnAddNewEntity);
		buttons.add(btnEditEntity);
		buttons.add(btnDeleteEntity);
		buttons.add(btnAddStudent);
		buttons.add(btnAddProfessor);
		buttons.add(btnDeleteProfessor);
		
	
		
	    
	    JPanel pnlSearch= new JPanel();
	    pnlSearch.setLayout(new FlowLayout(FlowLayout.RIGHT));
	    JTextField tfSearch= new JTextField();
	    tfSearch.setPreferredSize(new Dimension(200,30));
	    //TODO bind action
	    JButton btnSearch= new JButton("Search");
	    btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	    
	    pnlSearch.add(tfSearch);
	    pnlSearch.add(btnSearch);
	    
	    this.add(buttons,BorderLayout.WEST);
	    this.add(pnlSearch,BorderLayout.EAST);	
	}


	public static JButton getBtnDeleteProfessor() {
		return btnDeleteProfessor;
	}


	public static void setBtnDeleteProfessor(JButton btnDeleteProfessor) {
		ToolBar.btnDeleteProfessor = btnDeleteProfessor;
	}
	
	

}