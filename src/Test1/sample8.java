package Test1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample8 {
	@Test
	public void sampple801() {
		System.out.println("sample801");
	}
	@Test
	public void sample802() {
		System.out.println("sample802");
	}
	@AfterTest
	public void sample806() {
		System.out.println("Aftertest print me at the last odf 800");
	}
	@Test
	public void sample803() {
		System.out.println("sample803");
	}
	@BeforeTest
	public void sample805() {
		System.out.println("Beforetest print me before 800");
	}
	@Test
	public void sample804() {
		System.out.println("sample804");
	}
}
