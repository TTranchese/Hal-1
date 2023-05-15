package com.example.Hal1;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String modelName;
	@Column(nullable = false)
	private String serialNumber;
	@Column
	private double currentPrice;
	
	public Car() {
	}
	
	public Car(int id, String modelName, String serialNumber, double currentPrice) {
		this.id = id;
		this.modelName = modelName;
		this.serialNumber = serialNumber;
		this.currentPrice = currentPrice;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
}
