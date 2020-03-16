package com.mas;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.entity.StudentDetails;
import com.mas.service.StudentService;

@SpringBootApplication
public class SpringQueryAnnanotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringQueryAnnanotationApplication.class, args);
		 StudentService studentService = context.getBean(StudentService.class);
//Add student Data
		/*
		 * StudentDetails contactEntity = new StudentDetails();
		 * contactEntity.setStudent_id(105); contactEntity.setName("vinay");
		 * contactEntity.setLast("pra"); contactEntity.setAge(34);
		 * contactEntity.setCourse("ips"); contactEntity.setSem("pass");
		 * contactEntity.setMoblie(90222222);
		 * 
		 * boolean out = studentService.saveContact(contactEntity);
		 * System.out.println(out);
		 */
		 
//findbyVame custom
		/*
		 * StudentDetails findByName = studentService.findByName("vinay");
		 * System.out.println(findByName);
		 */
		 
//FindTop3ByName  custom
	 //#not working
		/*
		 * List<StudentDetails> findTop3 = studentService.findTop3();
		 * findTop3.forEach(f->System.out.println(f));
		 */
		 
//findByNameLike  custom
		/*
		 * List<StudentDetails> findByNameLike = studentService.findByNameLike("m%");
		 * findByNameLike.forEach(f->System.out.println(f));
		 */
		 
//findByAgeLessThan  custom
		/*
		 * List<StudentDetails> findByAgeLessThan =
		 * studentService.findByAgeLessThan(30);
		 * findByAgeLessThan.forEach(f->System.out.println(f));
		 */
		 
//findByAgeLessThanEqual
		/*
		 * List<StudentDetails> findByAgeLessThan =
		 * studentService.findByAgeLessThanEqual(30);
		 * findByAgeLessThan.forEach(f->System.out.println(f));
		 */
		 
//findByAgeGreaterThan
		/*
		 * List<StudentDetails> findByAgeGreaterThan =
		 * studentService.findByAgeGreaterThan(32);
		 * findByAgeGreaterThan.forEach(f->System.out.println(f));
		 */
		 
//findByAgeGreaterThanEqual
		/*
		 * List<StudentDetails> findByAgeGreaterThanEqual =
		 * studentService.findByAgeGreaterThanEqual(32);
		 * findByAgeGreaterThanEqual.forEach(f->System.out.println(f));
		 */
		 
//findByAgeBetween
		/*
		 * List<StudentDetails> findByAgeBetween =
		 * studentService.findByAgeBetween(20,40);
		 * findByAgeBetween.forEach(f->System.out.println(f));
		 */
		 
//findByAgeIn
		/*
		 * List<Integer> l= new ArrayList<Integer>(); l.add(28); l.add(17); l.add(32);
		 * List<StudentDetails> findByAgeIn = studentService.findByAgeIn(l);
		 * findByAgeIn.forEach(f->System.out.println(f));
		 */
		 
//findByAgeBefore
	//Before can be use in date also
		/*
		 * List<StudentDetails> findByAgeBefore = studentService.findByAgeBefore(32);
		 * findByAgeBefore.forEach(f->System.out.println(f));
		 */
		 
//findByAgeAfter
	//After can be use in date also
		/*
		 * List<StudentDetails> findByAgeAfter = studentService.findByAgeAfter(32);
		 * findByAgeAfter.forEach(f->System.out.println(f));
		 */
		 
//findByNameOrAge
		/*
		 * List<StudentDetails> findByNameOrAge =
		 * studentService.findByNameOrAge("masood",32);
		 * findByNameOrAge.forEach(f->System.out.println(f));
		 */
		 
	 //or with name example
		/*
		 * List<StudentDetails> findByNameOrLast =
		 * studentService.findByNameOrLast("shama","akhtar");
		 * findByNameOrLast.forEach(f->System.out.println(f));
		 */
		 
//findByNameAndAge
		/*
		 * List<StudentDetails> findByNameAndAge =
		 * studentService.findByNameAndAge("shama",20);
		 * findByNameAndAge.forEach(f->System.out.println(f));
		 */
		 
 //findByCourseOrSemAndAge
		/*
		 * List<StudentDetails> findByCourseOrSemAndAge =
		 * studentService.findByCourseOrSemAndAge("ips","pass",32);
		 * findByCourseOrSemAndAge.forEach(f->System.out.println(f));
		 */
		 
//findByNameOrderByAge
		
		/*
		 * List<StudentDetails> findByNameOrderByAge =
		 * studentService.findByNameOrderByAge();
		 * findByNameOrderByAge.forEach(f->System.out.println(f));
		 */
		 //
		
		  List<StudentDetails> findByNameOrderByName =
		  studentService.findByNameOrderByName();
		  findByNameOrderByName.forEach(f->System.out.println(f));
		 
	}

}
