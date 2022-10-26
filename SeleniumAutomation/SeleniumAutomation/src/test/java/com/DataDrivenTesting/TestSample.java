package com.DataDrivenTesting;

import java.io.IOException;
import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExcelDDT ed = new ExcelDDT();
		//ed.getData(testCaseName);
		ArrayList data = ed.getData("TC4");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));

	}

}
