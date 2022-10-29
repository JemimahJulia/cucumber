package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;




import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	private static void writeData() throws IOException {
		
    File f = new File ("C:\\Users\\user\\eclipse-workspace\\MavenProject\\Excel\\Details.xlsx");
    
    FileInputStream fis = new FileInputStream(f);
    
     Workbook wb = new XSSFWorkbook (fis);
//    
//    Sheet createSheet = wb.createSheet("Project Details");
//    
//    Row createRow = createSheet.createRow(0);
//    
//    Cell createCell = createRow.createCell(0);
//    
//    createCell.setCellValue("Username");
    
    wb.createSheet("Project Details").createRow(0).createCell(0).setCellValue("Username");
    
    wb.getSheet("Project Details").getRow(0).createCell(1).setCellValue("Password");
    
    wb.getSheet("Project Details").createRow(1).createCell(0).setCellValue("James");
    
    wb.getSheet("Project Details").getRow(1).createCell(1).setCellValue("James@123") ;
    
    FileOutputStream fos = new FileOutputStream(f);
    
    wb.write(fos);
    
    System.exit(0);
    
    System.out.println("Write Successfully");
	
    
  wb.close();
	}
    
    
    public static void main(String[] args)  throws IOException {
		writeData();
}
	}