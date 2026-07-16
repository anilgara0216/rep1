
package com.example.demo.service;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.Row; // ✅ FIX
import org.springframework.stereotype.Service;
import java.io.*;

@Service
public class ExcelService {
    public void save(String text) {
        try {
            File file = new File("output.xlsx");
            XSSFWorkbook wb;
            XSSFSheet sheet;

            if (file.exists()) {
                wb = new XSSFWorkbook(new FileInputStream(file));
                sheet = wb.getSheetAt(0);
            } else {
                wb = new XSSFWorkbook();
                sheet = wb.createSheet("Data");
            }

            int rowNum = sheet.getLastRowNum() + 1;
            Row row = sheet.createRow(rowNum);

            row.createCell(0).setCellValue(text);

            wb.write(new FileOutputStream(file));
            wb.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
