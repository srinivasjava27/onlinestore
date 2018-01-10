package net.srb.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.srb.shoopingbackend.dao.CategoryDAO;
import net.srb.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {
	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescritpion("this is Descritpion for Television");
		category.setImageURL("");

		categories.add(category);

		category.setId(2);
		category.setName("mobile");
		category.setDescritpion("this is Descritpion for Mobile");
		category.setImageURL("");

		categories.add(category);

		category.setId(3);
		category.setName("Laptop");
		category.setDescritpion("this is Descritpion for Laptop");
		category.setImageURL("");

		categories.add(category);

	}

	@Override
	public List<Category> list() {

		return categories;
	}

	@Override
	public Category get(int id) {
		for (Category category : categories) {
			if (category.getId() == id)
				return category;

		}
		return null;
	}

	
}
