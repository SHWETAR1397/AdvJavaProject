package com.cdac.service;

import java.util.List;

import com.cdac.dto.Booking;

public interface BookingServ {
	void addbooking(Booking booking);
	void removebooking(int userId);
	Booking Bookingdetails(int bus_no);
	void modifyBooking(Booking booking);
	List<Booking> All(int userId);
}
