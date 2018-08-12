package com.cky.billingapp;

/**
 * @author chandrakumar
 *
 */
public class InvoiceCalculator {

	public static void main(String[] args) {
		//Invoice 1
		System.out.println("\n ------------Invoice 1 ------------------------");
		Invoice invoice =new Invoice();
		invoice.addItem(new Item(1,"book", 30));
		invoice.addItem(new Item(1,"chocolate", 1));
		System.out.println("\n  Input ");
		invoice.pringInvoice();
		System.out.println("\n Output ");
		invoice.getItemWiseDetails();
		System.out.println(" ");
		invoice.getTotal();
		
		//Invoice 2
		System.out.println("\n ------------Invoice 2 ------------------------");
		
		invoice =new Invoice();
		invoice.addItem(new Item(1,"bottle of wine", 20.00));
		invoice.addItem(new Item(2,"box of headache pills", 4.00));
		invoice.addItem(new Item(1,"box of pens", 10.00));
		System.out.println("\n  Input ");
		invoice.pringInvoice();
		System.out.println("\n Output ");
		
		invoice.getItemWiseDetails();
		System.out.println(" ");
		invoice.getTotal();
		
		System.out.println("\n ---------Invoice 3--------------------------");
		
		//invoice 3
		invoice =new Invoice();
		invoice.addItem(new Item(1,"pen", 5));
		System.out.println("\n  Input ");
		invoice.pringInvoice();
		System.out.println("\n Output ");
		invoice.getItemWiseDetails();
		System.out.println(" ");
		invoice.getTotal();
		
	}

}
