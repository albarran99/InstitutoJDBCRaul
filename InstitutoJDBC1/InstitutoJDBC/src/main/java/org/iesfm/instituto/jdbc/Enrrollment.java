package org.iesfm.instituto.jdbc;

import java.util.Objects;

public class Enrrollment {
    private int id;
    private String nif;
    private int year;
    private int titleId;
    private int groupId;
    private String status;

    public Enrrollment(int id, String nif, int year, int titleId, int groupId, String status) {
        this.id = id;
        this.nif = nif;
        this.year = year;
        this.titleId = titleId;
        this.groupId = groupId;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enrrollment that = (Enrrollment) o;
        return id == that.id && year == that.year && titleId == that.titleId && groupId == that.groupId && Objects.equals(nif, that.nif) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nif, year, titleId, groupId, status);
    }

    @Override
    public String toString() {
        return "Enrrollment{" +
                "id=" + id +
                ", nif='" + nif + '\'' +
                ", year=" + year +
                ", titleId=" + titleId +
                ", groupId=" + groupId +
                ", status='" + status + '\'' +
                '}';
    }
}
