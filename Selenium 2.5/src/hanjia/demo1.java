package hanjia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo1 {
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
	public void sousuo() {
		/*
		 * ǰ̨��
		һ������
		����Ʒ��������
		����Ʒ������
		����Ʒ���ͺ���Ʒ����ȷ����
		 */
		driver.get(url);
		//ѡ����Ʒ����
		WebElement a=driver.findElement(By.name("select_type"));
		Select s1=new Select(a);
		s1.selectByVisibleText("����ר��");
		//������Ʒ��
		driver.findElement(By.name("select_p_name")).sendKeys("����");
		//�������
		driver.findElement(By.name("Submit")).click();
	
	}
	
}
