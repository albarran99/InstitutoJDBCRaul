package org.iesfm.instituto.jdbc.programs;

import org.iesfm.instituto.jdbc.DAO.GroupDAO;
import org.iesfm.instituto.jdbc.DAO.StudentDAO;
import org.iesfm.instituto.jdbc.DAO.TitleDAO;
import org.iesfm.instituto.jdbc.insertProgram.InsertGroupProgram;
import org.iesfm.instituto.jdbc.insertProgram.InsertStudentProgram;
import org.iesfm.instituto.jdbc.insertProgram.InsertTitleProgram;
import org.iesfm.instituto.jdbc.reader.GroupReader;
import org.iesfm.instituto.jdbc.reader.StudentReader;
import org.iesfm.instituto.jdbc.reader.TitleReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Scanner;

@Configuration
public class InstitutoConfiguration {

    @Bean
    public TitleReader titleReader(Scanner scanner) {
        return new TitleReader(scanner);
    }

    @Bean
    public StudentReader studentReader(Scanner scanner) {
        return new StudentReader(scanner);
    }

    @Bean
    public GroupReader groupReader(Scanner scanner) {
        return new GroupReader(scanner);
    }

    @Bean
    public TitleDAO titleDAO(NamedParameterJdbcTemplate jdbc) {
        return new TitleDAO(jdbc);
    }

    @Bean
    public StudentDAO studentDAO(NamedParameterJdbcTemplate jdbcTemplate) {
        return new StudentDAO(jdbcTemplate);
    }

    @Bean
    public GroupDAO groupDAO(NamedParameterJdbcTemplate jdbcTemplate) {
        return new GroupDAO(jdbcTemplate);
    }

    @Bean
    public InsertTitleProgram insertTitleProgram(TitleDAO titleDAO, TitleReader titleReader) {
        return new InsertTitleProgram(titleReader, titleDAO);
    }

    @Bean
    public InsertStudentProgram studentProgram(StudentDAO studentDAO, StudentReader studentReader) {
        return new InsertStudentProgram(studentReader, studentDAO);
    }

    @Bean
    public InsertGroupProgram groupProgram(GroupDAO groupDAO, GroupReader groupReader) {
        return new InsertGroupProgram(groupDAO, groupReader);
    }

    @Bean
    public NamedParameterJdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:13306/Instituto");
        dataSource.setUsername("root");
        dataSource.setPassword("federica");
        return dataSource;
    }

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

}
