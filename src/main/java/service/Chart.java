package service;

import utils.ChartUtils;


public class Chart {
	
	private String type;
	private static String[] chartTypes = 
			new String[]{"line","spline","area","areaspline","column","bar","pie","scatter"};

	public Chart(String type) {
		this.type = type;
	}
	
	public Chart() {
		int index = ChartUtils.randomNum(0, Chart.chartTypes.length - 1);
		this.type = Chart.chartTypes[index];
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
