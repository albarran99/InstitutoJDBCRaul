package org.iesfm.instituto.jdbc;

import java.util.Objects;

public class Group {

    private int groupId;
    private String course;
    private String letter;
    private String title;
    private int groupYear;

    public Group(int groupId, String course, String letter, String title, int groupYear) {
        this.groupId = groupId;
        this.course = course;
        this.letter = letter;
        this.title = title;
        this.groupYear = groupYear;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGroupYear() {
        return groupYear;
    }

    public void setGroupYear(int groupYear) {
        this.groupYear = groupYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupId == group.groupId && groupYear == group.groupYear && Objects.equals(course, group.course) && Objects.equals(letter, group.letter) && Objects.equals(title, group.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, course, letter, title, groupYear);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", course='" + course + '\'' +
                ", letter='" + letter + '\'' +
                ", title='" + title + '\'' +
                ", groupYear=" + groupYear +
                '}';
    }
}
