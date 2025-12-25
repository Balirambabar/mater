package com.Insurance.util;

import com.Insurance.entity.CitizenPlan;
import com.Insurance.repo.CitizenPlanRepository;
import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;


@Component
public class PdfGenerator {

    @Autowired
    private CitizenPlanRepository  citizenPlanRepository;

    public void getGeneratePdf(HttpServletResponse response, File f) throws Exception {

        //generate Document
        Document document = new Document(PageSize.A4);
        //attach to reponse
         PdfWriter.getInstance(document, response.getOutputStream());
         PdfWriter.getInstance(document, new FileOutputStream(f));

        document.open();

        Paragraph paragraph = new Paragraph("CITIZEN PLAN INFO");
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(paragraph);

        PdfPTable table = new PdfPTable(7);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {1.5f, 3.5f, 3.0f, 3.0f, 1.5f, 2.5f, 2.5f});
        table.setSpacingBefore(10);
        table.addCell("Id");
        table.addCell("CITIZEN NAME");
        table.addCell("PLAN NAME");
        table.addCell("PLAN STATUS");
        table.addCell("Gender");
        table.addCell("Start Date");
        table.addCell("End Date");
        for (CitizenPlan citizenPlan : citizenPlanRepository.findAll()) {
            /*Value of method convert integer to string*/
            table.addCell(String.valueOf(citizenPlan.getCitizenId()));
            table.addCell(citizenPlan.getCitizenName());
            table.addCell(citizenPlan.getPlanName());
            table.addCell(citizenPlan.getPlanStatus());
            table.addCell(citizenPlan.getCitizenGender());
            table.addCell(String.valueOf(citizenPlan.getStartDate()));
            table.addCell(String.valueOf(citizenPlan.getEndDate()));
        }

        document.add(table);


        document.close();

    }
}

