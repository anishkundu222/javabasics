package com.training.cg;

public class ProductDemo {
	

		public static void main(String[] args) {
			
			product prod1 = new product();
			prod1.setProdId("P1");
			prod1.setProdName("0001");
			prod1.setProdDesc("grade A");
			prod1.setPrice(4000);
			
			product prod2 = new product();
			prod2.setProdId("P2");
			prod2.setProdName("0002");
			prod2.setProdDesc("grade B");
			prod2.setPrice(2000);
			
			product prod3 = new product();
			prod3.setProdId("P3");
			prod3.setProdName("0003");
			prod3.setProdDesc("grade C");
			prod3.setPrice(1000);
			
			product prod4 = new product();
			prod4.setProdId("P4");
			prod4.setProdName("0004");
			prod4.setProdDesc("grade D");
			prod4.setPrice(700);
			
			product prod5 = new product();
			prod5.setProdId("P5");
			prod5.setProdName("0005");
			prod5.setProdDesc("grade E");
			prod5.setPrice(500);

}
		int[] price = new int[] {prod1.getPrice(),prod2.getPrice(),prod3.getPrice(),prod4.getPrice(),prod5.getPrice()};
		int costliest = 0;
		int i;
		for(i=0;i<5;i++) {
			if(price[i]>price[costliest]) {
				costliest = i;
			}
		}
		
}
