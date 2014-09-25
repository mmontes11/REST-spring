package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import utils.ChartUtils;
import classes.Response;

@RestController
public class ResponseController {

	@RequestMapping("/chart/random")
	public @ResponseBody Response randomChart 
	(@RequestParam(value="numXaxis", required=true, defaultValue="3") int numXaxis,
	@RequestParam(value="numYaxis", required=true, defaultValue="3") int numYaxis,		
	@RequestParam(value="min", required=false, defaultValue="0") int min,
	@RequestParam(value="max", required=false, defaultValue="10") int max){	
		return ChartUtils.generateRandomChart(numXaxis, numYaxis, min, max);
	}
	
	@RequestMapping("/ping")
	public @ResponseBody boolean ping (){
		return true;
	}
}
