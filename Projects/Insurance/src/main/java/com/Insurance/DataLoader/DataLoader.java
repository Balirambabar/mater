/*package com.Insurance.DataLoader;

import com.Insurance.entity.CitizenPlan;
import com.Insurance.repo.CitizenPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CitizenPlanRepository repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        CitizenPlan citizenPlan1 = new CitizenPlan();
        citizenPlan1.setPlanName("Food");
        citizenPlan1.setPlanStatus("Approved");
        citizenPlan1.setCitizenName("Baliram");
        citizenPlan1.setCitizenGender("Male");
        citizenPlan1.setStartDate(LocalDate.now());
        citizenPlan1.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan2 = new CitizenPlan();
        citizenPlan2.setPlanName("Food");
        citizenPlan2.setPlanStatus("Denied");
        citizenPlan2.setCitizenName("TRUPTI");
        citizenPlan2.setCitizenGender("FeMale");
        citizenPlan2.setStartDate(LocalDate.now());
        citizenPlan2.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan3 = new CitizenPlan();
        citizenPlan3.setPlanName("Cash");
        citizenPlan3.setPlanStatus("Approved");
        citizenPlan3.setCitizenName("SUNIL");
        citizenPlan3.setCitizenGender("Male");
        citizenPlan3.setStartDate(LocalDate.now());
        citizenPlan3.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan4 = new CitizenPlan();
        citizenPlan4.setPlanName("Cash");
        citizenPlan4.setPlanStatus("Terminated");
        citizenPlan4.setCitizenName("RAJRSHRI");
        citizenPlan4.setCitizenGender("FeMale");
        citizenPlan4.setStartDate(LocalDate.now());
        citizenPlan4.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan5 = new CitizenPlan();
        citizenPlan5.setPlanName("Medical");
        citizenPlan5.setPlanStatus("Approved");
        citizenPlan5.setCitizenName("UDDHAV");
        citizenPlan5.setCitizenGender("Male");
        citizenPlan5.setStartDate(LocalDate.now());
        citizenPlan5.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan6 = new CitizenPlan();
        citizenPlan6.setPlanName("Employment");
        citizenPlan6.setPlanStatus("Denied");
        citizenPlan6.setCitizenName("SUVARNA");
        citizenPlan6.setCitizenGender("FeMale");
        citizenPlan6.setStartDate(LocalDate.now());
        citizenPlan6.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan7 = new CitizenPlan();
        citizenPlan7.setPlanName("Employment");
        citizenPlan7.setPlanStatus("Approved");
        citizenPlan7.setCitizenName("NIRMALA");
        citizenPlan7.setCitizenGender("FeMale");
        citizenPlan7.setStartDate(LocalDate.now());
        citizenPlan7.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan8 = new CitizenPlan();
        citizenPlan8.setPlanName("Employment");
        citizenPlan8.setPlanStatus("Terminated");
        citizenPlan8.setCitizenName("VIJAY");
        citizenPlan8.setCitizenGender("Male");
        citizenPlan8.setStartDate(LocalDate.now());
        citizenPlan8.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan9 = new CitizenPlan();
        citizenPlan9.setPlanName("Medical");
        citizenPlan9.setPlanStatus("Denied");
        citizenPlan9.setCitizenName("URMILA");
        citizenPlan9.setCitizenGender("FeMale");
        citizenPlan9.setStartDate(LocalDate.now());
        citizenPlan9.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan10 = new CitizenPlan();
        citizenPlan10.setPlanName("Employment");
        citizenPlan10.setPlanStatus("Approved");
        citizenPlan10.setCitizenName("SIDDHESHWAR");
        citizenPlan10.setCitizenGender("Male");
        citizenPlan10.setStartDate(LocalDate.now());
        citizenPlan10.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan11 = new CitizenPlan();
        citizenPlan11.setPlanName("Food");
        citizenPlan11.setPlanStatus("Approved");
        citizenPlan11.setCitizenName("GAYATRI");
        citizenPlan11.setCitizenGender("FeMale");
        citizenPlan11.setStartDate(LocalDate.now());
        citizenPlan11.setEndDate(LocalDate.now().plusMonths(6));

        CitizenPlan citizenPlan12 = new CitizenPlan();
        citizenPlan12.setPlanName("Medical");
        citizenPlan12.setPlanStatus("Denied");
        citizenPlan12.setCitizenName("RAM");
        citizenPlan12.setCitizenGender("Male");
        citizenPlan12.setStartDate(LocalDate.now());
        citizenPlan12.setEndDate(LocalDate.now().plusMonths(6));


        List<CitizenPlan> list = Arrays.asList(citizenPlan1, citizenPlan2, citizenPlan3, citizenPlan4, citizenPlan5, citizenPlan6, citizenPlan7, citizenPlan8, citizenPlan9, citizenPlan10, citizenPlan11, citizenPlan12);

        repo.saveAll(list);

    }
}
*/