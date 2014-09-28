package Wrapper;

import java.io.File;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;

import jxl.*;
public class Wrapper {

	private  WebDriver d=null;
	
	public Wrapper(WebDriver driver)
	{
		d=driver;
	}
	
	
	public static String[][] getTableArray(String xlFilePath, String sheetName, String tableName){
        String[][] tabArray=null;
        try{
            Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
            Sheet sheet = workbook.getSheet(sheetName);
            int startRow,startCol, endRow, endCol,ci,cj;
            Cell tableStart=sheet.findCell(tableName);
            startRow=tableStart.getRow();
            startCol=tableStart.getColumn();

            Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                               

            endRow=tableEnd.getRow();
            endCol=tableEnd.getColumn();
            System.out.println("startRow="+startRow+", endRow="+endRow+", " +
                    "startCol="+startCol+", endCol="+endCol);
            tabArray=new String[endRow-startRow-1][endCol-startCol-1];
            ci=0;

            for (int i=startRow+1;i<endRow;i++,ci++){
                cj=0;
                for (int j=startCol+1;j<endCol;j++,cj++){
                    tabArray[ci][cj]=sheet.getCell(j,i).getContents();
                }
            }
        }
        catch (Exception e)    {
            System.out.println("error in getTableArray()");
            e.printStackTrace();
        }

        return(tabArray);
    }


	
	public void moveToWindow(String title)
	{
	Iterator<String> wh=	d.getWindowHandles().iterator();
	while(wh.hasNext())
	{
		d.switchTo().window(wh.next().toString());
		if(!d.getTitle().contains(title))
					d.close();
		
	}
	}
}
