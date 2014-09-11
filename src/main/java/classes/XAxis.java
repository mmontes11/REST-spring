package classes;

import java.util.ArrayList;
import java.util.List;

public class XAxis {
	
	private List<String> categories = new ArrayList<String>();

	public XAxis(List<String> categories) {
		this.categories = categories;
	}
	
	public XAxis (int numXaxis){
		this.categories.clear();
		for (int i = 0; i<numXaxis ; i++){
			this.categories.add("Category "+(i+1));
		}
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
}
