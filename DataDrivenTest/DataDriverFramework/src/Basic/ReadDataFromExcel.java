package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadDataFromExcel
{
	
//	FileInputStream finput;
//	HSSFWorkbook workbook;
//	HSSFSheet sheet;
//	HSSFRow row;
	
//	public void readRegistartionData(String country,String FName,String LName,String Email,String Psw,String rePsw,String Phone) throws FileNotFoundException
//	{
//		File src=new File("C:\\Users\\Admin\\Desktop\\TestData.xls"); 
//	    finput = new FileInputStream(src);
//	    
//	    try 
//	    {
//			workbook = new HSSFWorkbook(finput);
//		} catch (IOException e) 
//	    {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	     sheet= workbook.getSheetAt(0);
//	      row = sheet.getRow(0);
//	     
//	     int rowCnt=sheet.getLastRowNum()+1;
//	     System.out.println("Row count is:"+rowCnt);
//	     
//	     int colCnt=row.getLastCellNum();
//	     System.out.println("Col count is:"+colCnt);
//	}

}
