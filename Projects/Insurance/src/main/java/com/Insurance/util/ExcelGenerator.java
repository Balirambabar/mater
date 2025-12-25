package com.Insurance.util;


import com.Insurance.entity.CitizenPlan;
import com.Insurance.repo.CitizenPlanRepository;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Component
public class ExcelGenerator {

    @Autowired
    private CitizenPlanRepository citizenPlanRepository;



    public void generateExcel(HttpServletResponse response,File f) throws IOException{


        try {
            Workbook workbook = new HSSFWorkbook();
           Sheet sheet = workbook.createSheet("plans");
          Row row = sheet.createRow(0);
            row.createCell(0).setCellValue("ID");
            row.createCell(1).setCellValue("CITIZEN NAME");
            row.createCell(2).setCellValue("PLAN NAME");
            row.createCell(3).setCellValue("PLAN STATUS");
            row.createCell(4).setCellValue("Gender");
            row.createCell(5).setCellValue("Start Date");
            row.createCell(6).setCellValue("End Date");
            row.createCell(7).setCellValue("Benefit amount");

            int rowNum = 1;
            List<CitizenPlan> CitizenPlansList = citizenPlanRepository.findAll();
            for (CitizenPlan citizenPlan : CitizenPlansList) {
                System.out.println("citizenPlan--"+citizenPlan);
                Row rows = sheet.createRow(rowNum);
                rows.createCell(0).setCellValue(citizenPlan.getCitizenId());
                rows.createCell(1).setCellValue(citizenPlan.getCitizenName());
                rows.createCell(2).setCellValue(citizenPlan.getPlanName());
                rows.createCell(3).setCellValue(citizenPlan.getPlanStatus());
                rows.createCell(4).setCellValue(citizenPlan.getCitizenGender());
                rows.createCell(5).setCellValue(citizenPlan.getStartDate()+"");
                rows.createCell(6).setCellValue(citizenPlan.getEndDate()+"");
                if(null !=citizenPlan.getBenefitAmt()) {
                    rows.createCell(7).setCellValue(citizenPlan.getBenefitAmt());
                }
                else {
                    rows.createCell(7).setCellValue("N/A");
                }

                rowNum++;
            }
            // it will create file in local folder
           FileOutputStream fos=new FileOutputStream(f);
            workbook.write(fos);

            ServletOutputStream outputStream=response.getOutputStream();
            workbook.write(outputStream);
            outputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
