package view;

import java.nio.file.Path;
import java.nio.file.Paths;

public class OurConfiguration 
{
	private static Path currentRelativePath = Paths.get("");
	public static Path  relativePath=Paths.get("");
	public static String resourcesPath= relativePath.toAbsolutePath().toString()+"/resources/"; 
	

}
