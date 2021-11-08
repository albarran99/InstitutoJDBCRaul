package org.iesfm.instituto.jdbc.insertProgram;

import org.iesfm.instituto.jdbc.DAO.TitleDAO;
import org.iesfm.instituto.jdbc.Title;
import org.iesfm.instituto.jdbc.reader.TitleReader;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class InsertTitleProgram {

    private TitleReader titleReader;
    private TitleDAO titleDAO;

    public InsertTitleProgram(TitleReader titleReader, TitleDAO titleDAO) {
        this.titleReader = titleReader;
        this.titleDAO = titleDAO;
    }

    public void insertar() {
      Title title = titleReader.readTitle();
      titleDAO.insert(title);
    }
}
