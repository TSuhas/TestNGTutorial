package Test1;

import org.testng.annotations.Test;

public class sample2 {

	@Test
	public void sample201() {
		System.out.println("sample201");
	}
	@Test(groups= {"smoke"})
	public void sample202() {
		System.out.println("sample202");
	}
}
