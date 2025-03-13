package com.startup.factory;

import com.startup.entity.Job;
import com.startup.util.ValidationHelper;

public class JobFactory {
    public static Job createJob(String jobTitle, String jobDescription){
        if(ValidationHelper.isEmptyOrNullString(jobTitle)|| ValidationHelper.isEmptyOrNullString(jobDescription))
            return null;
        return new Job.Builder()
                .SetJobTitle(jobTitle)
                .setJobDescription(jobDescription)
                .Build();
    }
}
