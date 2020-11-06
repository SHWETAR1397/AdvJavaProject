package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Bus;

@Repository
public class BusDaoImple implements BusDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void insertBus(Bus bus) {

		
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("insert into Bus (from,to,user_id,date,total_seat) values (?,?,?,?,?)");
				q.setString(0, bus.getFrom1());
				q.setString(1,bus.getTo1());
				q.setInteger(2, bus.getUser_Id());
				q.setString(3, bus.getDate());
				q.setString(4, bus.getTotal_seat());
				q.executeUpdate();
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	

	@Override
	public void deleteBus(int busId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Bus(busId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public Bus selectBus(int busId) {
		Bus bus = hibernateTemplate.execute(new HibernateCallback<Bus>() {

			@Override
			public Bus doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Bus bs= (Bus)session.get(Bus.class, busId);
				tr.commit();
				session.flush();
				session.close();
				return bs;
			}
			
		});
		return bus;
	}

	@Override
	public void updateBus(Bus bus) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				
				Bus bs = (Bus)session.get(Bus.class, bus.getBus_Id());
				bs.setTotal_seat(bus.getTotal_seat()); 
				
				session.update(bus);
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public List<Bus> selectAll(int userId) {
		List<Bus> busList = hibernateTemplate.execute(new HibernateCallback<List<Bus>>() {

			@Override
			public List<Bus> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Bus where userId = ?");
				q.setInteger(0, userId);
				List<Bus> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return busList;
	}
}



	

