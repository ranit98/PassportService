package com.example.demo.Controller;

import javax.annotation.processing.Generated;

import com.example.demo.Entity.Applicant;
import com.example.demo.Entity.Passport;
import com.example.demo.Repository.ApplicantRepository;
import com.example.demo.Repository.PassportRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicantController {
    
    @Autowired
    private ApplicantRepository applicantRepository;
    @Autowired
    private PassportRepository passportRepository;

    @GetMapping
    public String loadindex(){
        //model.addAttribute("applicant", new Applicant());
        return "index";
    }

    @GetMapping("/apply_passport.html")
    public String loadform(Model model){
        model.addAttribute("applicant", new Applicant());
        return "apply_passport";
    }

    @PostMapping("/saveApplicant")
    public String saveApplicant(@ModelAttribute Applicant applicant , BindingResult bindingResult){
        applicantRepository.save(applicant);
        return "successful";
    }

    @GetMapping("/passport_validator.html")
    public ModelAndView getRequestList() {
        ModelAndView mav = new ModelAndView("passport_validator");
        mav.addObject("applicants", applicantRepository.findAll());
        return mav;
    }

    @GetMapping("/save_passport")
    public String savePassport(Model model){
        model.addAttribute("passport", new Passport());
        return "savePassport";
    }

    @PostMapping("/savePassport")
    public String storePassport(@ModelAttribute Passport passport,BindingResult bindingResult){
        passportRepository.save(passport);
        return "passport_successful";

    }

    

}
