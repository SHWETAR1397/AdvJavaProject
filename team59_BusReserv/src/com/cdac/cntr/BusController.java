package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Bus;
import com.cdac.dto.User;
import com.cdac.service.BusServ;

@Controller
public class BusController {
	
	@Autowired
	private BusServ busService;
	
	
	@RequestMapping(value = "/prep_bus_add_form.htm",method = RequestMethod.GET)
	public String prepBusAddForm(ModelMap map) {
		map.put("bus", new Bus());
		return "bus_add_form";
	}
	
	@RequestMapping(value = "/bus_add.htm",method = RequestMethod.POST)
	public String BusAdd(Bus bus,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		bus.setUser_Id(userId); 
		busService.addBus(bus);
		return "home";
	}
	
	@RequestMapping(value = "/bus_list.htm",method = RequestMethod.GET)
	public String allExpenses(ModelMap map,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Bus> li = busService.selectAll(userId);
		map.put(" busList", li);
		return "bus_list";
	}
	
	@RequestMapping(value = "/bus_delete.htm",method = RequestMethod.GET)
	public String busDelete(@RequestParam int busId,ModelMap map,HttpSession session) {
		
		busService.removeBus(busId);
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Bus> li = busService.selectAll(userId);
		map.put("buslist", li);
		return "bus_list";
	}
	
	@RequestMapping(value = "/bus_update_form.htm",method = RequestMethod.GET)
	public String busUpdateForm(@RequestParam int busId,ModelMap map) {
		
		Bus bs= busService.findBus(busId);
		map.put("bus", bs);
		
		return "bus_update_form";
	}
	
	@RequestMapping(value = "/bus_update.htm",method = RequestMethod.POST)
	public String busUpdate(Bus bus,ModelMap map,HttpSession session) {
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		bus.setUser_Id(userId);
		busService.modifyBus(bus);
			
		List<Bus> li = busService.selectAll(userId);
		map.put("buslist", li);
		return "bus_list";
	}
	
}
