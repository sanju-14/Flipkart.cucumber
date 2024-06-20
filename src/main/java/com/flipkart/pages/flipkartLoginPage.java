package com.flipkart.pages;

import org.openqa.selenium.By;

public class flipkartLoginPage{
	
	
	public static By slturl = By.xpath("//*[contains(text(),'Online Shopping Site for Mobiles, Electronics, Furniture ...')]");
	public static By userName = By.xpath("(//*[@type='text'])[2]");
	public static By Password = By.xpath("//*[@type='password']");
	public static By Login = By.xpath("(//button[@type='submit'])[2]");
	public static By searchMobile = By.xpath("//input[@placeholder='Search for products, brands and more']");
	public static By clksearch = By.xpath("//button[@class='L0Z3Pu']");
	public static By sltmobile = By.xpath("//*[contains(text(),'SAMSUNG Galaxy F13 (Sunrise Copper, 64 GB)')]");
	public static By btnbuyNow = By.xpath("//*[text()='BUY NOW']");
	public static By btnDeliver = By.xpath("//*[contains(text(),'Deliver Here')]");
	public static By btncontinue = By.xpath("//*[contains(text(),'CONTINUE')]");
	public static By btnAcceptcontinue = By.xpath("//*[contains(text(),'Accept & Continue')]");
	public static By rdobtncashondelivery = By.xpath("(//div[@class='_1XFPmK'])[7]");
	public static By rdobtncashondelivery1 = By.xpath("//*[@id=\"px-captcha\"]");
		
	
}
