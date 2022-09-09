package Test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample1 {

	// beforemethod is used to execute before every method in same class
	@BeforeMethod
	public void sample107() {
		System.out.println("I will execute before every method in sample1");
	}
	// aftermethod is used to execute after every method in same class
	@AfterMethod
	public void sample108() {
		System.out.println("I will execute afetr every method in sample1");
	}
	
	@Test
	public void sample101() {
		System.out.println("sample101");
		
	}
	//if we want to execute test case after execution of any test in present class, will use @AfterTest annotation
	@AfterTest
	public void sample104() {
		System.out.println(" Aftertest Print me at the last of 100");
	}
	@Test(groups= {"smoke"})
	public void sample102() {
		System.out.println("sample102");
	}
	// if we want to execute test case before execution of any test in present class, will use @BeforeTest annotation
	@BeforeTest 
	
		public void sample103() {
			System.out.println("Beforetest First print me before 100");
		}
	//used to execute at the start first of suite
	@BeforeSuite
	public void sample105() {
		System.out.println(" Beforesuite i will print first of starting");
	}
	// used to execute at the end of suite
	@AfterSuite
	public void sample106() {
		System.out.println(" Aftersuite i will execute at the last of this suite");
	}
	@Parameters({"URL"})
	@Test
	public void sample10(String uname) {
		System.out.println("Enter parameter url");
		System.out.println(uname);
	}
	
	// sequence
	//1. @beforesuite
	//2. @beforeclass
	//3. @beforemethod
	//4.@test
	//5. @aftermethod
	//5.@afterclass
	//6. @aftersuite
	}

