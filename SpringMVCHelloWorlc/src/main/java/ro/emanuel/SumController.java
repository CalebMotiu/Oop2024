package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SumController {

	@GetMapping("/sum")
	public String sumPage(Model model) {
		model.addAttribute("s",40);
		return "sum.jsp";
	}
	
	@GetMapping("/sumModel")
	public ModelAndView sumM() {
		ModelAndView mav = new ModelAndView("sum.jsp");
		mav.addObject("s",50);
		return mav;
	}
		
	@RequestMapping(value = "/sumMapping") 
	public String sumPage1(){
		return "sum.jsp";
	}
}
