package com.example.ifaces;

import java.util.List;

public interface CrudRepository<T> {

		
		public List<T> findAll();
		
}
