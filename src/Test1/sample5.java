package Test1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample5 {

	@Test
	public void sampple501() {
		System.out.println("sample501");
	}
	@Test(timeOut=2000)   // used to give some delay to execute the test case
	public void sample502() {
		System.out.println("sample502");
	}
	@AfterTest(enabled=false)// enabled function is used when when we want to skip perticular test. it will not executed.
	// and if change false to true, it will execute again.
	public void sample506() {
		System.out.println("Aftertest print me at the last odf 500");
	}
	@Test(dependsOnMethods= {"sampple501"})   // dependonmethods is used to execute first method is given, after that it will execute current method
	public void sample503() {
		System.out.println("sample503");
	}
	@BeforeTest
	public void sample505() {
		System.out.println("Beforetest print me before 500");
	}
	@Test(dependsOnMethods= {"sampple501"})
	public void sample504() {
		System.out.println("sample504");
	}
}
