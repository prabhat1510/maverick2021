package main.java.jpatraining.manytomany;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
/*
 * Product is the inverse entity
 * inverse entity maps to owning entity by using mappedBy element
 */
@Entity
@Table(name="product_master")
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "product_id")
	private Integer productId;
	@Column(name = "product_name")
	private String productName;
	private double price;
	
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="products")
	private Set<Order> orders;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}

	
	
	
	
	
}
