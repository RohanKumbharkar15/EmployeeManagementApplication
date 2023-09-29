package com.dao;

import java.util.List;

import com.model.register;

public interface registerDao {
	public int create(List<register> lst);

	public List<register> retrive(int regNo);

	public int delete(List<register> lst);

	public int update(List<register> lst);

	List<register> displayAll();

}