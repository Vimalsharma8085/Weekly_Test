package com.Geekster.Weeklytest.Repo;

import com.Geekster.Weeklytest.Model.Job;
import org.springframework.data.repository.CrudRepository;

import java.lang.reflect.Type;
import java.util.List;

public interface IJob extends CrudRepository <Job,Long>
{



    List<Job> findBySalaryGreaterThanEqualAndLocation(Double salary, String location);
}
