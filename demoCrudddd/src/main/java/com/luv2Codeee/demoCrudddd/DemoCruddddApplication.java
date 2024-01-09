package com.luv2Codeee.demoCrudddd;

import com.luv2Codeee.demoCrudddd.DAO.StudentDAO;
import com.luv2Codeee.demoCrudddd.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoCruddddApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCruddddApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runer ->{

		deleteStudent(studentDAO);

		};
	}

	private void deleteStudent(StudentDAO studentDAO) {

	}

	private void updateStudent(StudentDAO studentDAO) {
		Student std = studentDAO.find_By_id(1);
		std.setFirstName("lolololo");
		studentDAO.update(std);
		System.out.println("Updated succesfuly !");
	}

	private void readStudent(StudentDAO studentDAO) {
		var a =	studentDAO.find_By_id(1);
		System.out.println(a.getFirstName());
		System.out.println(a.toString());
	}


	private void multisaveStudents(StudentDAO studentDAO)
	{
		Student enw = new Student("lila" , "mano" , "hhehehehe@gmail.com");
		Student enw2 = new Student("lila" , "mano" , "hhehehehe@gmail.com");
		Student enw3 = new Student("lila" , "mano" , "hhehehehe@gmail.com");
		studentDAO.save(enw);
		studentDAO.save(enw2);
		studentDAO.save(enw3);
	}

	private void createStudent(StudentDAO studentDAO) {
		// Create the student object
		System.out.println("Creating new Student object");
		Student tempstudent = new Student("Akif" , "Salman" , "mshdhsjl@gmail.com");

		// Save the student object
		System.out.println("System saving the student , plz stand by");
		studentDAO.save(tempstudent);

		// display id of the saved student

		System.out.println("Saved student. Generated id : " + tempstudent.getId());


	}

}
