package org.iesfm.instituto.jdbc.insertProgram;

import org.iesfm.instituto.jdbc.DAO.StudentDAO;
import org.iesfm.instituto.jdbc.DAO.TitleDAO;
import org.iesfm.instituto.jdbc.Student;
import org.iesfm.instituto.jdbc.Title;
import org.iesfm.instituto.jdbc.reader.StudentReader;
import org.iesfm.instituto.jdbc.reader.TitleReader;

public class InsertStudentProgram {
    private StudentReader studentReader;
    private StudentDAO studentDAO;

    public InsertStudentProgram(StudentReader studentReader, StudentDAO studentDAO) {
        this.studentReader = studentReader;
        this.studentDAO = studentDAO;
    }

    public void insertar() {
        Student student = studentReader.readStudent();
        studentDAO.insert(student);
    }
}
