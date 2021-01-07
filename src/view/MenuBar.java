package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuBar extends JMenuBar
{
	public static final long serialVersionUID=32616873898087L;
	
	
	
	public  MenuBar() 
	{
		JMenu files= new JMenu("Files");
		JMenu edit= new JMenu("Edit");
		JMenu help= new JMenu("Help");
		
		//TODO bind Action
		JMenuItem newEntity= new JMenuItem("New");
		//TODO bind Action
		JMenuItem closeApp= new JMenuItem("Close");
		files.add(newEntity);
		files.add(closeApp);
		//TODO bind Action
		JMenuItem deleteEntity= new JMenuItem("Delete");
		//TODO bind Action
		JMenuItem editEntity= new JMenuItem("Edit");
		edit.add(deleteEntity);
		edit.add(editEntity);
		
		
		JMenuItem helpMenuItem= new JMenuItem( "Help");
		JMenuItem about= new JMenuItem("About");
		help.add(helpMenuItem);
		help.add(about);
		
		
		add(files);
		add(edit);
		add(help);
	}
	

}
