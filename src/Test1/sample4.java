package Test1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class sample4 {

	@Test
	public void sampple401() {
		System.out.println("sample401");
	}
	@Test
	public void sample402() {
		System.out.println("sample402");
	}
	@AfterTest
	public void sample405() {
		System.out.println("Aftertest Print me after 400");
	}
	@Test
	public void sample403() {
		System.out.println("sample403");
	}
	@Test
	public void sample404() {
		System.out.println("sample404");
	}
}
