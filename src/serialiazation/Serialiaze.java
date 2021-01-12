package serialiazation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import view.MainWindow;
import view.OurConfiguration;

public class Serialiaze
{
	public static void serialiaze () 
	{
		try {
			FileOutputStream fos = new FileOutputStream(OurConfiguration.resourcesPath + "data.ss");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(MainWindow.getInstance().getModel());
			fos.close();
			oos.close();
			System.out.println("Serilization has finished succesfuly");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
