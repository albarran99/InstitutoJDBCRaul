package org.iesfm.instituto.jdbc.reader;

import org.iesfm.instituto.jdbc.Enrrollment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class EnrrollmentReader {

    private static Logger log = LoggerFactory.getLogger(EnrrollmentReader.class);

    private Scanner scanner;

    public EnrrollmentReader(Scanner scanner) {
        this.scanner = scanner;
    }

}
