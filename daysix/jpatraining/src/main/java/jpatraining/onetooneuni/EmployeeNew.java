package main.java.jpatraining.onetooneuni;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeNew {

    @Id
    int id;

    @Embedded
    LocationDetails location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocationDetails getLocation() {
        return location;
    }

    public void setLocation(LocationDetails location) {
        this.location = location;
    }


}
