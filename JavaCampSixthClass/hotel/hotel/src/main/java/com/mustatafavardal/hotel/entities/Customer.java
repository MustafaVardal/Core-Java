package com.mustatafavardal.hotel.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",length = 13)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	//@ManyToMany(fetch = FetchType.LAZY)
	 @ManyToMany(mappedBy = "customers", fetch = FetchType.LAZY)
	 @JsonBackReference
	private List<Room> rooms;
	 
	 @Override
	 public String toString() {
		 return "Customer[id=" + id +" , customer_name=" + name + " , Email=" + email + "]";
	 }
	
}
