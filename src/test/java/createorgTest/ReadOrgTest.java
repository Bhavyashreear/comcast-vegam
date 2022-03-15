package createorgTest;

import org.testng.annotations.Test;

public class ReadOrgTest {
@Test
public void readOrgTest()
{
	String BROWSER = System.getProperty("browser");
	System.out.println(BROWSER);
	
	String URL = System.getProperty("url");
	System.out.println(URL);
}
}
