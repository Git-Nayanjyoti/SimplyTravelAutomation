package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class SearchFlights extends Base {

	public void selectOneWay() {
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[1]")).click();
	}

	public void selectDepartureCity(String city) throws InterruptedException {
		driver.findElement(By.id("departure_cities")).click();
		Thread.sleep(2000);
		List<WebElement> cities = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[1]/div"))
				.findElements(By.tagName("a"));
		for (int item = 0; item < cities.size(); item++) {
			if (cities.get(item).getText().equals(city)) {
				cities.get(item).click();
				break;
			}
		}
	}

	public void selectArivialCity(String city) throws InterruptedException {
		driver.findElement(By.id("arraival_cities")).click();
		Thread.sleep(2000);
		List<WebElement> cities = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[1]/div"))
				.findElements(By.tagName("a"));
		for (int item = 0; item < cities.size(); item++) {
			if (cities.get(item).getText().equals(city)) {
				cities.get(item).click();
				break;
			}
		}
	}

	public void DepartDate(String date) throws InterruptedException {
		driver.findElement(By.id("departure")).click();
		List<WebElement> dateOptions = driver
				.findElement(By.xpath(
						"/html/body/div/div/div[1]/div[2]/div[3]/div[1]/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"))
				.findElements(By.tagName("tr"));
		Thread.sleep(2000);
		for (int i = 0; i < dateOptions.size(); i++) {
			for (int j = 0; j <= dateOptions.size(); j++) {
				WebElement findDate = driver.findElement(By
						.xpath("/html/body/div/div/div[1]/div[2]/div[3]/div[1]/div/div[2]/div[1]/div[2]/table/tbody/tr["
								+ i + "]/td[" + j + "]"));
				if (findDate.getText().equals(date)) {
					findDate.click();
					break;
				}
			}
		}
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[3]/div[1]/div/div[2]/div[2]/div/button[2]"))
				.click();
	}

	public void PassengerNo(String adults, String child, String infants, String Class) throws InterruptedException {
		driver.findElement(By.id("travellerAndClass")).click();
		Thread.sleep(2000);
		List<WebElement> adultno = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[5]/div[2]/div/div[2]/div/ul[1]"))
				.findElements(By.tagName("li"));
		for (int item = 0; item < adultno.size(); item++) {
			if (adultno.get(item).getText().equals(adults)) {
				adultno.get(item).click();
			}
		}
		Thread.sleep(2000);
		List<WebElement> childno = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[5]/div[2]/div/div[2]/div/ul[2]"))
				.findElements(By.tagName("li"));
		for (int item = 0; item < childno.size(); item++) {
			if (childno.get(item).getText().equals(child)) {
				childno.get(item).click();
			}
		}
		Thread.sleep(2000);
		List<WebElement> infantno = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[5]/div[2]/div/div[2]/div/ul[3]"))
				.findElements(By.tagName("li"));
		for (int item = 0; item < infantno.size(); item++) {
			if (infantno.get(item).getText().equals(infants)) {
				infantno.get(item).click();
			}
		}
		Thread.sleep(2000);
		List<WebElement> travelclass = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[5]/div[2]/div/div[2]/div/ul[4]"))
				.findElements(By.tagName("li"));
		for (int item = 0; item < travelclass.size(); item++) {
			if (travelclass.get(item).getText().equals(Class)) {
				travelclass.get(item).click();
			}
		}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[5]/div[2]/button")).click();
	}

	public void clickSearch() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/button")).click();
		Thread.sleep(3000);
		closeDriver();
	}

}
