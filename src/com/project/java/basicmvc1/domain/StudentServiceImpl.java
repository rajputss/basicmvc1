package com.project.java.basicmvc1.domain;

import java.util.List;

public class StudentServiceImpl implements StudentService {

	@Override
	public void addStudent(Student student) {

		StudentDAO dao = new StudentDAOJDBCImpl();
		dao.create(student);

	}

	@Override
	public List<Student> getAllStudents() {
		StudentDAO dao = new StudentDAOJDBCImpl();
		return dao.getAllStudents();
	}
}
