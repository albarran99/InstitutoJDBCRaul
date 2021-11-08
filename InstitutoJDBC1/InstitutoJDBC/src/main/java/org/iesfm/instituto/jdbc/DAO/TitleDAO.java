package org.iesfm.instituto.jdbc.DAO;

import org.iesfm.instituto.jdbc.Title;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TitleDAO {

    private final static String SELECT_TITLES = "SELECT * FROM title";

    private final static String INSERT_TITLE =
            "INSERT INTO title(" +
            "   title_name," +
            "   title_level," +
            "   family," +
            "   title_description" +
            ") " +
            "VALUES(" +
            "   :name," +
            "   :level," +
            "   :family," +
            "   :description" +
            ")";

    private NamedParameterJdbcTemplate jdbc;

    public TitleDAO(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void insert(Title title) {
        String query = "INSERT INTO title(" +
                "   title_name," +
                "   title_level," +
                "   family," +
                "   title_description" +
                ") " +
                "VALUES(" +
                title.getName() + "," +
                title.getLevel() + "," +
                title.getFamily() + "," +
                title.getDescription() + "" +
                ")";
        Map<String, Object> params = new HashMap<>();
        jdbc.update(INSERT_TITLE, params);
    }

    public List<Title> list() {
        Map<String, Object> params = new HashMap<>();
        return jdbc.query(
                SELECT_TITLES,
                params,
                    (rs, rownum) ->
                            new Title(
                                    rs.getInt("title_id"),
                                    rs.getString("title_name"),
                                    rs.getString("title_name"),
                                    rs.getString("title_name"),
                                    rs.getString("title_name")
                            )
        );
    }
}
