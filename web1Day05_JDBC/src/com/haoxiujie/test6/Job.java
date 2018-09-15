package com.haoxiujie.test6;

import java.util.Objects;

public class Job {
    private int id;
    private String jname;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(jname, job.jname) &&
                Objects.equals(description, job.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jname, description);
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jname='" + jname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Job() {
    }

    public Job(int id, String jname, String description) {
        this.id = id;
        this.jname = jname;
        this.description = description;
    }
}
