package com.computer.store.admin.controller.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.computer.store.service.ProductService;

@WebServlet("/admin/delete_product")
public class ProductDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductDelete() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService productService = new ProductService(request, response);
		productService.deleteProduct();
	}


}
