package com.iu.home.product;

import java.util.List;

public class ProductService {
	
	//1. 결합도가 높다(강하다)
	private ProductDAO productDAO = new ProductDAO();
	
	{	//초기화 블럭
		this.productDAO = new ProductDAO();
	}
	
	//2. 생성자
	public ProductService() {
			this.productDAO = new ProductDAO();
	}
	
	//3.setter, getter
	//결합도가 낮다
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public int setAddProduct(ProductDTO productDTO, List<ProductOptionDTO> ar) throws Exception{
		Long productNum = productDAO.getProductNum();
		productDTO.setProductnum(productNum);
		int result = productDAO.setAddProduct(productDTO);
		
		for(ProductOptionDTO productOptionDTO : ar) {
			productOptionDTO.setProductnum(productNum);
			result = productDAO.setAddProductOption(productOptionDTO);	
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		ProductDAO productDAO = new ProductDAO();
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductname("product1");
		productDTO.setProductdetail("detail1");
		
		ProductOptionDTO productOptionDTO = new ProductOptionDTO();
		productOptionDTO.setOptionname("optionname1");
		productOptionDTO.setOptionprice(100L);
		productOptionDTO.setOptionamount(10L);
		productOptionDTO.setProductnum(null);
		
		ProductOptionDTO productOptionDTO2 = new ProductOptionDTO();
		productOptionDTO2.setOptionname("optionname2");
		productOptionDTO2.setOptionprice(200L);
		productOptionDTO2.setOptionamount(20L);
		productOptionDTO2.setProductnum(null);
		
		try {
			Long num = productDAO.getProductNum();
			
			productDTO.setProductnum(num);
			
			int result = productDAO.setAddProduct(productDTO);
		
			productOptionDTO.setProductnum(num);
			
			if(result > 0) {
				productDAO.setAddProductOption(productOptionDTO);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
