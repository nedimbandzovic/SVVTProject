package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Random;
import java.util.random.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

class SVVTProjectTesting {
	
	private static WebDriver webDriver;
	private static String baseUrl;
	private static Random rand;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		baseUrl="http://www.olx.ba";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nedim\\Desktop\\selenium\\chromedriver.exe");
		webDriver=new ChromeDriver();
		rand=new Random();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		webDriver.close();
	}

	/*@Test
	void mobileAppTest() throws InterruptedException {
		webDriver.manage().window().maximize();
		baseUrl="http://www.olx.ba";
		webDriver.get(baseUrl);
		Thread.sleep(3000);
		WebElement prijavaButton= webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/a[1]"));
		prijavaButton.click();
		Thread.sleep(3000);
		WebElement mobileApps=webDriver.findElement(By.xpath("/html/body/footer/div[1]/div/div[3]/ul/li[4]/a"));
		mobileApps.click();
		Thread.sleep(3000);
		WebElement cookies=webDriver.findElement(By.xpath("/html/body/div[4]/p/button"));
		cookies.click();
		WebElement gPlay=webDriver.findElement(By.cssSelector("body > div.container > div > div > div > center:nth-child(4) > div > a:nth-child(1)"));
		String current=webDriver.getCurrentUrl();
		String modifiedURL=current.replace(current, gPlay.getAttribute("href"));
		webDriver.get(modifiedURL);
		Thread.sleep(3000);
		assertEquals("OLX.ba, Aplikacije na Google Playu", webDriver.getTitle());
		Thread.sleep(3000);
		webDriver.navigate().back();
		WebElement appStore=webDriver.findElement(By.cssSelector("body > div.container > div > div > div > center:nth-child(4) > div > a:nth-child(2)"));
		current=webDriver.getCurrentUrl();
		modifiedURL=current.replace(current, appStore.getAttribute("href"));
		webDriver.get(modifiedURL);
		Thread.sleep(3000);
		assertEquals("https://apps.apple.com/us/app/id1037978542", webDriver.getCurrentUrl());
		Thread.sleep(3000);
		webDriver.navigate().back();
		WebElement wPhone=webDriver.findElement(By.cssSelector("body > div.container > div > div > div > center:nth-child(4) > div > a:nth-child(3)"));
		current=webDriver.getCurrentUrl();
		modifiedURL=current.replace(current, wPhone.getAttribute("href"));
		webDriver.get(modifiedURL);
		Thread.sleep(3000);
		assertEquals("https://www.microsoft.com/hr-ba/p/olxba/9wzdncrd2jsf?rtc=1&activetab=pivot:overviewtab", webDriver.getCurrentUrl());
		Thread.sleep(3000);
		webDriver.navigate().back();
		
	}
	
	@Test
	
	void registration () throws InterruptedException{
		
		baseUrl="http://www.olx.ba";
		webDriver.get(baseUrl);
		WebElement login=webDriver.findElement(By.cssSelector("#loginbtn"));
		login.click();
		Thread.sleep(3000);
		WebElement registerButton=webDriver.findElement(By.cssSelector("#box-login > div > a"));
		registerButton.click();
		WebElement registerProfile=webDriver.findElement(By.xpath("//*[@id=\"reg-desno\"]/a"));
		registerProfile.click();
		WebElement email=webDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[3]/form/div[2]/input"));
		email.sendKeys("testdzoba@gmail.com");
		Thread.sleep(4000);
		WebElement password=webDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[3]/form/div[3]/input"));
		password.sendKeys("merimaademirnedim");
		Thread.sleep(4000);
		WebElement nickname=webDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[3]/form/div[4]/input"));
		nickname.sendKeys("meradened");
		Thread.sleep(4000);
		WebElement male=webDriver.findElement(By.cssSelector("#spol3"));
		WebElement female=webDriver.findElement(By.cssSelector("#spol1"));
		int randomizer=rand.nextInt(15);
		if (randomizer>6) {
			male.click();
		}
		else {
			female.click();
		}
		Thread.sleep(4000);
		Select locationUser=new Select(webDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[3]/form/div[6]/div/select")));
		locationUser.selectByIndex(2);
		Thread.sleep(4000);
		Select locationUser2=new Select(webDriver.findElement(By.cssSelector("#mjesto")));
		locationUser2.selectByIndex(2);
		Thread.sleep(4000);
		WebElement confirmRadio=webDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[3]/form/div[8]/div/label/input"));
		confirmRadio.click();
		Thread.sleep(2000);
		WebElement registerBtn=webDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[3]/form/div[9]/button"));
		registerBtn.click();
		Thread.sleep(10000);	
		WebElement confirmation=webDriver.findElement(By.xpath("/html/body/div[4]/h1"));
		assertTrue(confirmation.getText().contains("Za poèetak vam preporuèujemo da:"));
		Thread.sleep(4000);
	}
	
	@Test
	void login() throws InterruptedException {
		
		baseUrl="http://www.olx.ba";
		webDriver.get(baseUrl);
		WebElement loginSection=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/a[2]"));
		loginSection.click();
		Thread.sleep(4000);
		WebElement username=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[1]"));
		username.sendKeys("meradened");
		WebElement password=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[2]"));
		password.sendKeys("merimaademirnedim");
		Thread.sleep(2500);
		WebElement lgnBtn=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[4]"));
		lgnBtn.click();
		Thread.sleep(5000);
		assertEquals("https://www.olx.ba/mojpik",webDriver.getCurrentUrl());
		
	}
	
	*/
	
	/*@Test
	void CarTest() throws InterruptedException {
		
		

		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		WebElement vozila=webDriver.findElement(By.cssSelector("#headergore > div > div > div > ul > li:nth-child(4) > a"));
		vozila.click();
		Thread.sleep(2000);
		Select model=new Select(webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[1]/div[2]/div[1]/select")));
		model.selectByIndex(15);
		Thread.sleep(3000);
		Select model2=new Select(webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[1]/div[2]/div[2]/select")));
		model2.selectByIndex(12);
		Thread.sleep(2000);
		WebElement price1=webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[1]/div[3]/div[2]/input[1]"));
		price1.sendKeys("15000");
		WebElement price2=webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[1]/div[3]/div[2]/input[2]"));
		price2.sendKeys("35000");
		WebElement year1=webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[2]/div[2]/input[1]"));
		year1.sendKeys("2013");
		WebElement year2=webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[2]/div[2]/input[2]"));
		year2.sendKeys("2016");
		Select km1=new Select(webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[3]/div/select[1]")));
		km1.selectByIndex(11);
		Select km2=new Select(webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[3]/div/select[2]")));
		km2.selectByIndex(13);
		Thread.sleep(4000);
		WebElement dizel=webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[4]/div[1]/p[1]/input"));
		dizel.click();
		WebElement benzin=webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[4]/div[1]/p[2]/input"));
		benzin.click();
		Thread.sleep(3000);
		WebElement button=webDriver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[6]/div/button/span"));
		button.click();
		Thread.sleep(4000);
		WebElement sortOptions=webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div/div[1]/div/ul/li[6]/a/p"));
		sortOptions.click();
		Thread.sleep(4000);
		WebElement oldest=webDriver.findElement(By.cssSelector("#lisortiranje > div > ul > li:nth-child(3) > a"));
		oldest.click();
		Thread.sleep(4000);
		WebElement oldestCarDate=webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div/div[4]/div/div[4]/div[1]/div[2]/div[2]/div"));
		assertEquals("31.07.2021 u 13:29", oldestCarDate.getText());

		
	}
*/
	/*
	@Test
	void personalInfo() throws InterruptedException 
	
	
	{
		JavascriptExecutor js = (JavascriptExecutor) webDriver;  
		webDriver.manage().window().maximize();
		baseUrl="http://www.olx.ba";
		webDriver.get(baseUrl);
		WebElement loginSection=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/a[2]"));
		loginSection.click();
		Thread.sleep(4000);
		WebElement username=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[1]"));
		username.sendKeys("meradened");
		WebElement password=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[2]"));
		password.sendKeys("merimaademirnedim");
		Thread.sleep(2500);
		WebElement lgnBtn=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[4]"));
		lgnBtn.click();
	
		Thread.sleep(3000);
		WebElement settings=webDriver.findElement(By.cssSelector("#headergore > div > div > div > ul > li:nth-child(5) > a"));
		settings.click();
		WebElement userSettings=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/ul/li[3]/a"));
		userSettings.click();
		WebElement name=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[1]/input"));
		name.clear();
		name.sendKeys("Ado");
		Thread.sleep(2000);
		WebElement surname=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[2]/input"));
		surname.clear();
		surname.sendKeys("Adiæ");
		Thread.sleep(2000);
		Select canton=new Select(webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[3]/div/span/select")));
		canton.selectByIndex(3);
		Thread.sleep(2000);
		Select city=new Select(webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[4]/div/span/select")));
		city.selectByIndex(5);
		Thread.sleep(2000);
		WebElement postalNo=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[5]/input"));
		postalNo.clear();
		postalNo.sendKeys("77220");
		js.executeScript("window.scrollBy(0,1000)");
		Select days=new Select(webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[10]/div/span[1]/select")));
		days.selectByIndex(20);
		Select month=new Select(webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[10]/div/span[2]/select")));
		month.selectByIndex(2);
		Select year=new Select(webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[10]/div/span[3]/select")));
		year.selectByIndex(15);
		Thread.sleep(3000);
		WebElement button=webDriver.findElement(By.cssSelector("#forma_postavke > form > input.btn.s"));
		button.click();
		Thread.sleep(4000);
		WebElement confirmation=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[1]"));
		assertEquals("Uspješno ste izmijenili postavke.", confirmation.getText());
	}
	
	*/
	
	/*
	@Test
	void SavedArticlesTest() throws InterruptedException
	
	{

		webDriver.manage().window().maximize();
		baseUrl="http://www.olx.ba";
		webDriver.get(baseUrl);
		WebElement ckieSection=webDriver.findElement(By.xpath("/html/body/div[8]/p/button"));
		ckieSection.click();
		WebElement loginSection=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/a[2]"));
		loginSection.click();
		Thread.sleep(4000);
		WebElement username=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[1]"));
		username.sendKeys("meradened");
		WebElement password=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[2]"));
		password.sendKeys("merimaademirnedim");
		Thread.sleep(2500);
		WebElement lgnBtn=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[4]"));
		lgnBtn.click();
		Thread.sleep(2000);
		
		webDriver.get("https://www.olx.ba/artikal/41484446/samsung-galaxy-j7/");
		

		WebElement saveArticle=webDriver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div[2]/div[2]/div[2]/a[2]/p"));
		saveArticle.click();
		Thread.sleep(4000);
		webDriver.get("https://www.olx.ba/mojpik");
		WebElement savedArticles=webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/ul[2]/li[1]/a"));
		savedArticles.click();
		WebElement savedPhone=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/a/p"));
		assertEquals("Samsung galaxy j7", savedPhone.getText());
	}
	*/
	/*
	@Test
	void changePassword() throws InterruptedException {
		
		webDriver.manage().window().maximize();
		baseUrl="http://www.olx.ba";
		webDriver.get(baseUrl);
		WebElement loginSection=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/a[2]"));
		loginSection.click();
		Thread.sleep(4000);
		WebElement username=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[1]"));
		username.sendKeys("meradened");
		WebElement password=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[2]"));
		password.sendKeys("nedimbandzovic123");
		Thread.sleep(2500);
		WebElement lgnBtn=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[4]"));
		lgnBtn.click();
	
		Thread.sleep(3000);
		WebElement settings=webDriver.findElement(By.cssSelector("#headergore > div > div > div > ul > li:nth-child(5) > a"));
		settings.click();
		WebElement passChange=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/ul/li[9]/a"));
		passChange.click();
		WebElement currentPass=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[1]/input"));
		currentPass.sendKeys("nedimbandzovic123");
		WebElement newPass=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[2]/input"));
		newPass.sendKeys("merimaademirnedim");
		WebElement confirmNewPass=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[3]/input"));
		confirmNewPass.sendKeys("merimaademirnedim");
		Thread.sleep(5000);
		WebElement confirmButton=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/input"));
		confirmButton.click();
		Thread.sleep(5000);
		assertEquals("https://www.olx.ba/", webDriver.getCurrentUrl());
		
	}
	*/
	/*
	@Test
	
	void blockUser() throws InterruptedException {
		
		webDriver.manage().window().maximize();
		baseUrl="http://www.olx.ba";
		webDriver.get(baseUrl);
		WebElement ckieSection=webDriver.findElement(By.xpath("/html/body/div[8]/p/button"));
		ckieSection.click();
		WebElement loginSection=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/a[2]"));
		loginSection.click();
		Thread.sleep(4000);
		WebElement username=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[1]"));
		username.sendKeys("meradened");
		WebElement password=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[2]"));
		password.sendKeys("merimaademirnedim");
		Thread.sleep(2500);
		WebElement lgnBtn=webDriver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div[3]/div/div/form/input[4]"));
		lgnBtn.click();
		Thread.sleep(2000);
		webDriver.get("https://www.olx.ba/profil/ADOBAX");
		WebElement blockUserOption=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div[2]/a[5]/p"));
		blockUserOption.click();
		
		Thread.sleep(6000);
		webDriver.get("https://www.olx.ba/mojpik");
		WebElement blockedUsersList=webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/ul[2]/li[5]/a"));
		blockedUsersList.click();
		Thread.sleep(3000);
		WebElement user=webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/table/tbody/tr/td[1]/a"));
		Thread.sleep(3000);
		assertEquals("ADOBAX", user.getText());
		
	}
	*/
	
	
	
}
