package com.Geekster.Weeklytest.Controller;

import com.Geekster.Weeklytest.Model.Job;
import com.Geekster.Weeklytest.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@RestController
public class Jobcontroller
{   @Autowired
    JobService jobService;
    @PostMapping("createjob")
    public String CreateJob (@RequestBody List<Job> newJob){
        return jobService.CreateJob(newJob);
    }
    @GetMapping("getjob")
    public Iterable <Job> getAllJob(){
        return jobService.getAllJob();
    }

    @DeleteMapping("deleteJob/{id}")
    public String removeJobById(@PathVariable Long id){
        return jobService.removeJobById(id);
    }
    @PutMapping("job/salary/id")
    public  String updateSalaryById(@RequestParam Long id,@RequestParam double salary){
        return jobService.updateSalaryById(id,salary);
    }

    @GetMapping("jobs")
    public List<Job> getJobByLocationSalary( @RequestParam  Double salary, @RequestParam String location){
        return jobService.getJobByLocationSalary(salary, location);
    }
}

