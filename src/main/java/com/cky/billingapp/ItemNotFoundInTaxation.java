package com.cky.billingapp;

/**
 * @author chandrakumar
 *
 */
public class ItemNotFoundInTaxation extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 ItemNotFoundInTaxation(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	 ItemNotFoundInTaxation(String message, Throwable cause) {
		super(message, cause);
	}

	ItemNotFoundInTaxation(String message) {
		super(message);
	}

	ItemNotFoundInTaxation(Throwable cause) {
		super(cause);
	}
	
}
