package com.Insurance.service;


import com.Insurance.entity.CitizenPlan;
import jakarta.servlet.http.HttpServletResponse;


import javax.naming.directory.SearchResult;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface ReportService {

    public List<String> getPlanName();

    public List<String> getPlanStatus();

    public List<CitizenPlan> serachReport(SearchResult searchResult);

    public void generatePdf(HttpServletResponse response) throws Exception;
    public void generateExcel(HttpServletResponse response) throws Exception;







}
