package spittr;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//based on @Component
@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=GET)
	public String home(){
		return "home";
	}
}