package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

	@RequestMapping("/randomChart")
	public Chart randomChart (@RequestParam(value="size", required=true, defaultValue="3") int size,
							  @RequestParam(value="min", required=false, defaultValue="0") int min,
							  @RequestParam(value="max", required=false, defaultValue="10") int max){
		return null;
	}
}
