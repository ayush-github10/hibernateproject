package com.sopra.manytoone;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
public class Cart {
	
	@Id
	private long cartId;
	private double total;
	private String name;
	@OneToMany(mappedBy = "cart")
	private Set<Items> items;
	public long getId() {
		return cartId;
	}
	public void setId(long id) {
		this.cartId = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [id=" + cartId + ", total=" + total + ", name=" + name + ", items=" + items + "]";
	}

}
