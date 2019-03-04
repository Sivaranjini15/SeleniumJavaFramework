package utils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		
		//getRowCount();
		getCellData();
	}

	public static void getRowCount() {
		
		try {
			 projectPath = System.getProperty("user.dir");
		 workbook = new XSSFWorkbook(projectPath+"/excel/data.xlsx");
	 sheet = workbook.getSheet("Sheet 1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		

	}

	public static void getCellData() {
		
		try {
		projectPath = System.getProperty("user.dir");
		 workbook = new XSSFWorkbook(projectPath+"/excel/data.xlsx");
	 sheet = workbook.getSheet("Sheet 1");
	 String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
	 System.out.println(cellData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		
	}
	
	}
}
