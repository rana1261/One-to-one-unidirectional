package com.demo.SpringBoot_one_to_one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.SpringBoot_one_to_one.Repository.InstructorRepository;
import com.demo.SpringBoot_one_to_one.model.Instructor;
import com.demo.SpringBoot_one_to_one.model.InstructorDetail;

@SpringBootApplication
public class SpringBootOneToOneApplication implements CommandLineRunner {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneToOneApplication.class, args);
	}

    @Autowired
    private InstructorRepository instructorRepository;
    
    @Override
    public void run(String...args) throws Exception {
    	 InstructorDetail instructorDetail = new InstructorDetail("Java Guides", "Cricket");
    	


        Instructor instructor = new Instructor("Ramesh", "Fadatare", "ramesh@gmail.com");

       

        // associate the objects
        instructor.setInstructorDetail(instructorDetail);

        instructorRepository.save(instructor);
     
    }
}
