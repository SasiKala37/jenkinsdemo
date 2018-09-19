package com.bridgelabz.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
		/*for(int i=1;i<=10;i++) {
			System.out.println("Hello world------"+i);
		}
		String[] names= {"mamta","Shruthi","simran","Prateek","Swetha"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}*/
	}
	@GetMapping("/")
	public String getMessage() {
		return "hellooooo... world...";
	}
}
