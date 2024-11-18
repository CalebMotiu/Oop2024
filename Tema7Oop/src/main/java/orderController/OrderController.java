package orderController;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import orderDAO.OrderDAO;
import orderPojo.OrderPojo;

@Controller
public class OrderController {

	@GetMapping("/order")
	public String singleSong(@RequestParam int id, Model model) throws SQLException, ClassNotFoundException {
		OrderPojo order = OrderDAO.getById(id);
		
		model.addAttribute("s", order);
		
		return "order.jsp";
	}
	
	@GetMapping("/orders")
	public String allSongs(Model model) throws SQLException, ClassNotFoundException {
		ArrayList<OrderPojo> allOrders = OrderDAO.getAll();
		
		model.addAttribute("all", allOrders);
		
		return "orders.jsp";
	}
}
