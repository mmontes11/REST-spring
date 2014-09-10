package service;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	private List<String> list;

	public Test() {
		this.list = new ArrayList<String>() {{ add("1"); add("2"); }};;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
}
