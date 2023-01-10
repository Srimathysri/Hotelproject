package hotelProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelProject {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\HotelProject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
        Thread.sleep(2000);
        
        WebElement UserName = driver.findElement(By.id("username"));
  
		 UserName.sendKeys("Srimathy");
		 
		 Thread.sleep(2000);
		 
		 WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys("7OE9M5");
		
		 Thread.sleep(2000);
		 
		 WebElement login = driver.findElement(By.id("login"));
		 login.click();
		
		System.out.println("==Login Successfully==");
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByVisibleText("Paris");
		
		Thread.sleep(2000);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Sunshine");
		
		Thread.sleep(2000);

		WebElement room_type = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room_type);
		s2.selectByVisibleText("Double");
		
		Thread.sleep(2000);
		
		WebElement room_nos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(room_nos);
		s3.selectByVisibleText("2 - Two");
		
		Thread.sleep(2000);

		WebElement datepick_in = driver.findElement(By.id("datepick_in"));
		datepick_in.clear();
		
		datepick_in.sendKeys("10/02/2022");
	
		Thread.sleep(2000);
		
		WebElement datepick_out = driver.findElement(By.id("datepick_out"));
		datepick_out.clear();
		
		datepick_out.sendKeys("12/02/2022");
		
		Thread.sleep(2000);
		
		WebElement adult_room = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult_room);
		s4.selectByVisibleText("2 - Two");
		
		Thread.sleep(2000);


		WebElement child_room = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child_room);
		s5.selectByVisibleText("0 - None");
		
		Thread.sleep(2000);

		WebElement Submit = driver.findElement(By.id("Submit"));
		Submit.click();
		
		WebElement radiobutton_0 = driver.findElement(By.id("radiobutton_0"));
		radiobutton_0.click();
		
		
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		
		WebElement FirstName = driver.findElement(By.id("first_name"));
		FirstName.sendKeys("Srimathy");
		
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Sri");
		
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("pollachi,coimbatore");
		
		Thread.sleep(2000);
		
		WebElement CreditCard = driver.findElement(By.id("cc_num"));
		CreditCard.sendKeys("1234567891234456");
		
		Thread.sleep(2000);
		
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cc_type);
		s6.selectByVisibleText("VISA");
		
		Thread.sleep(2000);
		
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(cc_exp_month);
		s7.selectByVisibleText("November");
		
		Thread.sleep(2000);
		
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(cc_exp_year);
		s8.selectByVisibleText("2022");
		
		Thread.sleep(2000);
		
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		cc_cvv.sendKeys("345");
		
		Thread.sleep(2000);
		
		WebElement book_now = driver.findElement(By.id("book_now"));
		book_now.click();
		
		Thread.sleep(2000);
		
	    System.out.println("===Hotel booked===");
		
		
		
		
		
		
		
		
	}
}
