package com.mustatafavardal.hotel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rooms", uniqueConstraints = @UniqueConstraint(columnNames = {"roomNumber"}))
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 13)
	private int id;

	@Column(name = "roomNumber")
	private String roomNumber;

	@Column(name = "entryTime")
	private String entryTime;

	@Column(name = "exitTime")
	private String exitTime;
	
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	

}
