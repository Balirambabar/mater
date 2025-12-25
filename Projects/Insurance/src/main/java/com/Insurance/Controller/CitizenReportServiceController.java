package com.Insurance.Controller;


import com.Insurance.entity.CitizenPlan;
import com.Insurance.request.SearchRequest;
import com.Insurance.service.ReportServiceImpl;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class CitizenReportServiceController {

    @Autowired
    private ReportServiceImpl reportServiceImpl;

    @PostMapping("/search")
    public String handleSearch(@ModelAttribute("search") SearchRequest searchRequest, Model model) {
        List<CitizenPlan> plans = reportServiceImpl.serachResult(searchRequest);
        model.addAttribute("plans", plans);
        prepareCommonModel(model);
        return "index";
    }

    @GetMapping("/excel")
    public void getExcelReport(HttpServletResponse response) throws Exception {
       // File file=new File("CitizenPlan.xlsx");
        response.addHeader("Content-Disposition", "attachment; filename=CitizenInfoPlan.xls");
        response.addHeader("Content-Type", "application/octet-stream");

        reportServiceImpl.generateExcel(response);

    }
    @GetMapping("/pdf")
    public void getPdfReport(HttpServletResponse response) throws Exception {
        // File file=new File("CitizenPlan.xlsx");
        response.addHeader("Content-Disposition", "attachment; filename=CitizenInfoPlan.pdf");
        response.addHeader("Content-Type", "application/pdf");

        reportServiceImpl.generatePdf(response);
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("search", new SearchRequest());
        prepareCommonModel(model);
        return "index";
    }

    // Helper method to avoid duplication
    private void prepareCommonModel(Model model) {
        model.addAttribute("names", reportServiceImpl.getPlanName());
        model.addAttribute("status", reportServiceImpl.getPlanStatus());
    }

}
