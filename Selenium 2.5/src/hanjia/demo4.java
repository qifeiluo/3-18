package hanjia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo4 {
	static WebDriver driver;
	static String url;
	@BeforeTest
	public  void setup()
	{
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/shop1/admin/index.jsp";
	}
	@Test
	public void login() {
	/*
	 * ��̨��
		һ�����һ����Ʒ������
		����ɾ������
		������������
	 */	
		driver.get(url);
		//��¼��̨
		driver.findElement(By.name("a_name")).sendKeys("admin");
		driver.findElement(By.name("a_pass")).sendKeys("admin");
		driver.findElement(By.name("submit2")).click();
	}
	@Test(dependsOnMethods= "login")
	public void lei() {
		//�����Ʒ������
		driver.switchTo().frame(0);
		driver.switchTo().frame("Left");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a")).click();
		//�����������
		driver.switchTo().parentFrame();
		driver.switchTo().frame("Rigth");
		driver.findElement(By.name("t_name")).sendKeys("С����");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();
	}
	@Test(dependsOnMethods= "lei")
	public void dingdan() {
		driver.switchTo().parentFrame();
		//���붩������
		driver.switchTo().frame("Left");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td/span/a")).click();
		//���ɾ��
		driver.switchTo().parentFrame();
		driver.switchTo().frame("Rigth");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[6]/span/a")).click();		
	}
	@Test(dependsOnMethods= "dingdan")
	public void gonggao() {
		driver.switchTo().parentFrame();
		//���빫�����
		driver.switchTo().frame("Left");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/span/a")).click();
		//������Ϣ����
		driver.switchTo().parentFrame();
		driver.switchTo().frame("Rigth");
		driver.findElement(By.name("n_message")).sendKeys("���ٿ���");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();
	}
}
