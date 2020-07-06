package spring.mvc.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller

//IF we had -> @RequestMapping("/showForm")
// all @RequestMapping() after this would be RELATIVE to the class one for example
// the /processForm would be /showForm/processForm which would help resolving problem or conflicts with other request mappings.
@RequestMapping("/hello")
public class HelloWorldController {
    //All request underneath are SUB mappings

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String LetsShoutDude(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "Yo!" + theName;

        model.addAttribute("message", result);

        return "helloworld";

    }


    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
//            reads the httpServlet request, reads the form parameter studentName and bind  the value  to "theName"
//            Spring will do this for us -> String theName = request.getParameter("studentName");
            @RequestParam("studentName") String theName,
            Model model)    {

        theName = theName.toUpperCase();

        String result = "Yo! " + theName;

        model.addAttribute("message", result);

        return "helloworld";

    }

}
