package org.iesfm.instituto.jdbc.reader;

import org.iesfm.instituto.jdbc.Group;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class GroupReader {

    private static Logger log = LoggerFactory.getLogger(GroupReader.class);

    private Scanner scanner;

    public GroupReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Group readGroup() {
        Integer gruopId = null;
        log.info("Introduce el curso");
        String courseGroup = scanner.nextLine();
        log.info("Introduce la letra del grupo");
        String  letterGroup = scanner.nextLine();
        log.info("Introduce el titulo del grupo");
        String titleGroup = scanner.nextLine();
        log.info("Introduce el año");
        int yearGroup = scanner.nextInt();
        scanner.nextLine();

        return new Group(gruopId, courseGroup, letterGroup, titleGroup, yearGroup);
    }
}
