package com.pages;

import org.openqa.selenium.By;

import com.base.Base;

public class BookFlight extends Base{
	public void selectFlight() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div[1]/div/div/div/div[4]/div[2]/a[1]"))
		.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[5]/p/a"))
		.click();
	}
	
	
	public void enterContactInfo(String mobile, String mail) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/form/div[4]/div/div/div[1]/div/input"))
		.sendKeys(mobile);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/form/div[4]/div/div/div[2]/div/input"))
		.sendKeys(mail);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/form/div[6]/div/div/a"))
		.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[4]/div[2]/a"))
		.click();
		
	}
	
	public void clickFinishPayment() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div[1]/div[2]/div/form/div/div[2]/div/p/a"))
		.click();
		Thread.sleep(3000);
		closeDriver();
	}
}
