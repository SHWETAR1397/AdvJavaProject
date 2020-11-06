package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	
		@Id
		@GeneratedValue
		
		@Column(name="bus_no")
		private int bus_no;
		
		@Column(name="source")
		private String source;
		
		@Column(name="destination")
		private String destination;
		
		@Column(name="date")
		private String date;
		
		
		private int user_Id;


		public int getBus_no() {
			return bus_no;
		}


		public void setBus_no(int bus_no) {
			this.bus_no = bus_no;
		}


		public String getSource() {
			return source;
		}


		public void setSource(String source) {
			this.source = source;
		}


		public String getDestination() {
			return destination;
		}


		public void setDestination(String destination) {
			this.destination = destination;
		}


		public String getDate() {
			return date;
		}


		public void setDate(String date) {
			this.date = date;
		}


		public int getUser_Id() {
			return user_Id;
		}


		public void setUser_Id(int user_Id) {
			this.user_Id = user_Id;
		}


		public Booking() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Booking(int user_Id) {
			super();
			this.user_Id = user_Id;
		}
		
}
