package com.mustatafavardal.hotel.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rooms")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 13)
	private int id;

	@Size(min = 0, max = 200)
	@Column(name = "roomNumber")
	private String roomNumber;

	@Column(name = "entryTime")
	private String entryTime;

	@Column(name = "exitTime")
	private String exitTime;

	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "room_customer", joinColumns = @JoinColumn(name =
	 * "roomId"), inverseJoinColumns = @JoinColumn(name = "customer_id"))
	 */
	 @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	    @JoinTable(name = "rooms_mapping", joinColumns = @JoinColumn(name = "room_id", referencedColumnName = "id"), 
	        	inverseJoinColumns = @JoinColumn(name = "customer_id", referencedColumnName = "id"))
	 
	 @JsonManagedReference
	private List<Customer> customers;
	 
	 @Override
	 public String toString() {
		 return "Room[id=" + id +" , room_number=" + roomNumber + " , entryTime=" + entryTime + " , exitTime=" + exitTime;
	 }

}
