package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cdac.dao.BookingDao;
import com.cdac.dto.Booking;

public class BookingServImple implements BookingServ{

	@Autowired
	private BookingDao bookingDao;
	@Override
	public void addbooking(Booking booking) {
		bookingDao.insertbookingdetails(booking);
		
	}

	@Override
	public void removebooking(int userId) {
		bookingDao.deletebooking(userId);
		
	}

	@Override
	public Booking Bookingdetails(int bus_no) {
		return bookingDao.selectBookingdetails(bus_no);
	}

	@Override
	public void modifyBooking(Booking booking) {
		 bookingDao.update(booking);
		
	}

	@Override
	public List<Booking> All(int userId) {
		return bookingDao.selectAll(userId);
	}

	
}
