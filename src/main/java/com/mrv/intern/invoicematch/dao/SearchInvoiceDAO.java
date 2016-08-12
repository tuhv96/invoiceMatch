package com.mrv.intern.invoicematch.dao;

import java.util.List;

import com.mrv.intern.invoicematch.model.SearchInvoice;
/**
 * 
 * @author tuhv
 *
 */
public interface SearchInvoiceDAO {
	public List<SearchInvoice> listInvoice();
	public List<SearchInvoice> listTracking();
	public List<SearchInvoice> listOrder();
	/**
	 * list all vendor where INV_TYP_CD='COGS' and INV_TYP_CD='FRT'
	 * @return
	 */
	public List<SearchInvoice> listVendor();
	/**
	 * list invoice, tracking, vendor,invoice type, invoice Date, invoice AMT on data table
	 * @return list
	 */
	public List<SearchInvoice> list();
	/**
	 * @param VendorID
	 * @param InvoiceID
	 * @param TrackingID
	 * @param OrderID
	 * @return
	 */
	public List<SearchInvoice> searchInvoice(String VendorID,String InvoiceID,String TrackingID,String OrderID);

}
