package com.bdd.magicbricks.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentPage {

	private WebDriver driver;
	
	private By rentlink=By.xpath("//a[.='Rent']");
	
	public RentPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getTitle() {
	return driver.getTitle();
	}
	
	public void clickonRentLink() {
		driver.findElement(rentlink).click();
	}

}
