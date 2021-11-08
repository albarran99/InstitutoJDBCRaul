package org.iesfm.instituto.jdbc.reader;

import org.iesfm.instituto.jdbc.Student;
import org.iesfm.instituto.jdbc.reader.TitleReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class StudentReader {

    private static Logger log = LoggerFactory.getLogger(StudentReader.class);

    public Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student readStudent() {
        log.info("Introduce el nif");
        String nifStudent = scanner.nextLine();
        log.info("Introduce el nombre");
        String nameStudent = scanner.nextLine();
        log.info("Introduce el apellido");
        String surnameStudent = scanner.nextLine();
        log.info("Introduce el codigo postal");
        int zipcode = scanner.nextInt();
        scanner.nextLine();
        log.info("Introduce la direccion");
        String addressStudent = scanner.nextLine();
        log.info("Introduce el correo");
        String email = scanner.nextLine();

        return new Student(nifStudent, nameStudent, surnameStudent, zipcode, addressStudent, email);
    }
}
