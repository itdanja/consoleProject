package team.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public Dao() {
		try {
			con = DriverManager.getConnection("","root","1234");
		}catch (Exception e) {	}
	}
}

