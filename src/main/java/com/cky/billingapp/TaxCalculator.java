package com.cky.billingapp;

import java.util.HashMap;

/**
 * @author chandrakumar
 *
 */
public final class TaxCalculator {
	private static  HashMap<String,Double> taxation = null;

	static 
	{
		taxation = new HashMap<String, Double>();
		taxation.put("book", 20.0);
		taxation.put("chocolate", 20.0);
		taxation.put("bottle of wine", 20.0);
		taxation.put("box of headache pills", 0.0);
		taxation.put("box of pens", 20.0);
		taxation.put("pen", 20.00);
		
	}
	
	/**
	 * @param item
	 * @return calculated sale tax on item
	 * @throws ItemNotFoundInTaxation if item not found in taxation list
	 */
	public static Double calculatedTaxOnItem(Item item) throws ItemNotFoundInTaxation{
		if(! taxation.containsKey(item.getName())){
			throw new ItemNotFoundInTaxation(" Item ( "+item.getName()+" ) not found in taxation list,Please update taxation detail.");
		}
		double price =  item.getPrice();
		return (item.getQty() * price * taxation.get(item.getName())/100); 
	}
}
