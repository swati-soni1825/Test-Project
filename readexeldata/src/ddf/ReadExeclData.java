package ddf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExeclData {

	public static void main(String[] args) throws IOException {
      FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir")+"\\newpage.xlsx"));
      
      XSSFWorkbook workbook = new XSSFWorkbook(file);
      XSSFSheet sheet = workbook.getSheetAt(0);
      String fname = sheet.getRow(0).getCell(0).getStringCellValue();
      System.out.println(fname);
      System.out.println("pass");
      
   // 1 denotes to Second row and 0 denotes first cell of the excel sheet.
   		Number num = sheet.getRow(1).getCell(0).getNumericCellValue();
   		System.out.println("Number Fecth from Excel:- "+num);
      file.close();
	}
	

}
