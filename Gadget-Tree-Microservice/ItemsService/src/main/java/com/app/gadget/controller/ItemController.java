package com.app.gadget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.gadget.model.Item;
import com.app.gadget.service.ItemService;

@RestController
@CrossOrigin()
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@GetMapping("/item")
	public List<Item> allItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/item/{id}")
	public Item getItem(@PathVariable("id") int id) {
		return itemService.searchItem(id);
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test from items service";
	}
}