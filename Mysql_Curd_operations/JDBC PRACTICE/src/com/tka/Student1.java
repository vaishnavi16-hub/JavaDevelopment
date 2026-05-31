package com.tka;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student1 {
	public static void  main(String[]args)throws ClassNotFoundException,SQLException {
//		2. register & load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		3. step get connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320","root","root");
		
		
//		4. Step we have two option statement (static) and Prepared statement that is (dynamic)
		
		Statement  s= c.createStatement();
		
		
//		5. step execute query  and then  get result
			int checked = s.executeUpdate("insert into student(id,name,city)values(123,'vaishnavi','pune')");
			
			if(checked > 0) {
				System.out.println("Inserted.!");
			}else {
				System.out.println("Not inserted........!");
			}
	}
}
