package classes;

import java.util.ArrayList;
import java.util.List;

public class Response {
	
	private Chart chart;
	private Title title;
	private XAxis xAxis;
	private List<Serie> series = new ArrayList<Serie>();
	
	public Response(Chart chart, Title title, XAxis xAxis, List<Serie> series) {
		this.chart = chart;
		this.title = title;
		this.xAxis = xAxis;
		this.series = series;
	}
	
	public Response (Chart chart, Title title, XAxis xAxis, int numXaxis, int numYaxis, int min, int max){
		this.chart = chart;
		this.title = title;
		this.xAxis = xAxis;
		this.series.clear();
		for(int i = 0; i<numYaxis ; i++){
			this.series.add(new Serie("Serie "+(i+1), numXaxis, min, max));
		}
	}

	public Chart getChart() {
		return chart;
	}

	public void setChart(Chart chart) {
		this.chart = chart;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public XAxis getxAxis() {
		return xAxis;
	}

	public void setxAxis(XAxis xAxis) {
		this.xAxis = xAxis;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}
}
