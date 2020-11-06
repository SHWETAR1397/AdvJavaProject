package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Booking;

public interface BookingDao {
	void insertbookingdetails(Booking booking);
	void deletebooking(int user_id);
	Booking selectBookingdetails(int bus_no);
	void update(Booking booking);
	List<Booking> selectAll(int user_id);
}
