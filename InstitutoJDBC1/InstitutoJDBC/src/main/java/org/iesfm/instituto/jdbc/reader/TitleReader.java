package org.iesfm.instituto.jdbc.reader;

import org.iesfm.instituto.jdbc.Title;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class TitleReader {

    private static Logger log = LoggerFactory.getLogger(TitleReader.class);

    public Scanner scanner;

    public TitleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Title readTitle() {

        Integer id = null;
        scanner.nextLine();
        log.info("Introduce el nombre");
        String nameTittle = scanner.nextLine();
        log.info("Introduce el tipo de grado");
        String levelTittle = scanner.nextLine();
        log.info("Introduce la familia profesional");
        String familyTittle = scanner.nextLine();
        log.info("Introduce una descripcion del modulo formativo");
        String descriptionTittle = scanner.nextLine();

        return new Title(id, nameTittle, levelTittle, familyTittle, descriptionTittle);
    }
}
