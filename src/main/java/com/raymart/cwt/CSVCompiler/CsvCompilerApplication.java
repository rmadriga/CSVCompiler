package com.raymart.cwt.CSVCompiler;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsvCompilerApplication {

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job job;

	public static void main(String[] args) {
		SpringApplication.run(CsvCompilerApplication.class, args);
	}

	public void perform(String[] args) throws Exception {
		JobParameters params  = new JobParametersBuilder().toJobParameters();
		if (args.length > 0) {
			params = new JobParametersBuilder()
					.addString("test", args[0])
					.toJobParameters();
		}
		jobLauncher.run(job, params);
	}

}
