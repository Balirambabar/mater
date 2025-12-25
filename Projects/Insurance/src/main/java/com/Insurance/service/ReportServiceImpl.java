package com.Insurance.service;

import com.Insurance.entity.CitizenPlan;
import com.Insurance.repo.CitizenPlanRepository;
import com.Insurance.request.SearchRequest;
import com.Insurance.util.EmailSender;
import com.Insurance.util.ExcelGenerator;
import com.Insurance.util.PdfGenerator;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.naming.directory.SearchResult;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private CitizenPlanRepository citizenPlanRepository;

    @Autowired
    private ExcelGenerator excelGenerator;

    @Autowired
    private PdfGenerator pdfGenerator;

    @Autowired
    private EmailSender emailSender;


    @Override
    public List<String> getPlanName() {
        return citizenPlanRepository.getPlanName();
    }

    @Override
    public List<String> getPlanStatus() {
        return citizenPlanRepository.getPlanStatus();
    }

    @Override
    public List<CitizenPlan> serachReport(SearchResult searchResult) {
        return List.of();
    }

    public List<CitizenPlan> serachResult(SearchRequest searchRequest) {
        CitizenPlan entity = new CitizenPlan();
       // BeanUtils.copyProperties(searchRequest,entity);
        if(null!=searchRequest.getPlanName() && !searchRequest.getPlanName().isEmpty()){
            entity.setPlanName(searchRequest.getPlanName());
        }
        if(null!=searchRequest.getPlanStatus() && !searchRequest.getPlanStatus().isEmpty()){
            entity.setPlanStatus(searchRequest.getPlanStatus());
        }
        if(null!=searchRequest.getGender() && !searchRequest.getGender().isEmpty()){
            entity.setCitizenGender(searchRequest.getGender());
        }
        System.out.println("---searchRequest---"+searchRequest);
        System.out.println("---entity---"+entity);
        return citizenPlanRepository.findAll(Example.of(entity));
    }

    public void  generateExcel(HttpServletResponse response) throws Exception {
        File f=new File("Plans.xls");
        excelGenerator.generateExcel(response,f);
        String subject="test mail";
        String content="<h1>tet mail body</h1>";
        String  to="balirambabar93@gmail.com";
        emailSender.sendMail(to,subject,content,f);
        f.delete();

    }

    public void generatePdf(HttpServletResponse response) throws Exception {
        File f=new File("Plans.pdf");
        pdfGenerator.getGeneratePdf(response,f);
        String subject="test mail";
        String content="<h1>tet mail body</h1>";
        String  to="balirambabar93@gmail.com";
        emailSender.sendMail(to,subject,content,f);
        f.delete();

    }
}
