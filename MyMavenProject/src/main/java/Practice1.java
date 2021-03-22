import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice1 {
	
	@Test
	public void display()
	{
		
        try 
        {
        	System.out.println("Hello Shilpa");
        	System.out.println("You are doing good. Keep it up");
    		
    		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
    		String baseUrl = "https://www.google.com";
            
            driver.get(baseUrl);
            driver.manage().window().maximize();
			
		} 
        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

//	public static void main(String[] args)
//	{
//		Practice1 p1= new Practice1();
//		p1.display();
//
//	}

}
