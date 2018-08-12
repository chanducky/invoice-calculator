package com.cky.billingapp;

import java.util.LinkedList;
import java.util.List;

/**
 * @author chandrakumar
 *
 */
public class Invoice {
	private List<Item> itemList=null;

	public Invoice() {
		super();
		itemList=  new LinkedList<Item>();
	}

	/**
	 * @param itemList
	 */
	public Invoice(List<Item> itemList) {
		super();
		if(itemList==null){
			this.itemList = new LinkedList<Item>();
		}else{
			this.itemList = itemList;	
		}
	}

	/**
	 * @return
	 */
	public List<Item> getItems(){
		if(itemList==null){
			this.itemList = new LinkedList<Item>();
		}

		return itemList;

	}

	/**
	 * @param item
	 */
	public void addItem(Item item){
		if(itemList==null){
			this.itemList = new LinkedList<Item>();
		}
		this.itemList.add(item);
	}

	/**
	 * Method print all the item with price tax included.
	 */
	public void getItemWiseDetails(){
		try{
			for(Item item:this.itemList){
				double finalPriceOfItem = (item.getQty() * item.getPrice()+ TaxCalculator.calculatedTaxOnItem(item));
				System.out.println(item.getQty()+" "+item.getName()+" " + formatPrinter(finalPriceOfItem));
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public void getTotal(){
		try{
			double saleTax=0.0;
			double total=0.0;

			for(Item item: this.itemList){
				double taxOnItem = TaxCalculator.calculatedTaxOnItem(item);
				saleTax+= taxOnItem;
				total+= item.getQty()*item.getPrice()+taxOnItem;
			}

			System.out.println("Sales Taxes: "+formatPrinter(saleTax));
			System.out.println("Total: "+formatPrinter(total));
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}
	
	public void pringInvoice(){
		for(Item item: this.itemList){
			System.out.println(item.getQty()+" " +item.getName() +" " +formatPrinter(item.getPrice()));	
		}
	}

	private String formatPrinter(double amount){
		return String.format("%.2f",amount);
	}
}
