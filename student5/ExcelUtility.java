import java.io.IOException;

public class ExcelUtility
{
    public static void main(String[] args) throws IOException {

        ExcelTest obj = new ExcelTest();
        obj.getExcelPath("D:\\JavaSelenium\\sample.xlsx");
        System.out.println(obj.getCellData("Sheet1",0,0));
        System.out.println(obj.getCellData("Sheet1",0,1));
        System.out.println(obj.getCellData("Sheet1",0,2));
        System.out.println(obj.getCellData("Sheet1",1,0));
        System.out.println(obj.getCellData("Sheet1",1,1));
        System.out.println(obj.getCellData("Sheet1",1,2));
    }
}
