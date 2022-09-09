package Test1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample3 {

	@Test
	public void sampple301() {
		System.out.println("sample301");
	}
	@Test
	public void sample302() {
		System.out.println("sample302");
	}
	@Test(groups= {"smoke"})
	public void sample303() {
		System.out.println("sample303");
	}
	@Test
	public void sample304() {
		System.out.println("sample304");
	}
	@BeforeTest
	public void sample305() {
		System.out.println(" Beforetest print me before any 300");
	}
 }
