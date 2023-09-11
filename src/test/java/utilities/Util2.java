package utilities;


	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Util2 {
		
		
		
	public static void main(String[] args) 
	{
		getRowCount();
	}
			
		public static void getRowCount()
		{
			try
			{
		String projrctpath = System.getProperty("user-dir");
		XSSFWorkbook workbook = new XSSFWorkbook("excel/Mobile_Data.xlsx");
		XSSFSheet sheet= workbook.getSheet("sheet1");
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows  :"+rowcount);
		
			}
		catch(Exception exp)
		{
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			
		}
		
		}
		
	}


