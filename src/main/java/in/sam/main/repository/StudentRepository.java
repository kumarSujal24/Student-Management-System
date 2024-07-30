package in.sam.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sam.main.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
 