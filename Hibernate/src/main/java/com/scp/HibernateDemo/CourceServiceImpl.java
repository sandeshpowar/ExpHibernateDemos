package com.scp.HibernateDemo;

import java.util.List;

public class CourceServiceImpl implements CourceService {

	public void processCource(List<Cource> cources) {
		// TODO Auto-generated method stub

		CourceDao dao=new CourceDevJava();
		dao.create(cources);
		List<Cource>list=dao.findAll();
		System.out.println("The Saved Cource Are------->"+list);
		
		
	}

}
