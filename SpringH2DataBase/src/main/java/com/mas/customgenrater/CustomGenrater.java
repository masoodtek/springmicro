package com.mas.customgenrater;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenrater implements IdentifierGenerator{
    Integer value = null;
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
			String sql="select sequence_mass.nextval from dual";
		try {
			Connection connection = session.connection();
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sql);
			if(executeQuery.next()) {
				int value = executeQuery.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return String.valueOf(value);
	}

}
