package com.cdac.service;

import java.util.List;

import com.cdac.dao.BusDao;
import com.cdac.dto.Bus;

public interface BusServ {
	void addBus(Bus bus);
	void removeBus(int busId);
	Bus findBus(int busId);
	void modifyBus(Bus bus);
	List<Bus> selectAll(int userId);

}
