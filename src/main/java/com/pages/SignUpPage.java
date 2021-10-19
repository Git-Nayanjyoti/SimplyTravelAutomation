package com.pages;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class SignUpPage extends Base{

	public void clicksignup() throws InterruptedException {
		driver.findElement(By.id("dropdownMenuButton")).click();
		driver.findElement(By.xpath("/html/body/header/nav/div[2]/div/div/a[4]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void enterName(String Name) {
		driver.findElement(By.id("name")).sendKeys(Name);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void enterEmail(String email) {
		driver.findElement(By.id("emailid")).sendKeys(email);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void enterPhoneNo(String phoneNo) {
		driver.findElement(By.id("phone")).sendKeys(phoneNo);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void Address(String Address) {
		driver.findElement(By.id("address")).sendKeys(Address);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void AgeGroup(String Age) throws InterruptedException {
		List<WebElement> options = driver.findElement(By.xpath("//*[@id=\"formid\"]/div[3]/div[1]/div"))
				.findElements(By.tagName("div"));
		
		int age = Integer.parseInt(Age);
		if(age < 25) {
			options.get(0).clear();
		}else if(age > 25 && age <= 55) {
			options.get(1).click();
		}else if(age > 55){
			options.get(2).click();
		}
		Thread.sleep(2000);
	}
	
	public void SelectGender(String gender) throws InterruptedException {
		List<WebElement> options = driver.findElement(By.xpath("//*[@id=\"formid\"]/div[3]/div[2]/div"))
				.findElements(By.tagName("div"));
		for (int item = 0; item <= options.size(); item++) {
			if(options.get(item).getText().equals(gender)) {
				options.get(item).click();
				break;
			}
		}
		Thread.sleep(2000);
	}
	
	public void Hobbies(String hobbies) throws InterruptedException {
		List<WebElement> options = driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[4]/div[1]/div"))
				.findElements(By.tagName("div"));
		for (int item = 0; item <= options.size(); item++) {
			if(options.get(item).getText().equals(hobbies)) {
				options.get(item).click();
				break;
			}
		}
		Thread.sleep(2000);
	}
	
	public void Interests(String interest) throws InterruptedException {
		List<WebElement> options = driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[4]/div[2]/div"))
				.findElements(By.tagName("div"));
		for (int item = 0; item <= options.size(); item++) {
			if(options.get(item).getText().equals(interest)) {
				options.get(item).click();
				break;
			}
		}
		Thread.sleep(2000);
	}
	
	public void EnterPassword(String pass) {
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
	
	public void ReEnterPassword(String cpass) {
		driver.findElement(By.id("cpass")).sendKeys(cpass);
	}
	
	public void clickRegister() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"btnid\"]/button"))
		.click();
		Thread.sleep(3000);
		closeDriver();
	}
}
