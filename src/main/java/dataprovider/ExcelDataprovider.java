package dataprovider;

import java.io.IOException;

/*import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/
import org.testng.annotations.DataProvider;

public class ExcelDataprovider {

	/*@DataProvider(name="data1")
	public Object[][] ReadExcel(String fileName) throws IOException {
		Object[][] exceldata = ReadExcel("Testdata");
		return exceldata;*/
		
		
		@DataProvider(name = "data1")
		public Object[][] ReadExcel() throws IOException {
			ReadExcel rExcel = new ReadExcel();
			return rExcel.readExcel("Testdata");
		
		
		
		
		
	}	
}
		
		
	
	

