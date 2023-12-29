package com.yedam.product.command;

import java.io.IOException;
<<<<<<< HEAD

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;

public class ProductInfoControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//tiles로 끝이 나면 web.xml의 tilesdispatchservlet이 시작됨 그러면 가장 먼저 읽어들이는게 tiles.xml 
			req.getRequestDispatcher("product/productInfo.tiles").forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}

=======
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.product.service.ProductService;
import com.yedam.product.serviceImpl.ProductServiceImpl;
import com.yedam.product.vo.ProductVO;

public class ProductInfoControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String productCode = req.getParameter("productCode");
		
		ProductService svc = new ProductServiceImpl();
		ProductVO vo = svc.getProduct(productCode);
		List<ProductVO> list = svc.listLikeit();
		
		req.setAttribute("vo", vo);
		req.setAttribute("productList", list);
		RequestDispatcher rd = req.getRequestDispatcher("product/productInfo.tiles");
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
>>>>>>> branch 'master' of https://github.com/heriong93/java_master.git
