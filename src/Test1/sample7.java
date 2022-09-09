package Test1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample7 {
	@Test
	public void sampple701() {
		System.out.println("sample701");
	}
	@Test
	public void sample702() {
		System.out.println("sample702");
	}
	@Test
	public void sample703() {
		System.out.println("sample703");
	}
	@Test
	public void sample704() {
		System.out.println("sample704");
	}
	@BeforeTest
	public void sample705() {
		System.out.println("Beforetest print me before any 700");
	}
}
