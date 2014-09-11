package utils;

import java.util.Random;

import service.Chart;

public class ChartUtils {
	
	public static Chart generateRandomChart(){
		return null;
	}
	
	public static int randomNum (int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}

}
