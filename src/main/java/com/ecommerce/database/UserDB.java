package com.ecommerce.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDB {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public UserDB() {}

  public void createTableIfNotExists(String tableName, String[] columnNames, String[] columnTypes) {
    String query = "CREATE TABLE IF NOT EXISTS " + tableName + "";
  }

}
