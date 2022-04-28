package com.example.ifaces;

import java.util.*;

public interface CrudeRepository<T> {
	
	public int add(T obj);
	public List<T> findAll();
	public int remove(int id);
	public T findById(int id);
	public int update(int Id, T obj);

}
