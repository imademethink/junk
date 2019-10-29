import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;


public class ReadExcelData
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("D:\\JavaSelenium\\sample.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFRow row = sheet.getRow(1);
        XSSFCell cell = row.getCell(0);

        String name = String.valueOf(cell.getStringCellValue());
        System.out.println("Value from the Excel sheet :"+ name);
    }
}