package org.iesfm.institutojdbc;

import org.iesfm.instituto.jdbc.DAO.StudentDAO;
import org.iesfm.instituto.jdbc.Student;
import org.iesfm.instituto.jdbc.programs.InstitutoConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {InstitutoConfiguration.class})
public class StudentDAOTest {

    @Autowired
    private StudentDAO studentDAO;

    @Test
    public void listStudents() {
        List<Student> students = studentDAO.listStudent();
        Assert.assertEquals(0, students.size());
    }

}
