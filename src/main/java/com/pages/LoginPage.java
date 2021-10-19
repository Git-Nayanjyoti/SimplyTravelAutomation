package com.pages;

import org.openqa.selenium.By;

import com.base.Base;

public class LoginPage extends Base {

	public void clickProfileIcon() {
		driver.findElement(By.id("dropdownMenuButton")).click();
	}

	public void SelectLogin() {
		driver.findElement(By.xpath("/html/body/header/nav/div[2]/div/div/a[3]")).click();
	}

	public void enterUser(String name, String pass) throws InterruptedException {
		driver.findElement(By.id("first_name")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.id("icon_telephone")).sendKeys(pass);
		Thread.sleep(2000);
	}

	public void clickLogin() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[4]/button")).click();
		Thread.sleep(3000);
		closeDriver();
	}
}
