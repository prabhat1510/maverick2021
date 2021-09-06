package main.java.jpatraining.manytomany;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * Order is the owning entity, owning entity
 * should have @JoinTable
 */
@Entity
@Table(name = "order_master")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "order_id")
	private Integer orderId;
	@Temporal(TemporalType.DATE)	
	@Column(name = "order_date")
	private Date orderDate;
	@ManyToMany(cascade = CascadeType.ALL)
	/*
	 * Columns order_id and product_id implicitly
	 * be composite primary key of the join table
	 */
	@JoinTable(name = "product_orders", 
			joinColumns = { @JoinColumn(name = "order_id") }, 
			inverseJoinColumns = 
						{ @JoinColumn(name = "product_id") })
	private Set<Product> products;
	
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
	
}
