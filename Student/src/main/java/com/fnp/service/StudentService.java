package com.fnp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fnp.converter.StudentConverter;
import com.fnp.dao.StudentRepository;
import com.fnp.dto.Student;
import com.fnp.dto.StudentModel;

@Repository
public class StudentService {

	@Autowired
	StudentRepository repository;

	@Autowired
	StudentConverter converter;

	public Student saveStudent(StudentModel studentModel) {
		System.out.println(studentModel);

		Student student = converter.saveConverter(studentModel);
		System.out.println(student);
		Student student1 = repository.save(student);
		System.out.println(student1 +"lkjhkmmh");
		return student1;
//		return repository.save(student);
	}

	public String deleteStudent(int id) {

		if (repository.existsById(id)) {
			repository.deleteById(id);
			return "deleted";
		} else {
			return "doesNotExist";
		}
	}

	public String updateStudent(StudentModel studentModel) {

		if (repository.existsById(studentModel.getId())) {
			Student student = converter.updateConverter(studentModel);
			repository.save(student);
			return "Updated Successfully.";
		}
		return "Record does not exist.";
	}

	public Optional<Student> getStudent(int id) {

		if (repository.existsById(id)) {

			Optional<Student> obj = repository.findById(id);
			return obj;
		}
		return null;
	}

	public List<Student> getAllStudents() {

		List<Student> list = repository.findAll();
		return list;
	}
}
