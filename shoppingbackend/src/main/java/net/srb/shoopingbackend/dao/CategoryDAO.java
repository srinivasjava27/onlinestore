package net.srb.shoopingbackend.dao;

import java.util.List;

import net.srb.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);
		
		
	}

