package com.yedam.product.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DataSource;
import com.yedam.product.mapper.ProductMapper;
import com.yedam.product.service.ProductService;
import com.yedam.product.vo.ProductVO;


public class ProductServiceImpl implements ProductService {
	SqlSession session = DataSource.getInstance().openSession(true);
	ProductMapper mapper = session.getMapper(ProductMapper.class);   //이 규칙은 어떻게 가져오는지 알수없음.그냥 이대로 씀 
	
	@Override
	public List<ProductVO> productList() {
		return mapper.selectList();
	}
	@Override
	public ProductVO getProduct(String pno) {
		return mapper.getProduct(pno);
	}
	
}
