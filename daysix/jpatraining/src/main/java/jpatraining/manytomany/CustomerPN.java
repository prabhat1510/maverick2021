package main.java.jpatraining.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
class CustomerPN {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    Set<PhoneNumber> phones;
    @ManyToMany
    @JoinTable(name="CUST_PHONES")
    public Set<PhoneNumber> getPhones() {
        return phones;
    }
}
