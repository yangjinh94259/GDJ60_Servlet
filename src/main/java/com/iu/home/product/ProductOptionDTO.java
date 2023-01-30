package com.iu.home.product;

public class ProductOptionDTO {

	private Long optionnum;
	private Long productnum;
	private String optionname;
	private Long optionprice;
	private Long optionamount;
	
	
	public Long getOptionnum() {
		return optionnum;
	}
	public void setOptionnum(Long optionnum) {
		this.optionnum = optionnum;
	}
	public Long getProductnum() {
		return productnum;
	}
	public void setProductnum(Long productnum) {
		this.productnum = productnum;
	}
	
	public String getOptionname() {
		return optionname;
	}
	public void setOptionname(String optionname) {
		this.optionname = optionname;
	}
	public Long getOptionprice() {
		return optionprice;
	}
	public void setOptionprice(Long optionprice) {
		this.optionprice = optionprice;
	}
	public Long getOptionamount() {
		return optionamount;
	}
	public void setOptionamount(Long optionamount) {
		this.optionamount = optionamount;
	}
	
	
	

}
