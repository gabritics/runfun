package dev.gabiwasabi.runfun.run;


import dev.gabiwasabi.runfun.run.Location;
import dev.gabiwasabi.runfun.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	CommandLineRunner runner(){
		return args -> {
			Run run = new Run(1,"First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
            log.info("Run:{}", run);
		};
	}
	//or delete data.sql and write the following to put data in the database
	//@Bean
	//CommandLineRunner runner(RunRepository runRepository){
	//	return args -> {
	//		Run run = new Run(1,"First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
	//		runRepository.create(run);
	//		};
	//	}
}
