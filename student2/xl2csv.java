//
//import java.io.FileInputStream;
//import java.io.*;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.ss.usermodel.*;
//import java.util.Iterator;
//import java.io.FileWriter;
//import com.opencsv.CSVWriter;
////import com.bytecode.opencsv.CSVWriter;
//    public class xl2csv {
//        public static void main(String[] args) throws Exception{
//            //First we read the Excel file in binary format into FileInputStream
//            FileInputStream input_document = new FileInputStream(new File("D:/ethans/excel_assign/file1.xlsx"));
//            // Read workbook into HSSFWorkbook
//            HSSFWorkbook my_xls_workbook = new HSSFWorkbook(input_document);
//            // Read worksheet into HSSFSheet
//            HSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0);
//            // To iterate over the rows
//            Iterator<Row> rowIterator = my_worksheet.iterator();
//            // OpenCSV writer object to create CSV file
//            FileWriter my_csv=new FileWriter("D:/ethans/excel_assign/target.csv");
//            CSVWriter my_csv_output=new CSVWriter(my_csv);
//            //Loop through rows.
//            while(rowIterator.hasNext()) {
//                Row row = rowIterator.next();
//                int i=0;//String array
//                //change this depending on the length of your sheet
//
//                Iterator<Cell> cellIterator = row.cellIterator();
//                while(cellIterator.hasNext()) {
//                    Cell cell = cellIterator.next(); //Fetch CELL
//                    //switch(cell.getCellType()) { //Identify CELL type
//                        //you need to add more code here based on
//                        //your requirement / transformations
//                      //  case Cell.CELL_TYPE_STRING:
//                    String[] csvdata = new String[2];
//                           csvdata[i] = cell.getStringCellValue();
//                            //break;
//                                        my_csv_output.writeNext(csvdata[i]);
//                    i=i+1;
//                                    }
//
//            }
//            my_csv_output.close(); //close the CSV file
//            //we created our file..!!
//            input_document.close(); //close xls
//        }
//    }