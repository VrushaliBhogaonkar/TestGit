package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class LoginPage 
{
	FileInputStream finput;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	 String userId;
	String Psw;
	
	@Test
	public void HitUrl()
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32_B39\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://console-uat.kapittx.com/#");
          
          
        File src=new File("C:\\Users\\vrush\\Desktop\\LoginKapittx.xlsx"); 
  	    
  		try {
			finput = new FileInputStream(src);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

  	    try 
  	    {
  			workbook = new XSSFWorkbook(finput);
  		} catch (IOException e) 
  	    {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  	     sheet= workbook.getSheetAt(0);
  	      row = sheet.getRow(0);
  	     
  	     int rowCnt=sheet.getLastRowNum()+1;
  	     System.out.println("Row count is:"+rowCnt);
  	     
  	     int colCnt=row.getLastCellNum();
  	     System.out.println("Col count is:"+colCnt);
  	     
  	     for(int i=1;i<rowCnt;i++)
  	     {
  	       
  	    	 row = sheet.getRow(i); 
  	    	 
  	    	for(int j=0;j<colCnt;j++)
  	    	{
  	    		userId=row.getCell(j).getStringCellValue();
//  	    		System.out.println("UserId is "+userId);

  	    		Psw=row.getCell(j).getStringCellValue();
//  	    		System.out.println("Psw is "+Psw);
  	    	}
  	    
  	    	driver.findElement(By.id("email")).sendKeys("Vrushali@kapittx.com");
  		    driver.findElement(By.id("password")).sendKeys("VrushaliB@29");
  		    driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-flat']")).click();
  		    
  	    		
  	     }
  	     

          
        
	}	

}
