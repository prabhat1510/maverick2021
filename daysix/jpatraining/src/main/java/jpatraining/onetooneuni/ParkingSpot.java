package main.java.jpatraining.onetooneuni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ParkingSpot {
    @Id
    int id;
    String garage;
    @OneToOne(mappedBy="location.parkingSpot")
    EmployeeNew assignedTo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public EmployeeNew getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(EmployeeNew assignedTo) {
        this.assignedTo = assignedTo;
    }
}
