package com.yedam.product.mapper;

import java.util.List;

import com.yedam.product.vo.ProductVO;

public interface ProductMapper {
	List<ProductVO> selectList(); //상품목록 출력
	ProductVO getProduct(String pno); //단건 조회 
<<<<<<< HEAD
=======
	List<ProductVO> listLikeIt();  // 좋아요순
	
>>>>>>> branch 'master' of https://github.com/heriong93/java_master.git
}
