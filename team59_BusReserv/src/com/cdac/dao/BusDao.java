package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Bus;

public interface BusDao {
	void insertBus(Bus bus);
	void deleteBus(int busId);
	Bus selectBus(int busId);
	void updateBus(Bus bus);
	List<Bus> selectAll(int userId);
	

}
