package Data;

import Utilities.Xls_Reader;

public class LoginData {
  
	static Xls_Reader xl=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\XlsProject(full)\\Sheet1.xlsx");
	public static String email=xl.getCellData("Sheet1",0,9);
    public static String password=xl.getCellData("Sheet1",1,9);
	
}
