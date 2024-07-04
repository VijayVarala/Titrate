package com.titrate.testCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.*;

import com.titrate.utilities.Capture;
public class demo {
	public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("http://183.82.108.168/");
    Thread.sleep(2000);
	driver.findElement(By.id("userid")).sendKeys("manohar");
	driver.findElement(By.id("password")).sendKeys("Mitti@123");
	driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
    Thread.sleep(2000);
    Capture.CaptureScreenshot(driver, "img1.png");
    driver.findElement(By.xpath("//*[@data-testid=\'MenuIcon\']")).click();
    Thread.sleep(2000);
    Capture.CaptureScreenshot(driver, "img2.png");
	driver.findElement(By.xpath("(//p[@class=\'MuiTypography-root MuiTypography-body1 css-197tr25-MuiTypography-root\'])[8]")).click();
	Thread.sleep(15000);
	Capture.CaptureScreenshot(driver, "img3.png");
//	driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
//	
//	driver.findElement(By.xpath("(//div[@role='combobox'])[1]")).click();
//	
//	driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
//	
//    driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).click();
//	
//	driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@name='min_stock']")).sendKeys("777");
//	
//	driver.findElement(By.xpath("//input[@name='max_stock']")).sendKeys("777");
//
//	
//	driver.findElement(By.xpath("//input[@name='available_stock']")).sendKeys("777");
//	
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
	
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	File temp=ts.getScreenshotAs(OutputType.FILE);
//	File perm =new File("./Screenshot/ss.png");
//	FileHandler.copy(temp,perm);
//	
	
	
driver.quit();
	}
}


