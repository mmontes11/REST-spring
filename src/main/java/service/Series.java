package service;

import java.util.ArrayList;
import java.util.List;

public class Series {
	
	private List<Serie> series = new ArrayList<Serie>();

	public Series(List<Serie> series) {
		this.series = series;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}
	
}
