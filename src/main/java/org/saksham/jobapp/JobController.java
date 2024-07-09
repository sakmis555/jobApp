package org.saksham.jobapp;

import org.saksham.jobapp.model.JobPost;
import org.saksham.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/home", "/"})
    public String home() {
        return "home";
    };

    @GetMapping("/addjob")
    public String addjob() {
        return "addjob";
    };

    @PostMapping("/handleForm")
    public String handleform(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    };

    @GetMapping("/viewalljobs")
    public String viewJobs(Model model){
        List<JobPost> jobs =  service.getAllJobs();
        model.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }
}
