package com.nep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nep.data.ProductRepository;
import com.nep.models.Product;

@Controller
public class ControllerClass {
	@Autowired
	ProductRepository productRepository;

	@RequestMapping(value="/")
	public String index(ModelMap modelMap) {
		List<Product> products = (List<Product>) productRepository.findAll();
		modelMap.put("products", products);
		return "index";
	}
	
	@RequestMapping(value="/product/{id}")
	public String product(@PathVariable String id, ModelMap modelMap) {
		try {
			long idInLong = Long.parseLong(id);
			if(productRepository.exists(idInLong)) {
				Product product = productRepository.findOne(idInLong);
				modelMap.put("product", product);
			}
		} catch (NumberFormatException e) {
			
		}
		return "product";
	}
	
	@RequestMapping(value="/search")
	public String search(@RequestParam(required=false) String productName, ModelMap modelMap) {
		List<Product> products;
		if(productName == null) {
			// Show all products
			products = (List<Product>) productRepository.findAll();
			modelMap.put("products", products);
		} else {
			// Show the search products
			products = productRepository.findByNameIgnoreCase(productName);
			modelMap.put("products", products);
		}
		return "search";
	}
	
	@RequestMapping(value="/addproduct")
	public String addProduct(
			@RequestParam(required=false) String name,
			@RequestParam(required=false) String price,
			@RequestParam(required=false) String file,
			@RequestParam(required=false) String instock,
			ModelMap modelMap
			) {
		boolean addSuccessful = false;
		boolean addFailed = false;
		if(name==null && price==null 
				&& file==null && instock==null) {
			addSuccessful = false;
			addFailed = false;
		} else {
			if(name==null || price==null 
					|| file==null || instock==null) {
				addSuccessful = false;
				addFailed = true;
			} else {
				try {
					double priceInDouble = Double.parseDouble(price);
					boolean instockInBoolean = Boolean.parseBoolean(instock);
					Product product = new Product(name, priceInDouble, 
							file, instockInBoolean);
					productRepository.save(product);
					addSuccessful = true;
					addFailed = false;
				} catch (NumberFormatException e) {
					addSuccessful = false;
					addFailed = true;
				}
			}
		}
		modelMap.put("successful", addSuccessful);
		modelMap.put("failed", addFailed);
		return "addproduct";
	}
	
	@RequestMapping(value="removeproduct")
	public String removeProduct(
			@RequestParam(required=false) String id
			) {
		if(id==null) {
			
		} else {
			try {
				long idInLong = Long.parseLong(id);
				Product product = productRepository.findOne(idInLong);
				if(product==null) {
					
				} else {
					productRepository.delete(product);
				}
			} catch (NumberFormatException e) {
				
			}
		}
		return "removeproduct";
	}
	
	@RequestMapping(value="/findproduct")
	public String findProduct(
			@RequestParam(required=false) String id
			) {
		if(id == null) {
			return "findproduct";
		} else {
			try {
				long idInLong = Long.parseLong(id);
				if(productRepository.exists(idInLong)) {
					return "redirect:/updateproduct/" + idInLong;
				} else {
					return "findproduct";
				}
			} catch (NumberFormatException e) {
				return "findproduct";
			}
		}
	}
	
	@RequestMapping(value="/updateproduct/{id}")
	public String updateProduct(
			@PathVariable String id,
			@RequestParam(required=false) String name,
			@RequestParam(required=false) String price,
			@RequestParam(required=false) String file,
			@RequestParam(required=false) String instock,
			ModelMap modelMap
			) {
		try {
			long idInLong = Long.parseLong(id);
			Product product = productRepository.findOne(idInLong);
			if(product == null) {
				return "redirect:/findproduct";
			} else {
				if(name==null && price==null
						&& file==null && instock==null) {
					
				} else {
					if(name==null || price==null
						|| file==null || instock==null) {
						
					} else {
						try {
							double priceInDouble = Double.parseDouble(price);
							boolean instockInBoolean = Boolean.parseBoolean(instock);
							
							product.setName(name);
							product.setPrice(priceInDouble);
							product.setPicFile(file);
							product.setInStock(instockInBoolean);
							productRepository.save(product);
							modelMap.put("product", product);
							return "updateproduct";
						} catch (NumberFormatException e) {
							
						}
					}
				}
				modelMap.put("product", product);
				return "updateproduct";
			}
		} catch (NumberFormatException e) {
			return "redirect:/findproduct";
		}
	}
}













