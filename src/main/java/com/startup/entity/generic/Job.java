package com.startup.entity;

public class Job {
    private String jobTitle, jobDescription;

    public Job(Builder builder){
        this.jobTitle = builder.jobTitle;
        this.jobDescription = builder.jobDescription;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }

    public static class Builder{
      private String jobTitle, jobDescription;

      public Builder SetJobTitle(String jobTitle){
          this.jobTitle = jobTitle;
          return this;
      }
      public  Builder setJobDescription(String jobDescription){
          this.jobDescription = jobDescription;
          return this;
      }
      public Builder copy(Job job){
          this.jobTitle = job.jobTitle;
          this.jobDescription = job.jobDescription;
          return this;
      }
      public Job Build(){
          return new Job(this);
      }
    }
}
