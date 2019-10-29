//import java.io.File;
//import java.io.FileInputStream;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
////import org.apache.poi.*;
//import java.io.*;
//import java.util.*;
//import com.opencsv.CSVWriter;
//
//public class excel2csv {
//
//    public static final String FILE_NAME_1 = "D:/ethans/excel_assign/file1.xlsx";
//    public static final String FILE_NAME_2 = "D:/ethans/excel_assign/file2.xlsx";
//    public static File file = new File("D:/ethans/excel_assign/target.csv");
//public static void excel2csv(String filename) throws IOException {
//    FileWriter outputfile = new FileWriter(file);
//    CSVWriter writer = new CSVWriter(outputfile);
//
//    FileInputStream excelFile = new FileInputStream(new File(filename));
//    XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
//    XSSFSheet datatypeSheet = workbook.getSheetAt(0);
//        for (int m = 0; m < datatypeSheet.getLastRowNum(); m++){
//        XSSFRow xcell = datatypeSheet.getRow(m);
//        for (int k=0 ; k< xcell.getLastCellNum(); k++){
//            //System.out.println(row.getCell(k));
//            //String[] csvdata = new String[2];
//            String[] xlval = new String[2];
//            //(xcell.getCell(m,k));
//            //csvdata[i]= cell.getStringCellValue()
//            xlval[m,k] = xcell.getStringCellValue();
//            //Cell cell = sheet.getCell(m, k);
//            writer.writeNext(xlval);
//        }
//    }
//        }
//
//    public static void main(String[] args) throws Exception {
//        excel2csv(FILE_NAME_1);
//        excel2csv(FILE_NAME_2);
//
//    }
//}
