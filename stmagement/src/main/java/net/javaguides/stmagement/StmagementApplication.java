package net.javaguides.stmagement;

import net.javaguides.stmagement.entity.Student;
import net.javaguides.stmagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StmagementApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StmagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("dd","gune","abc@gmail");
//		studentRepository.save(student1);
//
//		Student student2=new Student("ss","maha","ttrre@gmail");
//		studentRepository.save(student2);
//
//		Student student3=new Student("as","hillfigure","jkl@gmail");
//		studentRepository.save(student3);

	}
}
