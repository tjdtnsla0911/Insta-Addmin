package com.example.demo.Repository;

import java.util.List;

import com.example.demo.model.Boan;
import com.example.demo.model.User;

public interface addminRepository {
	public List<User> addminUserList();
	
	public List<Boan> addminBoan();
	
	public void addminBoanUpdate(int numbering);

}
