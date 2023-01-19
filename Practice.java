package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
public static void main(String[] args) {
	
	//DROP_DOWN
	
	WebDriver w=new ChromeDriver();
	w.get("https://letcode.in/dropdowns");
	w.manage().window().maximize();

	WebElement fruit = w.findElement(By.id("fruits"));
	fruit.click();
	Select s=new Select(fruit);
	s.selectByIndex(4);
	System.out.println(fruit.getText());
	System.out.println("*****************************************");
	
	WebElement sup = w.findElement(By.xpath("//select[@id='superheros']"));
	Select s1=new Select(sup);
	s1.selectByIndex(1);
	s1.selectByValue("cm");
	s1.selectByVisibleText("Do ctor Strange");
	
	WebElement first = s1.getFirstSelectedOption();
	System.out.println(first.getText());
	System.out.println("******************************************");
	
	
	
	List<WebElement> all = s1.getAllSelectedOptions();
	for (WebElement web : all) {
		System.out.println(web.getText());
	}
	System.out.println("******************************************");
	
	List<WebElement> options = s1.getOptions();
	for (WebElement ops : options) {
		System.out.println(ops.getText());
	}
	System.out.println("******************************************");
	
	
	
	WebElement lang = w.findElement(By.xpath("//select[@id='lang']"));
	lang.click();
	Select s2=new Select(lang);
	s2.selectByValue("py");
	
	WebElement country = w.findElement(By.xpath("//select[@id='country']"));
	country.click();
	Select s3=new Select(country);
	s3.selectByVisibleText("India");
	
	WebElement cource = w.findElement(By.xpath("//a[contains(@class,'navbar-link')]"));
	cource.click();
	Select s4=new Select(cource);
	s3.selectByVisibleText("Selenium-Java");
	
	
}
}

