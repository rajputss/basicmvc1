package com.project.java.basicmvc1.domain;

import java.sql.SQLException;

@SuppressWarnings("serial")
public class DAOException extends RuntimeException{
	
	public DAOException(Exception ex, String errorMessage) {
		super(errorMessage, ex);
	}
	
	public DAOException(String errorMessage, Exception ex) {
		super(errorMessage, ex);
	}
	
	public DAOException(String errorMessage) {
		super(errorMessage);
	}
	
	public DAOException(SQLException ex) {
		super(ex);
	}

	public DAOException(Throwable ex)
	{
		super(ex);
	}
	
	public DAOException(String errorMessage, Throwable ex)
	{
		super(errorMessage, ex);
	}

}
