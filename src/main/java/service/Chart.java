package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chart {
	
	private List<Integer> data = new ArrayList<Integer>();
	
	public Chart (List<Integer> data){
		this.data = data;
	}
	
	public Chart (int size, int min, int max){
		data.clear();
		for (int i = 0; i<size ; i++){
			data.add(randomNum(min, max));
		}
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}
	
	private static int randomNum (int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}
