package spring.mvc.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private Student student;

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        student.setFirstName("John");
        theModel.addAttribute("student", student);
        theModel.addAttribute("countryOptions", student.getCountryOptions());

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        System.out.println("Students firstName -> " + theStudent.getFirstName());


        return "student-confirmation";
    }

}
