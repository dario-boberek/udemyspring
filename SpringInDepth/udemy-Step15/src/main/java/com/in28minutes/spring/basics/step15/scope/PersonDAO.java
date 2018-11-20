package com.in28minutes.spring.basics.step15.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//i21c pierwszy poziom zagniezdzeniaa - defaultowy SKOPE
@Component("PersonDAOStep15")
public class PersonDAO {

	@Autowired
	JdbcConnection jdbcConnection; //i21c drugi poziom zagniezdzenia - jaki scope?

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
