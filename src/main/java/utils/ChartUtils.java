package utils;

import java.util.Random;

import classes.Chart;
import classes.Response;
import classes.Title;
import classes.XAxis;

public class ChartUtils {
	
	public static Response generateRandomChart(int numXaxis, int numYaxis, int min, int max){
		Chart chart = new Chart();
		Title title = new Title();
		XAxis xAxis = new XAxis(numXaxis);
		Response response = new Response(chart, title, xAxis, numXaxis, numYaxis, min, max);
		return response;
	}
	
	public static int randomNum (int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}

}
