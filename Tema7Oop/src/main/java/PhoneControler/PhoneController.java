package PhoneControler;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import PhoneDao.PhoneDAO;
import PhonePojo.Phone;

@Controller
public class PhoneController {

	@GetMapping("/phone")
	public String singleSong(@RequestParam int id, Model model) throws SQLException, ClassNotFoundException {
		Phone phone = PhoneDAO.getById(id);
		
		model.addAttribute("s", phone);
		
		return "phone.jsp";
	}
	
	@GetMapping("/phones")
	public String allSongs(Model model) throws SQLException, ClassNotFoundException {
		ArrayList<Phone> allPhones = PhoneDAO.getAll();
		
		model.addAttribute("all", allPhones);
		
		return "phones.jsp";
	}
}
