package org.iesfm.institutojdbc;

import org.iesfm.instituto.jdbc.DAO.TitleDAO;
import org.iesfm.instituto.jdbc.Student;
import org.iesfm.instituto.jdbc.Title;
import org.iesfm.instituto.jdbc.programs.InstitutoConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.LinkedList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {InstitutoConfiguration.class})
public class TittleDAOTest {

    @Autowired
    private TitleDAO tittleDAO;

    @Test
    public void insert() {
        Title title = new Title(
                null,
                "Administracion",
                "GS",
                "Admin",
                "cosas de adminstracion"
        );
        tittleDAO.insert(title);

        Assert.assertNotNull(tittleDAO.get("Finanzas"));
    }

    @Test
    public void get() {
        Assert.assertNotNull(tittleDAO.get("DAM"));
        Assert.assertNull(tittleDAO.get("DAM2"));
    }

    @Test
    public void listInformatica() {
        List<Title> titles = tittleDAO.listFamily("Informatica");
        Assert.assertEquals(1, titles.size());
    }

}
