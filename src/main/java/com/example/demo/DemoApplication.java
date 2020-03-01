package com.example.demo;

import javax.xml.bind.JAXBException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws JAXBException {
		SpringApplication.run(DemoApplication.class, args);
                
                
                Services test= new Services();
                test.readWorldFromXml();
	}

}
