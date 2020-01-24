package ClassObject;



     import java.io.BufferedReader;
     import java.io.FileNotFoundException;
     import java.io.FileReader;
     import java.io.IOException;
     import java.io.File;
     import java.io.FileInputStream;


     import org.apache.poi.xssf.usermodel.XSSFRow;
     import org.apache.poi.xssf.usermodel.XSSFSheet;
     import org.apache.poi.xssf.usermodel.XSSFWorkbook;

     public class CompareCSVExcel {
    	 private static final String FILE_NAME = "D:\\Excelcheck.xlsx";
     public static void main(String[] args) throws Exception{

    	 // csv reading code
    	 int [] csvarray=new int [12];
        String csvFile = "D:\\abcd.CSV";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int csvaryindex = 0;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] numberline = line.split(cvsSplitBy);
//                System.out.println(numberline[0]);
//                System.out.println(numberline[1]);
//                System.out.println(numberline[2]);
//                System.out.println(numberline[3]);

                csvarray[csvaryindex++] = Integer.valueOf(numberline[0]);
                csvarray[csvaryindex++] = Integer.valueOf(numberline[1]);
                csvarray[csvaryindex++] = Integer.valueOf(numberline[2]);
                csvarray[csvaryindex++] = Integer.valueOf(numberline[3]);
            }
        
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            for (int i=0; i < csvarray.length; i++) {
            System.out.println(csvarray[i]);	
            }
            
            int [] excelarray=new int [12];
            int excelindex=0;
            /// excel reading
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
            XSSFSheet datatypeSheet = workbook.getSheetAt(0);
            for (int m = 0; m <= datatypeSheet.getLastRowNum(); m++){
            	 XSSFRow row = datatypeSheet.getRow(m);
            	for (int k=0 ; k< row.getLastCellNum(); k++){
//                	System.out.println( Integer.valueOf(row.getCell(k).toString().replace(".0", "") ));
                	
                    excelarray[excelindex++] = Integer.valueOf(row.getCell(k).toString().replace(".0", "") );
                	
                }
            }
            workbook.close();   
            for(int j=0; j<excelarray.length; j++) {
            	System.out.println(excelarray[j]);
            }
            
            for (int k=0; k < csvarray.length; k++) {
            	if(csvarray[k] == excelarray[k]) {
            		System.out.println("matched");
            	}else {
            		System.out.println("not matched");
            	}
            }
            
            
            
        

    }

}

