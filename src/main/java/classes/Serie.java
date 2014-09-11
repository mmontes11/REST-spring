package classes;

import java.util.ArrayList;
import java.util.List;
import utils.ChartUtils;

public class Serie {
	
	private String name;
	private String linecolor;
	private List<DataSerie> data = new ArrayList<DataSerie>();

	public Serie(String name,int numXaxis, int min, int max){
		this.name = name;
		this.linecolor = ChartUtils.randomColor();
		this.data.clear();
		for (int i = 0; i<numXaxis ; i++){
			this.data.add(new DataSerie(ChartUtils.randomColor(),ChartUtils.randomNum(min, max)));
		}
	}
	
	public Serie(String name, List<DataSerie> data) {
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return linecolor;
	}

	public void setColor(String color) {
		this.linecolor = color;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}

	public List<DataSerie> getData() {
		return data;
	}

	public void setData(List<DataSerie> data) {
		this.data = data;
	}
}
