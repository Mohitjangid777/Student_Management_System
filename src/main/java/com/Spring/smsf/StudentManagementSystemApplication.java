package com.Spring.smsf;

import com.Spring.smsf.Entity.Student;
import com.Spring.smsf.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
    private StudentRepository repository;

	@Override
	public void run(String... args) throws Exception {
//		Student student=new Student(1,"Mohit","Jangid","Mohit77@gmail.com","12th",117);
//		Student student2=new Student(2,"Rohit","jatt","rohitj8@gmail.com","12th",137);
//		Student student3=new Student(3,"Raj","sharma","rajsharma23@gmail.com","12th",140);
//		Student student4=new Student(4,"Shivam","Joshi","shivamJoshi1100@gmail.com","12th",141);
//
//		repository.save(student);
//		repository.save(student2);
//		repository.save(student3);
//		repository.save(student4);
	}
}
