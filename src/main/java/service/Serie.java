package service;

import java.util.ArrayList;
import java.util.List;
import utils.ChartUtils;

public class Serie {
	
	private String name;
	private List<Integer> data = new ArrayList<Integer>();

	public Serie(String name,int size, int min, int max){
		this.name = name;
		this.data.clear();
		for (int i = 0; i<size ; i++){
			this.data.add(ChartUtils.randomNum(min, max));
		}
	}
	
	public Serie(String name, List<Integer> data) {
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}
}
