package com.yedam.product.service;

import java.util.List;

import com.yedam.product.vo.ProductVO;

public interface ProductService {
	// 목록, 단건조회.
	List<ProductVO> productList(); //목록
	ProductVO getProduct(String pno);  //단건조회
<<<<<<< HEAD
=======
	List<ProductVO> listLikeit();
>>>>>>> branch 'master' of https://github.com/heriong93/java_master.git
}
