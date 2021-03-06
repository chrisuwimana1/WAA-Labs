package com.uwimana.controller;

import java.util.List;

import com.uwimana.domain.Category;
import com.uwimana.domain.Product;
import com.uwimana.service.CategoryService;
import com.uwimana.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class ProductController {
 
	ProductService productService;
 	
	CategoryService categoryService;
 	
	// Setter based injection....
	@Autowired
	ProductController(ProductService productService,CategoryService categoryService) {
		this.categoryService =  categoryService;
		this.productService = productService;
	}
 	
    @RequestMapping(value={"/","/product"}, method = RequestMethod.GET)
    public String inputProduct(@ModelAttribute("newProduct") Product newProduct, Model model) {
 
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
        return "ProductForm";
    }

    @RequestMapping(value="/product", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("newProduct") Product product ) {
        Category category = categoryService.getCategory(product.getCategory().getId());
        product.setCategory(category);
        productService.save(product);

        return "ProductDetails";
    }


    @RequestMapping(value="/listproducts", method = RequestMethod.GET)
    public String listProducts(Model model ) {
        List<Product> list = productService.getAll();
        model.addAttribute("products",  list);

        return "ListProducts";
    }
    

    
}
