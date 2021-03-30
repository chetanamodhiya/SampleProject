import org.testng.annotations.Test;
public class SampleClass {
@Test
public void sampleMethod()
{
	String url = System.getProperty("url");
	String browser = System.getProperty("browser");
}
}
