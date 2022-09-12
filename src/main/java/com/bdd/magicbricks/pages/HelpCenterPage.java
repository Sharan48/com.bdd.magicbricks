package com.bdd.magicbricks.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HelpCenterPage {

	private WebDriver driver;
	
	private By helplink=By.xpath("//a[.='Help ']");
	private By helpcenter=By.xpath("//span[.='Help Center']");
	
	public HelpCenterPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnHelpCenter() {
		Actions action=new Actions(driver);
		action.moveToElement((WebElement) helplink).perform();
		driver.findElement(helpcenter).click();
	}

}
