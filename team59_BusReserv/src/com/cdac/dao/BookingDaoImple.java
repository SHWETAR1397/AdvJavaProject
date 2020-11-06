package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Booking;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookingDaoImple implements BookingDao {


	

		
		@Autowired
		private HibernateTemplate hibernateTemplate;
		@Override
		public void insertbookingdetails(Booking booking) {
			hibernateTemplate.execute(new HibernateCallback<Void>() {

				@Override
				public Void doInHibernate(Session session) throws HibernateException {
					Transaction tr = session.beginTransaction();
					session.save(booking);
					tr.commit();
					session.flush();
					session.close();
					return null;
				}
				
			});
		}

		@Override
		public void deletebooking(int userId) {
			hibernateTemplate.execute(new HibernateCallback<Void>() {

				@Override
				public Void doInHibernate(Session session) throws HibernateException {
					Transaction tr = session.beginTransaction();
					session.delete(new Booking(userId));
					tr.commit();
					session.flush();
					session.close();
					return null;
				}
				
			});
		}

		@Override
		public Booking selectBookingdetails(int bus_no) {
			Booking booking = hibernateTemplate.execute(new HibernateCallback<Booking>() {

				@Override
				public Booking doInHibernate(Session session) throws HibernateException {
					Transaction tr = session.beginTransaction();
					Booking bk = (Booking)session.get(Booking.class, bus_no);
					tr.commit();
					session.flush();
					session.close();
					return bk;
				}
				
			});
			return booking;
		}

		@Override
		public void update(Booking booking) {
			hibernateTemplate.execute(new HibernateCallback<Void>() {

				@Override
				public Void doInHibernate(Session session) throws HibernateException {
					Transaction tr = session.beginTransaction();
					session.update(booking);
					tr.commit();
					session.flush();
					session.close();
					return null;
				}
				
			});
			
		}

		@Override
		public List<Booking> selectAll(int userId) {
			List<Booking> buslist = hibernateTemplate.execute(new HibernateCallback<List<Booking>>() {

				@Override
				public List<Booking> doInHibernate(Session session) throws HibernateException {
					Transaction tr = session.beginTransaction();
					Query q = session.createQuery("from Booking where userId = ?");
					q.setInteger(0, userId);
					List<Booking> li = q.list();
					System.out.println(li); 
					tr.commit();
					session.flush();
					session.close();
					return li;
				}
				
			});
			return buslist;
		}


		
	

	}


