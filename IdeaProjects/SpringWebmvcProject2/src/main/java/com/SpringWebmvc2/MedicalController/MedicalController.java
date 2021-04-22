package com.SpringWebmvc2.MedicalController;

import com.SpringWebmvc2.MedicalDto.Customer;
import com.SpringWebmvc2.MedicalService.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MedicalController {

    @Autowired
    private MedicalService medicalService;
    @RequestMapping(value = "/processdata",method = RequestMethod.POST)
    public String customerController(@ModelAttribute Customer customer, Model model)
    {
        System.out.println("inside  controller class");
        customer= medicalService.customerService(customer);
        model.addAttribute("object",customer);
        return "customerDetail";
    }
       public MedicalService getMedicalService() {
        return medicalService;
    }

    public void setMedicalService(MedicalService medicalService) {
        this.medicalService = medicalService;
    }
    Customer customer=null;

}
