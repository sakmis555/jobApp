package org.saksham.jobapp.service;

import org.saksham.jobapp.model.JobPost;
import org.saksham.jobapp.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository repository;
    public void addJob(JobPost jobPost) {
        repository.addJob(jobPost);
    };

    public List<JobPost> getAllJobs() {
        List<JobPost> jobs = repository.getAllJobs();
        return jobs;
//        return null;
    };
}
