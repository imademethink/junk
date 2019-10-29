import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelTest
{
    public FileInputStream fis = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public Row row = null;
    public Cell cell = null;

    public void getExcelPath(String xlFilePath) throws IOException {
        fis = new FileInputStream(xlFilePath);
        workbook = new XSSFWorkbook(fis);
        fis.close();
    }

    public String getCellData(String sheetName, int rowNo, int colno)
    {
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rowNo);
        cell = row.getCell(colno);
        if (cell.getCellType() == CellType.STRING)
        {
            return cell.getStringCellValue();
        }
        else
        {
            return String.valueOf(cell.getNumericCellValue()); // get numeric value,Convert int into string and return
        }
    }


}
