package org.hillel.it.mallspot.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private int orderId;
	private String login;
	private Date orderDate;
	private String expiryDate;

	private List<Product> lineItems = new ArrayList<Product>();

}
