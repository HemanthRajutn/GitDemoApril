package TestNG;
import org.testng.annotations.DataProvider;
//run yytest with multiple dtata
import org.testng.annotations.Test;

public class day4_Home_loan {
	
 @Test(dataProvider="dataprovidermethod")//calling the data from the dataprovider
 public void WebloaginHomeloan(String urname, String password)
 {
	 System.out.println(urname);

	 System.out.println(password);
 }
 
 
 @DataProvider
 public Object[][] dataprovidermethod()
 {
	 //1st combination usrname password
	 //2nd combin 
	 //3rd combination
	 Object[] [] data = new Object[3] [2];  //defining the multidimentional array
	 data[0] [0] = "fistUsername";
	 data[0] [1] = "fistpassword";
	// 2nd row
	 data[1] [0] = "secndUsername";
	 data[1] [1] = "secnpassword";
	 //3rd row
	 data[2] [0] = "thirdUsername";
	 data[2] [1] = "thirdpassword";
	 return data;
 }
 
}
