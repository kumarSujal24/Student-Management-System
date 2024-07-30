package in.sam.main.service;

import java.util.List;

import in.sam.main.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student id);
	
	void deleteStudentById(Long id);
	

}
