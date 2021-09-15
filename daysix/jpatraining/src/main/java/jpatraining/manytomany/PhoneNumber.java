package main.java.jpatraining.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "CUST_PHONES")
public class PhoneNumber {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    Set<CustomerPN> customers;

    @ManyToMany(mappedBy="phones")
    public Set<CustomerPN> getCustomers() {
        return customers;
    }
}
