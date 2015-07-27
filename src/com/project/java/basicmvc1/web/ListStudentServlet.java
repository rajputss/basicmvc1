package com.project.java.basicmvc1.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.java.basicmvc1.domain.Student;
import com.project.java.basicmvc1.domain.StudentService;
import com.project.java.basicmvc1.domain.StudentServiceImpl;

/**
 * Servlet implementation class ListStudentServlet
 */
@WebServlet("/list")
public class ListStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudentServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		StudentService service = new StudentServiceImpl();
		List<Student> students = service.getAllStudents();
		
		// Put Model data in request as attribute to make this data available to view(JSP)
		request.setAttribute("students", students);
		
		// Ask view (JSP) to render the dynamic HTML
		RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
