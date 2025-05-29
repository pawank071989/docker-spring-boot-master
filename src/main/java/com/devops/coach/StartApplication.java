package com.devops.coach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * https://www.coachdevops.com/2023/05/how-to-deploy-springboot-microservices_13.html
 *
 * **/
@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Welcoe folks..We are Pawan you did it learning Kubernete Deployment using Helm, Jenkins Pipeline Today's date is Jan 18th, 2025");
        model.addAttribute("msg", "Hello All..We are deploying springboot application into EKS cluster using Helm + Jenkins Pipeline!!!!");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
