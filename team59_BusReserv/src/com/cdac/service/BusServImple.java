package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.BusDao;
import com.cdac.dto.Bus;
@Service
public class BusServImple implements BusServ{
	
	@Autowired
	private BusDao busDao;
	
	@Override
	public void addBus(Bus bus) {
		busDao.insertBus(bus);
		
	}

	@Override
	public void removeBus(int busId) {
		busDao.deleteBus(busId);
		
	}

	@Override
	public Bus findBus(int busId) {
		return busDao.selectBus(busId);
	}

	@Override
	public void modifyBus(Bus bus) {
		busDao.updateBus(bus);
		
	}

	@Override
	public List<Bus> selectAll(int userId) {
		return busDao.selectAll(userId);
	}
	
	
	
	
}

