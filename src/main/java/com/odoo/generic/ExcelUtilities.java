package com.odoo.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities 
{
	String filepath;
	
	public ExcelUtilities(String filepath)  //read data
	{
		this.filepath=filepath;
	}
	
	public ExcelUtilities() //write data
	{
		
	}
	
	public String[] readData(String sheetName, String testcaseID) 
	{
		String[] value=null;
		
		try
		{
			FileInputStream fis=new FileInputStream(new File(filepath));
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int rowCount = sh.getLastRowNum();
			
			for (int i = 1; i <=rowCount; i++) 
			{
				Row rw = sh.getRow(i);
				if (rw.getCell(0).getStringCellValue().equalsIgnoreCase(testcaseID)) 
				{
					int cellCount = rw.getLastCellNum();
					value=new String[cellCount];
					for (int j = 0; j < cellCount; j++) 
					{
						Cell cl = rw.getCell(j);
						
						switch (cl.getCellType()) 
						{
						case STRING:
							value[j]=cl.getStringCellValue();
							break;
							
						case NUMERIC:
							if (DateUtil.isCellDateFormatted(cl)) 
							{
								SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
								value[j]=sdf.format(cl.getDateCellValue());
							}
							else
							{
								long longValue=(long) cl.getNumericCellValue();
								value[j]=Long.toString(longValue);
							}
							break;
							
						case BOOLEAN:
							value[j]=Boolean.toString(cl.getBooleanCellValue());
							break;
							
						default:
							break;
						}
							
					} //end cell loop
					
					break;
				} //end if
				
			} //end of row loop
		}
		catch(EncryptedDocumentException e)
		{
			
		}
		catch(IOException e)
		{
			
		}
		
		return value;
	}
	
	
	public void writeData(Sheet sh, int row,String title,int data)
	{
		sh.createRow(row).createCell(0).setCellValue(title);
		sh.getRow(row).createCell(1).setCellValue(data);
	}
	
	
	
	public void ReadwriteData(String sheet,int row,int cell,String value)
	
	{

	try {
		
		FileInputStream fis = new FileInputStream(new File(filepath));
		Workbook wb = WorkbookFactory.create(fis);
		Cell cl= wb.getSheet(sheet).getRow(row).getCell(cell);
		FileOutputStream fos= new FileOutputStream(new File(filepath));
		cl.setCellValue(value);
		wb.write(fos);
	} 
	catch (IOException e) 
	{
		
		e.printStackTrace();
	}	
	}
	 public void SetCellValue(String sheet,int row,int cell,String value)
	 {
	try {
		 FileInputStream fis= new FileInputStream(new File (filepath));
		 Workbook wb=WorkbookFactory.create(fis);
		 Cell cl=wb.getSheet(sheet).getRow(row).getCell(cell);
		 FileOutputStream fos= new FileOutputStream(new File(filepath));
		 cl.setCellValue(value);
		 wb.write(fos);
	     }
	catch (IOException e)
	{
		e.printStackTrace();
	}
	 }	
}
