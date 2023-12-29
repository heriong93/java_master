package com.yedam.product.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;
import com.yedam.product.service.ProductService;
import com.yedam.product.serviceImpl.ProductServiceImpl;
import com.yedam.product.vo.ProductVO;

public class ProductListControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		ProductService svc = new ProductServiceImpl();
		List<ProductVO> list = svc.productList();

		req.setAttribute("ProductList", list); // 속성 값 추가하는 것

		// 페이지 이동(foward)
		RequestDispatcher rd = req.getRequestDispatcher("product/productList.tiles"); // 이동할 페이지 tiles.xml에 먼저 지정해줘야함
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

	}

