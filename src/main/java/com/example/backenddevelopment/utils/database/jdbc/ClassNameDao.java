package com.example.backenddevelopment.utils.database.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Driver;

@Repository
public class ClassNameDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public int add(){
        return jdbcTemplate.update("sql");//"INSERT INTO tableName(args1,args2……） VALUES (?,?……)
    }
}
