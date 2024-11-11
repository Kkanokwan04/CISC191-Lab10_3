package edu.sdccd.cisc191;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String details;

    public Option() {}

    public Option(String details) {
        this.details = details;
    }

    public long getId() {
        return id;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Option [id=" + id + ", details=" + details + "]";
    }

}
