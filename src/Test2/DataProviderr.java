package Test2;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderr {

	@Test(dataProvider="getdata")
	public void m1(String username, String password) {
		System.out.println("Print m1");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getdata() {
		//1. username,password with good combination
		//2. username, password w/o no combination
		//3. fraud data
		Object ar[][] = new Object[3][2];
		// first
		ar[0][0]= "firstusername";
		ar[0][1]=  "firstPassword";
		//second
		ar[1][0]= "secondusername";
		ar[1][1]= "secondpassword ";
		//third
		ar[2][0]= "thirdusername";
		ar[2][1]= "thirdpassword";
		
		return ar;
	}
}
