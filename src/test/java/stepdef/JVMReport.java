package stepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JVMReport {
	
	public static void GenerateJVMReport (String j) {
		File f = new File("C:\\Users\\sprit\\eclipse-workspace\\JVMReport");
		Configuration c = new Configuration(f, "JVM Test");
		c.addClassifications("Browser Name", "Google Chrome");
		c.addClassifications("Browser Version", "86.0");
		c.addClassifications("OS", "Windows 10");
		c.addClassifications("Sprint", "1");
		List<String> list = new ArrayList<String>();
		list.add(j);
		ReportBuilder rb = new ReportBuilder(list, c);
		rb.generateReports();
		
	}

}
