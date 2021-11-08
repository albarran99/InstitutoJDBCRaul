package org.iesfm.instituto.jdbc.insertProgram;

import org.iesfm.instituto.jdbc.DAO.GroupDAO;
import org.iesfm.instituto.jdbc.DAO.TitleDAO;
import org.iesfm.instituto.jdbc.Group;
import org.iesfm.instituto.jdbc.Title;
import org.iesfm.instituto.jdbc.reader.GroupReader;
import org.iesfm.instituto.jdbc.reader.TitleReader;

public class InsertGroupProgram {
    private GroupDAO groupDAO;
    private GroupReader groupReader;


    public InsertGroupProgram(GroupDAO groupDAO, GroupReader groupReader) {
        this.groupDAO = groupDAO;
        this.groupReader = groupReader;
    }

    public void insertar() {
        Group group = groupReader.readGroup();
        groupDAO.insert(group);
    }
}
