package com.example.sample1.dao;

import com.example.sample1.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Component
public class TodoDao {
@Autowired
private DataSource dataSource;
    public List<Todo> list() throws Exception{
        String sql = "SELECT * FROM todo ORDER BY id DESC";
        Collection collection= dataSource.getConnection();
        Statement statement = collection;
        ResultSet resultSet = statement.executeQuery(sql);

        <Todo> list = new ArrayList<>();
        (collection;statement;resultSet)
        while (resultSet.next()) {

        }
        return null;
    }

    public void insert(Todo todo) {
    }
}
