package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChartController {

	@RequestMapping("/randomChart")
	public Chart randomChart (@RequestParam(value="size", required=true, defaultValue="3") int size){
		return new Chart(3,0,10);
	}
}
