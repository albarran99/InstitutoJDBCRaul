package org.iesfm.instituto.jdbc;

import org.iesfm.instituto.jdbc.DAO.GroupDAO;
import org.iesfm.instituto.jdbc.DAO.StudentDAO;
import org.iesfm.instituto.jdbc.DAO.TitleDAO;
import org.iesfm.instituto.jdbc.programs.InstitutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        InstitutoConfiguration.class
                );

        TitleDAO program = context.getBean(TitleDAO.class);
        List<Title> titles = program.list();
        for (Title title : titles) {
            System.out.println(title.toString());
        }

        StudentDAO program2 = context.getBean(StudentDAO.class);
        List<Student> students = program2.list();
        for (Student student : students) {
            System.out.println(student.toString());
        }

        GroupDAO program3 = context.getBean(GroupDAO.class);
        List<Group> groups = program3.list();
        for (Group group : groups) {
            System.out.println(group);
        }
    }
}
