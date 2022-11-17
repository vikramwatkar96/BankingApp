package com.vikram.Services;

import java.util.List;

public interface DatabaseServices<T> {
	
	public T saveEntity(T entity);
	public T updateEntity(T entity);
	public void deleteEntity(int id);
	public List<T> getEntities();
}
