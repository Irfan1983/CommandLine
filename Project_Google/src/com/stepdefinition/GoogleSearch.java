package com.stepdefinition;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.utility.PropertiesReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	
	
	PropertiesReader obj=new PropertiesReader();
	
	
	
	@Given("^open browser$")
	public void open_chrome_browser_and_enter_url() throws Throwable 
	{
		System.out.println("open browser");
	    System.out.println();
	    //WebDriverManager.edgedriver().setup();   
		// EdgeDriver driver = new EdgeDriver();

		 //  Properties properties=obj.getProperty();
		  // driver.get(properties.getProperty("BaseURL"));	
		  //System.out.println(properties.getProperty("BaseURL"));
		  // Thread.sleep(5000);
	    System.out.println("Executed from command line");
	}
	
	
	@Then("^Enter criteria$")
	public void Entercriteria() 
	{
		//driver.findElement(By.xpath(null))
	}
}
