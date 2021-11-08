package org.iesfm.instituto.jdbc.DAO;

import org.iesfm.instituto.jdbc.Student;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDAO {

    private final static String SELECT_STUDENT = "SELECT * FROM student";

    private final static String INSERT_STUDENT = "INSERT INTO student(" +
            "   nif," +
            "   student_name," +
            "   student_surname," +
            "   zipcode," +
            "   address, " +
            "   email    " +
            ") " +
            "VALUES(" +
            "   :student_name," +
            "   :student_surname," +
            "   :zipcode," +
            "   :address, " +
            "   :email " +
            ")";

    private NamedParameterJdbcTemplate jdbcTemplate;

    public StudentDAO(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Student student) {
        String querry = "INSERT INTO student(" +
                "   nif," +
                "   student_name," +
                "   student_surname," +
                "   zipcode," +
                "   address, " +
                "   email    " +
                ") " +
                "VALUES(" +
                student.getNif() + "," +
                student.getName() + "," +
                student.getSurname() + "," +
                student.getZipCode() + "," +
                student.getAddress() + "," +
                student.getEmail() + "" +
                ")";

        Map<String, Object> params = new HashMap<>();
        jdbcTemplate.update(INSERT_STUDENT, params);
    }

    public List<Student> list() {
        Map<String, Object> params = new HashMap<>();
        return jdbcTemplate.query(
                SELECT_STUDENT,
                params, (rs, rowNum) ->
                        new Student(
                                rs.getString("nif"),
                                rs.getString("student_name"),
                                rs.getString("student_name"),
                                rs.getInt("zipcode"),
                                rs.getString("address"),
                                rs.getString("email")
                        )
        );

    }

}
