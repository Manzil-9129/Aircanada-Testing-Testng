package Data;

import Utilities.Xls_Reader;

public class AircanadaData {



	 static Xls_Reader xl=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\XlsProject(full)\\Sheet1.xlsx");
	public static String depart=xl.getCellData("Sheet1",0,8);
	public static String arrival=xl.getCellData("Sheet1",1,8);
     

	
	
	
}
