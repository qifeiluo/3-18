package hanjia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo3 {
	static WebDriver driver;
	static String url;
	@BeforeTest
	public  void setup()
	{
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/shop1/";
	}
	@Test
	public void login() {
		/*
		�����������
		��¼--�����������--�������
		 */
		driver.get(url);
		//�����û����������¼
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();		
	}
	@Test
	public void yijian() {
		//����������
		driver.findElement(By.linkText("�������")).click();
		//�������
		driver.findElement(By.name("c_message")).sendKeys("��������");
		driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
	}
}
