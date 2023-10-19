package com.radionbes.spring.RiverBank.services;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.*;

@Service
@Slf4j
@NoArgsConstructor
public class ServiceHomePage {
    private String name;
    private Long score;


    public String getPerson(){
        String res;
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_db", "postgres", "1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select surname from users where id = 1");
            resultSet.next();
            res = resultSet.getString(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return res;
    }

    public String getName() {
        return name;
    }

    public Long getScore() {
        return score;
    }



}
