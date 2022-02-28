package com.springTransaction;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account> {

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account1=new Account(rs.getLong(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
		return account1;
	}

}
