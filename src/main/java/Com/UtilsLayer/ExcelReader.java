package Com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public ExcelReader(){
		File f=new File("C:\\Users\\ADMIN\\Music\\Book1.xlsx");
		System.out.println(f.exists());
		try {
			
			fis=new FileInputStream(f);
			wb =new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public String getData(int index ,int row, int col) {
			sheet=wb.getSheetAt(index);
			String data=sheet.getRow(row).getCell(col).getStringCellValue();
			return data;
			
			
		}
		
	}
	
	
	
	
	
	

