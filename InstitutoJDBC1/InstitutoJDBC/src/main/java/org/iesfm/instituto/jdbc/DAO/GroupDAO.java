package org.iesfm.instituto.jdbc.DAO;

import org.iesfm.instituto.jdbc.Group;
import org.iesfm.instituto.jdbc.Title;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupDAO {

    private final static String SELECT_GROUP = "SELECT * FROM titleGroup";

    private final static String INSERT_GROUP =
            "INSERT INTO titleGroup(" +
            "   group_id," +
            "   course," +
            "   letter," +
            "   title," +
            "   group_year" +
            ") " +
            "VALUES(" +
            "   :group_year," +
            "   :course," +
            "   :letter," +
            "   :title" +
            "   :group_year" +
            ")";

    private NamedParameterJdbcTemplate jdbcTemplate;

    public GroupDAO(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Group group) {
        Map<String, Object> params = new HashMap<>();
        params.put("group_id", group.getGroupId());
        params.put("course", group.getCourse());
        params.put("letter", group.getLetter());
        params.put("title", group.getTitle());
        params.put("group_year", group.getGroupYear());
        jdbcTemplate.update(INSERT_GROUP, params);
    }

    public List<Group> list() {
        Map<String, Object> params = new HashMap<>();
        return jdbcTemplate.query(
                SELECT_GROUP,
                params,
                (rs, rownum) ->
                        new Group(
                                rs.getInt("group_id"),
                                rs.getString("course"),
                                rs.getString("letter"),
                                rs.getString("title"),
                                rs.getInt("group_year")
                        )
        );
    }
}
