package com.rockers.api.dao;
import java.util.List;

public interface Crud<T extends Object> {

	T findOne(Long id);
	String save(T t);
	List<T> listAll();
	void delete(Long id);
}
