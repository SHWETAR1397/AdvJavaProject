package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bus")
public class Bus {
	@Id
	@GeneratedValue
	@Column(name = "bus_id")
	private int bus_Id;
	@Column(name = "from1")
	private String from1;
	@Column(name = "to1")
	private String to1;
	@Column(name = "total_seat")
	private String total_seat;
	@Column(name = "user_id")
	private int user_Id;
	public int getUser_Id() {
		return user_Id;
	}
	@Column(name = "date")
	public String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBus_Id() {
		return bus_Id;
	}
	public void setBus_Id(int bus_Id) {
		this.bus_Id = bus_Id;
	}
	public String getFrom1() {
		return from1;
	}
	public void setFrom1(String from1) {
		this.from1 = from1;
	}
	public String getTo1() {
		return to1;
	}
	public void setTo1(String to1) {
		this.to1 = to1;
	}
	public String getTotal_seat() {
		return total_seat;
	}
	public void setTotal_seat(String total_seat) {
		this.total_seat = total_seat;
	}
	public Bus(int bus_Id) {
		super();
		this.bus_Id = bus_Id;
	}
	
	
}

