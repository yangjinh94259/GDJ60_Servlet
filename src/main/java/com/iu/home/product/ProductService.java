package com.iu.home.product;

public class ProductService {

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
