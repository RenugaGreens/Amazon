package org.data;

import java.util.Date;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {

	public static WebDriver driver;

	@Test
	private void tc1() {

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	@Parameters({ "username", "Password" })
	@Test
	private void tc2(@Optional("greens@gmail.com") String email,@Optional("greens") String pass) {

		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(email);

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);

		driver.findElement(By.name("login")).click();

	}

	@BeforeMethod
	private void bef() {

		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void aft() {

		Date d = new Date();
		System.out.println(d);
	}

	@BeforeClass
	private void befCls() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@AfterClass
	private void aftCls() {

		driver.quit();
	}
}
