package com.project.java.basicmvc1.domain;

import java.util.List;

interface StudentDAO {
	
	List<Student> getAllStudents() throws DAOException;
	void create (Student student);

}
