package com.scp.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
			
		List<Cource>cources=new ArrayList<Cource>(10);
		
		Cource c1=new Cource();
		c1.setId(77);
		c1.setName("Sandesh");
		c1.setAddress("Chandgad");

		Cource c2=new Cource();
		c2.setId(78);
		c2.setName("Sandy");
		c2.setAddress("Gadhinglaj");
		
		Cource c3=new Cource();
		c1.setId(79);
		c1.setName("cs");
		c1.setAddress("Kolhapur");
		
		
		CourceService service=new CourceServiceImpl();
		service.processCource(cources);
	}

}
