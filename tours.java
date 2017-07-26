import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class tours {

	public static void main(String[] args) throws InterruptedException{
		final int WAIT_TIME = 3000;
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
	driver.get("http://newtours.demoaut.com/");
	
	WebElement username = driver.findElement(By.name("userName"));
	username.sendKeys("mercury");
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("mercury");
	WebElement loginbt = driver.findElement(By.name("login"));
	loginbt.click();
	
	WebElement radioBtn = driver.findElement(By.cssSelector("input[value='oneway']"));
	radioBtn.click();
	
	WebElement mySelectElement = driver.findElement(By.name("passCount"));
	Select dropdown= new Select(mySelectElement);
	dropdown.selectByIndex(2);
	
	WebElement mySelectElement1 = driver.findElement(By.name("fromPort"));
	Select dropdown1= new Select(mySelectElement1);
	dropdown1.selectByIndex(4);
	
	WebElement mySelectElement2 = driver.findElement(By.name("fromMonth"));
	Select dropdown2= new Select(mySelectElement2);
	dropdown2.selectByIndex(7);
	
	WebElement mySelectElement3 = driver.findElement(By.name("fromDay"));
	Select dropdown3= new Select(mySelectElement3);
	dropdown3.selectByIndex(2);
	
	WebElement mySelectElement4 = driver.findElement(By.name("toPort"));
	Select dropdown4= new Select(mySelectElement4);
	dropdown4.selectByIndex(2);
	
	WebElement mySelectElement5 = driver.findElement(By.name("toMonth"));
	Select dropdown5= new Select(mySelectElement5);
	dropdown5.selectByIndex(2);
	
	WebElement mySelectElement6 = driver.findElement(By.name("toDay"));
	Select dropdown6= new Select(mySelectElement6);
	dropdown6.selectByIndex(2);
	
	java.util.List<WebElement> list = driver.findElements(By.name("servClass"));
    System.out.println("Size is "+list.size());
	list.get(1).click();
	
	WebElement mySelectElement7 = driver.findElement(By.name("airline"));
	Select dropdown7= new Select(mySelectElement7);
	dropdown7.selectByIndex(2);

	WebElement loginBt1= driver.findElement(By.name("findFlights"));
	loginBt1.click();
	
	java.util.List<WebElement> list1 = driver.findElements(By.name("outFlight"));
    System.out.println("Size is "+list.size());
	list1.get(1).click();
	
	java.util.List<WebElement> list2 = driver.findElements(By.name("inFlight"));
    System.out.println("Size is "+list.size());
	list2.get(1).click();
	
	WebElement loginBt2= driver.findElement(By.name("reserveFlights"));
	loginBt2.click();
	
	WebElement first = driver.findElement(By.name("passFirst0"));
	first.sendKeys("sakshi");
	WebElement last = driver.findElement(By.name("passLast0"));
	last.sendKeys("singhal");
	WebElement mySelectElement8 = driver.findElement(By.name("pass.0.meal"));
	Select dropdown8= new Select(mySelectElement8);
	dropdown8.selectByIndex(3);
	
	WebElement first1 = driver.findElement(By.name("passFirst1"));
	first1.sendKeys("navleen");
	WebElement last1 = driver.findElement(By.name("passLast1"));
	last1.sendKeys("kaur");
	WebElement mySelectElement9 = driver.findElement(By.name("pass.1.meal"));
	Select dropdown9= new Select(mySelectElement9);
	dropdown9.selectByIndex(3);
	
	WebElement first2 = driver.findElement(By.name("passFirst2"));
	first2.sendKeys("simmi");
	WebElement last2 = driver.findElement(By.name("passLast2"));
	last2.sendKeys("singh");
	WebElement mySelectElement10 = driver.findElement(By.name("pass.2.meal"));
	Select dropdown10= new Select(mySelectElement10);
	dropdown10.selectByIndex(3);
	
	WebElement mySelectElement11 = driver.findElement(By.name("creditCard"));
	Select dropdown11= new Select(mySelectElement11);
	dropdown11.selectByIndex(3);
	
	WebElement crnum = driver.findElement(By.name("creditnumber"));
	crnum.sendKeys("DLT456H67");
	
	WebElement mySelectElement12 = driver.findElement(By.name("cc_exp_dt_mn"));
	Select dropdown12= new Select(mySelectElement12);
	dropdown12.selectByIndex(3);
	
	WebElement mySelectElement13 = driver.findElement(By.name("cc_exp_dt_yr"));
	Select dropdown13= new Select(mySelectElement13);
	dropdown13.selectByIndex(5);
	
	WebElement fname = driver.findElement(By.name("cc_frst_name"));
	fname.sendKeys("sakshi");
	
	WebElement mname = driver.findElement(By.name("cc_mid_name"));
	mname.sendKeys("singhal");
	
	WebElement lname = driver.findElement(By.name("cc_last_name"));
	lname.sendKeys("singhal");
	
	WebElement add = driver.findElement(By.name("billAddress1"));
	//System.out.println("Waiting..... "+from.getAttribute("value"));

	//Thread.sleep(5000);
	//JavascriptExecutor js = (JavascriptExecutor) driver; 
   // js.executeScript("document.getElementByname('billAddress1').value=''");
	add.sendKeys("rohini sec-04");
	
	WebElement city = driver.findElement(By.name("billCity"));
	city.sendKeys("Delhi");
	
	WebElement state = driver.findElement(By.name("billState"));
	state.sendKeys("Delhi");
	
	WebElement zip = driver.findElement(By.name("billZip"));
	zip.sendKeys("110035");
	
	WebElement mySelectElement14 = driver.findElement(By.name("billCountry"));
	Select dropdown14= new Select(mySelectElement14);
	dropdown14.selectByIndex(20);
	
	WebElement dadd = driver.findElement(By.name("delAddress1"));
	dadd.sendKeys("Pitampura");
	
	WebElement dcity = driver.findElement(By.name("delCity"));
	dcity.sendKeys("new delhi");
	
	WebElement dstate = driver.findElement(By.name("delState"));
	dstate.sendKeys("Delhi");
	
	WebElement dzip = driver.findElement(By.name("delZip"));
	dzip.sendKeys("110086");
	
	WebElement mySelectElement15 = driver.findElement(By.name("delCountry"));
	Select dropdown15= new Select(mySelectElement15);
	dropdown15.selectByIndex(20);
	
	Thread.sleep(3000);
	WebElement buy = driver.findElement(By.name("buyFlights"));
	buy.click();
	
	
	
	
	
	}

}
