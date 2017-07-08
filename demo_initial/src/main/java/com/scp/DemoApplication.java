package com.scp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@RestController
@ComponentScan

public class DemoApplication {
	@Value("${name:world}")
	String bar;
    @Autowired
    private Environment environment;

	@RequestMapping("/")
	String Hello(){
      //return "Hello " + bar + "!";
        //DemoApplication() {
        //System.out.println( "Hello " + bar + "!");
       return "Hello1 " + bar + "! Hello2: " + environment.getProperty("name");
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
    }
}
