package simpli.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lendController {
	
	@RequestMapping("/hello")
	public String sayhi(){
		return "Hi";
	}

}
