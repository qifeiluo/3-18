package hanjia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {
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
		 * ��������aaaaaa
			��¼--�����������--ȷ������
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
		//�������ר��
		driver.findElement(By.xpath("/html/body/center[2]/table/tbody/tr/td[2]/span/a")).click();
		//ѡ����Ʒ����		
		driver.findElement(By.name("see")).click();
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
		//ѡ�񸶿ʽ
		WebElement s=driver.findElement(By.name("pay_fangshi"));
		Select s1=new Select(s);
		s1.selectByVisibleText("����֧��");		
		driver.findElement(By.name("pay_address")).sendKeys("����");
		driver.findElement(By.name("pay_email")).sendKeys("@169.com");
		//ȷ�ϸ���
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
	}
}
