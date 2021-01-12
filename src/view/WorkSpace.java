package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import model.Professor;
import model.Student;
import model.Subject;

public class WorkSpace extends JPanel
{
	private static JTable tableStudents;
	private static JTable tableProfessors;
	private static JTable tableSubjects;
	private static JTabbedPane tabbedPane;
	private static DefaultTableModel modelTableStudents;
	private static DefaultTableModel modelTableProfessors;
	private static DefaultTableModel modelTableSubjects;
	
	
	public static JTable getTableStudents() {
		return tableStudents;
	}

	public static void setTableStudents(JTable tableStudents) {
		WorkSpace.tableStudents = tableStudents;
	}

	public static JTable getTableProfessors() {
		return tableProfessors;
	}

	public static void setTableProfessors(JTable tableProfessors) {
		WorkSpace.tableProfessors = tableProfessors;
	}

	public static JTable getTableSubjects() {
		return tableSubjects;
	}

	public static void setTableSubjects(JTable tableSubjects) {
		WorkSpace.tableSubjects = tableSubjects;
	}

	public static JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public static void setTabbedPane(JTabbedPane tabbedPane) {
		WorkSpace.tabbedPane = tabbedPane;
	}

	public static DefaultTableModel getModelTableStudents() {
		return modelTableStudents;
	}

	public static void setModelTableStudents(DefaultTableModel modelTableStudents) {
		WorkSpace.modelTableStudents = modelTableStudents;
	}

	public static DefaultTableModel getModelTableProfessors() {
		return modelTableProfessors;
	}

	public static void setModelTableProfessors(DefaultTableModel modelTableProfessors) {
		WorkSpace.modelTableProfessors = modelTableProfessors;
	}

	public static DefaultTableModel getModelTableSubjects() {
		return modelTableSubjects;
	}

	public static void setModelTableSubjects(DefaultTableModel modelTableSubjects) {
		WorkSpace.modelTableSubjects = modelTableSubjects;
	}

	public WorkSpace() 
	{
		this.setLayout(new BorderLayout());
		tabbedPane= new JTabbedPane();
		JPanel studentsPanel= new JPanel();
		studentsPanel.setLayout(new BorderLayout());
		JPanel professorPanel= new JPanel();
		professorPanel.setLayout(new BorderLayout());
		
		JPanel subjectPanel= new JPanel();
		subjectPanel.setLayout(new BorderLayout());

		
		Object[] headersStudents= {"Index","First Name","Last Name","Year of study","Status","Avrage mark"};
		modelTableStudents= new DefaultTableModel(headersStudents,0);
		tableStudents= new JTable(modelTableStudents);
		tableStudents.setAutoCreateRowSorter(true);
		JScrollPane studenstScrollPane= new  JScrollPane(tableStudents);
		studentsPanel.add(studenstScrollPane,BorderLayout.CENTER);
		
		
		Object[] headerProfessor= {"First Name","Last Name","Work adress","Title"};
		modelTableProfessors= new DefaultTableModel(headerProfessor,0);
		tableProfessors= new JTable(modelTableProfessors);
		tableProfessors.setAutoCreateRowSorter(true);
		JScrollPane professorScrollPane= new  JScrollPane(tableProfessors);
		professorPanel.add(professorScrollPane,BorderLayout.CENTER);
		
		Object[] headersSubject= {"ID of subject","Name of subject","Semestar","From which year it is","Proffesor","List of students"};
		modelTableSubjects= new DefaultTableModel(headersSubject,0);
		tableSubjects= new JTable(modelTableSubjects);
		tableSubjects.setAutoCreateRowSorter(true);
		JScrollPane subjectstScrollPane= new  JScrollPane(tableSubjects);
		subjectPanel.add(subjectstScrollPane,BorderLayout.CENTER);
		
		tabbedPane.add("Students",studentsPanel);
		tabbedPane.add("Professors",professorPanel);
		tabbedPane.add("Subjects",subjectPanel);
		this.add(tabbedPane,BorderLayout.CENTER);
	}
	
	public static void initializeStudentTable()
	{
		for(Student s:MainWindow.getInstance().getModel().getListOfStudent()) 
		{
			
			Object[] data={
		    s.getIndexNum(),
			s.getFirstName(),
			s.getLastName(),
			s.getCurrentYear(),
			s.getStatus(),
			s.getAvrageMark()
			};
			modelTableStudents.insertRow(0, data);
			
		}
	}
	public static void initializeProfessorTable()
	{
		for(Professor p : MainWindow.getInstance().getModel().getListOfProfessor())
		{
			Object[] data= {
					p.getFirstName(),
					p.getLastName(),
					p.getWorkAdress(),
					p.getTitle()
			};
			modelTableProfessors.insertRow(0,data );
		}
	}
	
	public static void initializeSubjectTable()
	{
		for(Subject s : MainWindow.getInstance().getModel().getListOfSubject() )
		{
			if(s.getProfessor() !=null)
			{
				Object[] data= {
						s.getIdOfSubject(),
						s.getNameOfSubject(),
						s.getSemestar(),
						s.getYearOfListening(),
						s.getProfessor().getFirstName()+ " "+s.getProfessor().getLastName(),
						"Show"
				};
				modelTableSubjects.insertRow(0, data);
			}
			else
			{
				Object[] data = {
						s.getIdOfSubject(),
						s.getNameOfSubject(),
						s.getSemestar(),
						s.getYearOfListening(),
						"None",
						"Show"
				};
				modelTableSubjects.insertRow(0, data);
			}
		}
	}

}
