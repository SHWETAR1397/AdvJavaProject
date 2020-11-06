package com.cdac.cntr;
	
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
	import com.cdac.service.UserServ;

	@Controller
	public class BookingController {

		@Autowired
		private BusServ busService;
		@Autowired
		private UserServ userService;
		
		@RequestMapping(value = "/book_bus_seat.htm", method = RequestMethod.GET)
		public String bookTrainSeat(ModelMap map, HttpSession session) {
			User user = (User) session.getAttribute("user");
			map.put("user", user);
			return "select_bus_details";
		}

		@RequestMapping(value = "/book_bus_form.htm", method = RequestMethod.GET)
		public String bookBusForm(@RequestParam int busId, ModelMap map, HttpSession session) {
			Bus bus= busService.findBus(busId);
			session.setAttribute("bookBusId", busId);
			map.put("bus", bus);
			return "book_form";
		}

		

	

	}
