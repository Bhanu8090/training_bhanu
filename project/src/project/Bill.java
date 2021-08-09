package project;

import java.util.Scanner;

public class Bill {


	float calculateBill(float quantity,float price) {
		return quantity*price;
	}
	
	float calculateBill(float quantity,float price,int gst) {
		float amount = calculateBill(quantity, price);
		return amount+=(amount*gst/100);
	}
	
	float calculateGst(float amount,int gst) {		
		return (amount*gst/100);
	}
	

}

