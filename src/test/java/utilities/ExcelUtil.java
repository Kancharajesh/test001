package utilities;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	
	
public static void main(String[] args) 
{
	getRowCount();
}
		
	public static void getRowCount()
	{
		try
		{
	String projectpath = System.getProperty("user-dir");
	XSSFWorkbook workbook = new XSSFWorkbook("excel/Mobile_Data.xlsx");
	XSSFSheet sheet= workbook.getSheet("sheet1");
	int rowcount = sheet.getPhysicalNumberOfRows();
	System.out.println("No of rows  :"+rowcount);
	
	int rowc=sheet.getLastRowNum()+1;
	for(int i=0; i<=rowc; i++)
	{
		String s=sheet.getRow(1).getCell(i).getStringCellValue();
	}
		
		}
	catch(Exception exp)
	{
		System.out.println(exp.getCause());
		System.out.println(exp.getMessage());
		exp.printStackTrace();
		
	}
	
	}
	
}

