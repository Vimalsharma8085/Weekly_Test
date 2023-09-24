package com.Geekster.Weeklytest.Service;

import com.Geekster.Weeklytest.Model.Job;
import com.Geekster.Weeklytest.Repo.IJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class JobService {
    @Autowired
    IJob iJob;
    public  String CreateJob(List<Job> newJob) {
        iJob.saveAll(newJob);
        return "addjob";
    }

    public Iterable<Job> getAllJob() {
        return (List<Job>) iJob.findAll();
    }

    public String removeJobById(Long id) {
         iJob.deleteById(id);
          return "deleted";
    }

    public String updateSalaryById(Long id, double salary) {
        Job prejentJob=iJob.findById(id).orElse(null);
        if(prejentJob!=null){
            prejentJob.setSalary(salary);
            iJob.save(prejentJob);
            return "salary updated";
        }
        else {
            return "job not found";
        }
    }



    public List<Job> getJobByLocationSalary(Double salary, String location) {
        return iJob.findBySalaryGreaterThanEqualAndLocation(salary,location);
    }
}
