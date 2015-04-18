package com.cloudigrate.domain;

public class CloudService {
	
		private String productName;
		private int count;
		
		public CloudService(String productName, int count) {
			super();
			this.productName = productName;
			this.count = count;
		}
		
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		

}
