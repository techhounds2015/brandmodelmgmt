package com.kashitkalaecom.brandmodelmgmt.requests;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kashitkalaecom.brandmodelmgmt.models.Billing;
import com.kashitkalaecom.brandmodelmgmt.models.OrderItem;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRequest {

	
	private String orderStatus;
	private int subtotal;
	private int shippingCharges;
	private int tax;
	private int total;
	private int customerId;
	private String outletId;
	
	private List<OrderItem> orderItem;
	private Billing billing;
	
	public OrderRequest() {
	}
	
	public OrderRequest(String orderStatus, int subtotal, int shippingCharges, int tax, int total,
			int customerId, List<OrderItem> orderItem, Billing billing) {
		super();
		this.orderStatus = orderStatus;
		this.subtotal = subtotal;
		this.shippingCharges = shippingCharges;
		this.tax = tax;
		this.total = total;
		this.customerId = customerId;
		this.orderItem = orderItem;
		this.billing = billing;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getShippingCharges() {
		return shippingCharges;
	}

	public void setShippingCharges(int shippingCharges) {
		this.shippingCharges = shippingCharges;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}


	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}


	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getOutletId() {
		return outletId;
	}

	public void setOutletId(String outletId) {
		this.outletId = outletId;
	}
	
}