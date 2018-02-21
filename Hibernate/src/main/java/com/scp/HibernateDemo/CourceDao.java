package com.scp.HibernateDemo;

import java.util.List;

public interface CourceDao {
	
	public abstract void create(List<Cource>listCources);
	public abstract List findAll();

}
