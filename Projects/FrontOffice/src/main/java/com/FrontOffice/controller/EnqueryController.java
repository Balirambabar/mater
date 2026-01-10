package com.FrontOffice.controller;

import com.FrontOffice.binding.Enquery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class EnqueryController {


    @GetMapping("/dashBoard")
    public String dashboard(Model model) {
        long total = 34;
        long enrolled = 21;
        long lost = 1;

        model.addAttribute("total", total);
        model.addAttribute("enrolled", enrolled);
        model.addAttribute("lost", lost);


        return "dashBoard";
    }

    @GetMapping("/addEnquiry")
    public String addEnquiryPage(@ModelAttribute Enquery enquiry) {
        //studentEnqRepo.save(new StudentEnqEntity());
        return "addEnquiry";
    }

    @GetMapping("/viewEnquiry")
    public String viewEnquiryPage() {
        return "viewEnquiry";
    }


}

