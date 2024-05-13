package Helper;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ReadExcel
{

    public  static  String directory = System.getProperty("user.dir")+" ";

     XSSFWorkbook xssWorkbook= new XSSFWorkbook(directory);

     XSSFSheet xssfSheet= xssWorkbook.getSheetAt(0);

     String username= xssfSheet.getRow(0).getCell(1).getStringCellValue();

     String password= xssfSheet.getRow(1).getCell(0).getStringCellValue();


    public ReadExcel() throws IOException {
    }
}
