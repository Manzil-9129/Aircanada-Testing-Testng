package Data;

import java.util.ArrayList;

import Utilities.Xls_Reader;

public class AircanadaData {

     
   
	Xls_Reader xl=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\XlsProject(full)\\Sheet1.xlsx");
	public String column=xl.getCellData("Sheet1",1,8);
	public String row=xl.getCellData("Sheet1",0,8);
	
  
	
     }

	
   

